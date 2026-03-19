// a class for all of the battle engine functions
// this class will be used to validate the type, element, weakness, health, and attack of the
// monsters
// there's also methods that will be used to calculate the damage and the health of the monsters
// and apply the type advantage multipliers

import java.util.ArrayList;
import java.util.Random;

public class BattleEngine {

    // to-do: validateStats
    // checks if the monster stats are valid
    // the total combined stats of the monster should not exceed 250
    public static boolean validateStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null!");
        }
        return monster.health >= 0 && monster.attack >= 0 && monster.speed >= 0
                && monster.defense >= 0
                && monster.health + monster.attack + monster.speed + monster.defense <= 250;
    }

    // to-do: validateElement
    // checks if the monster element is valid
    // the only valid types allowed are "Fire", "Water", "Earth", and "Air"
    public static boolean validateElement(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null!");
        }
        if (monster.getElement() == null) {
            monster.setElement(ElementType.FIRE);
            return false;
        }
        return true;
    }

    // to-do: correctStats
    // checks if stats are invalid
    // fixes them so they are valid, however you choose
    public static void correctStats(Monster monster) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null!");
        }
        monster.health = Math.max(monster.health, 0);
        monster.attack = Math.max(monster.attack, 0);
        monster.speed = Math.max(monster.speed, 0);
        monster.defense = Math.max(monster.defense, 0);
        while (monster.health + monster.attack + monster.speed + monster.defense > 250) {
            monster.health = Math.max(monster.health - 1, 0);
            monster.attack = Math.max(monster.attack - 1, 0);
            monster.speed = Math.max(monster.speed - 1, 0);
            monster.defense = Math.max(monster.defense - 1, 0);
        }
    }

    // to-do: startBattle
    // each monster takes turn attacking the other until a monster's hp reaches 0.
    // It returns the
    // winning monster.
    public static Monster startBattle(Monster monster1, Monster monster2) {
        // Remove invalid monster
        if (!((validateStats(monster1) && validateElement(monster1))
                || (validateStats(monster2) && validateElement(monster2)))) {
            return null;
        }
        if (!(validateStats(monster1) && validateElement(monster1))) {
            return monster2;
        }
        if (!(validateStats(monster2) && validateElement(monster2))) {
            return monster1;
        }

        // Save health
        int monster1Health = monster1.getHealth();
        int monster2Health = monster2.getHealth();

        // Display
        System.out.println("\t" + monster1.getName() + " vs " + monster2.getName());
        displayStatus(monster1, monster2);

        // Pick starting monster
        Monster currentMonster;
        if (monster1.getSpeed() > monster2.getSpeed()) {
            currentMonster = monster1;
        } else if (monster1.getSpeed() > monster2.getSpeed()) {
            currentMonster = monster2;
        } else {
            Random rng = new Random();
            if (rng.nextInt() % 2 == 0) {
                currentMonster = monster1;
            } else {
                currentMonster = monster2;
            }
        }
        System.out.println(currentMonster.getName() + " starts!");

        // Loop through fight
        while (monster1.getHealth() > 0 && monster2.getHealth() > 0) {
            if (currentMonster.equals(monster1)) {
                monster1.attack(monster2);
                currentMonster = monster2;
            } else {
                monster2.attack(monster1);
                currentMonster = monster1;
            }
            displayStatus(monster1, monster2);
        }

        // Return winner
        if (monster1.getHealth() <= 0 && monster2.getHealth() <= 0) {
            System.out.println("No one wins!\n");
            currentMonster = null;
        } else if (monster1.getHealth() <= 0) {
            System.out.println(monster2.getName() + " wins!\n" + monster2.victoryNoise() + "\n");
            currentMonster = monster2;
        } else {
            System.out.println(monster1.getName() + " wins!\n" + monster1.victoryNoise() + "\n");
            currentMonster = monster1;
        }

        // Restore health
        monster1.setHealth(monster1Health);
        monster2.setHealth(monster2Health);
        monster1.hasUsedDoubleDown = false;
        monster2.hasUsedDoubleDown = false;

        return currentMonster;
    }

    public static Monster battleEveryone(ArrayList<Monster> monsters) {
        Monster currentMonster = monsters.get(0);
        for (int i = 1; i < monsters.size(); i++) {
            currentMonster = startBattle(currentMonster, monsters.get(i));
        }
        return currentMonster;
    }

    // to-do: displayStatus
    // method prints out the current health of each monster.
    public static void displayStatus(Monster monster, Monster opponent) {
        if (monster == null) {
            throw new IllegalArgumentException("Monster cannot be null!");
        }
        System.out.println(monster.getName() + ": " + monster.getHealth() + "hp || "
                + opponent.getName() + ": " + opponent.getHealth() + "hp");
    }

}
