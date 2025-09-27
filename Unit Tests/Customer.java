public class Customer {
    private String name;
    private String address;
    private int rewardPoints;

    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Reward Points: "
                + rewardPoints;
    }

    public boolean equals(Customer other) {
        return name.equals(other.name) && address.equals(other.address)
                && rewardPoints == other.rewardPoints;
    }

    public void boostPoints(double percentage) {
        rewardPoints += (int) (rewardPoints * percentage / 100.0);
    }
}
