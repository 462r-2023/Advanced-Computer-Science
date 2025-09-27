public class Cat { // 1. changed "public" to lowercase // 2. changed "Cats" to "Cat"
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;

	// 2-Parameter Constructor
	public Cat(String name, String breed) { // 3. changed "Cat" to UpperCamelCase // 4. added
											// "breed" parameter
		this.name = name; // 5. replaced "name" with "this.name"
		this.breed = breed; // 6. replaced "breed" with "this.breed"
		this.isHungry = true; // 7. replaced "yes" with "true"
		livesRemaining = 9;
	}

	public String getName() { // 8. changed return type to String
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() { // 24. added the getBreed() method
		return breed;
	}

	public void setBreed(String breed) { // 25. added the setBreed() method
		this.breed = breed;
	}

	public boolean getIsHungry() { // 9. changed return type to boolean // 10. changed "getIsHungry"
									// to lowerCamelCase
		return isHungry;
	}

	public void feed() { // 11. changed return type to void
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) // 12. changed string
																				// comparison to
																				// .equals()
				&& this.livesRemaining == other.livesRemaining; // 13. changed = to ==
	}

	public String toString() {
		return name + " is of breed " + breed + " and has " + livesRemaining // 14. changed from
																				// System.out.println
																				// to return
				+ " lives remaining.";
	}
}
