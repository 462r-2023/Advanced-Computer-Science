public class BobaShopTester {
    public static void main(String[] args) {
        BobaShop bobaShop = new BobaShop("Boba Bliss", 10);
        System.out.println(bobaShop.toString());
        System.out.println("Boba shop is full: " + bobaShop.isFull());

        for (int i = 0; i < 11; i++) {
            bobaShop.registerMember(new BobaShopMember("John Boba"));
            System.out.println(bobaShop.toString());
            System.out.println("Boba shop is full: " + bobaShop.isFull());
        }

        System.out.println("Member 1 loyalty credits: "
                + bobaShop.getRegisteredMembers()[0].countLoyaltyCredits());
        bobaShop.getRegisteredMembers()[0].grantLoyaltyCredit();
        System.out.println("Member 1 loyalty credits: "
                + bobaShop.getRegisteredMembers()[0].countLoyaltyCredits());
        System.out.println(bobaShop.toString());
        System.out.println(
                "Can delete John Boba: " + bobaShop.deleteMember(new BobaShopMember("John Boba")));
        System.out.println(bobaShop.toString());
        System.out.println(
                "Can delete Joe Boba: " + bobaShop.deleteMember(new BobaShopMember("Joe Boba")));
    }
}
