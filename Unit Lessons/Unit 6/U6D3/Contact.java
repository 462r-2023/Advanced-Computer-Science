public class Contact implements Comparable {
    public String firstName;
    public String lastName;
    public String telephoneNumber;

    public Contact(String firstName, String lastName, String telephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        setTelephoneNumber(telephoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        if (telephoneNumber.length() != 12) {
            throw new IllegalArgumentException("Incorrect phone number length.");
        }
        if (telephoneNumber.charAt(3) != '-' || telephoneNumber.charAt(7) != '-') {
            throw new IllegalArgumentException("Phone number missing dashes.");
        }
        /*
         * try { int phoneNumber = Integer.parseInt(telephoneNumber.substring(0, 3) +
         * telephoneNumber.substring(4, 7) + telephoneNumber.substring(8, 12)); } catch (Exception
         * e) { throw new IllegalArgumentException("String did not contain proper numbers."); }
         */
        this.telephoneNumber = telephoneNumber;
    }

    public int compareTo(Object other) {
        return compareTo((Contact) other);
    }

    public int compareTo(Contact other) {
        if (!firstName.equals(other.firstName)) {
            return firstName.compareTo(other.firstName);
        }
        if (!lastName.equals(other.lastName)) {
            return lastName.compareTo(other.lastName);
        }
        return telephoneNumber.compareTo(other.telephoneNumber);
    }

    public String toString() {
        return firstName + " " + lastName + "\t\t" + telephoneNumber;
    }
}
