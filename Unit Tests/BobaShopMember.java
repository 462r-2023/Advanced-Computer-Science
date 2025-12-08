public class BobaShopMember {
    private String name;
    private boolean[] loyaltyCredits;

    public BobaShopMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (!loyaltyCredits[i]) {
                loyaltyCredits[i] = true;
                return;
            }
        }
    }

    public int countLoyaltyCredits() {
        int credits = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i]) {
                credits++;
            }
        }
        return credits;
    }

    public String determineMembershipStatus() {
        int credits = countLoyaltyCredits();
        if (credits >= 6) {
            return "Gold Member";
        }
        if (credits >= 3) {
            return "Silver Member";
        }
        return "Plus Member";
    }

    public String loyaltyHistory() {
        String history = "Loyalty History: [";
        for (int i = 0; i < countLoyaltyCredits(); i++) {
            history += "X, ";
        }
        for (int i = countLoyaltyCredits(); i < loyaltyCredits.length; i++) {
            history += "-, ";
        }
        return history.substring(0, history.length() - 2) + "]";
    }

    public String toString() {
        return name + " (" + determineMembershipStatus() + "), " + loyaltyHistory();
    }

    public boolean equals(BobaShopMember other) {
        if (!name.equals(other.name) || loyaltyCredits.length != other.loyaltyCredits.length) {
            return false;
        }
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] != other.loyaltyCredits[i]) {
                return false;
            }
        }
        return true;
    }


}
