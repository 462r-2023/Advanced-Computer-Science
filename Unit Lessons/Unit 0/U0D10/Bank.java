public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }

    public double getEmployeeRatio() {
        return (double) numberOfLoanOfficers / numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers = Math.max(0, numberOfLoanOfficers - numberToFire);
        } else {
            numberOfTellers = Math.max(0, numberOfTellers - numberToFire);
        }
    }

    public void transferEmployee(boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers--;
            numberOfTellers++;
        } else {
            numberOfTellers--;
            numberOfLoanOfficers++;
        }
    }

    public int getTotalSalary() {
        return 75000 * numberOfLoanOfficers + 45000 * numberOfTellers;
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers + " loan officers and " + numberOfTellers
                + " tellers.";
    }

    public boolean equals(Bank other) {
        return numberOfLoanOfficers == other.numberOfLoanOfficers
                && numberOfTellers == other.numberOfTellers;
    }
}
