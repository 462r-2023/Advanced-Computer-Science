public class BobaShop {
    private String shopName;
    private BobaShopMember[] registeredMembers;

    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        registeredMembers = new BobaShopMember[initialCapacity];
    }

    public String getShopName() {
        return shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        BobaShopMember[] newRegisteredMembers = new BobaShopMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            newRegisteredMembers[i] = registeredMembers[i];
        }
        registeredMembers = newRegisteredMembers;
    }

    public void registerMember(BobaShopMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                return;
            }
        }
        increaseCapacity();
        registeredMembers[registeredMembers.length / 2] = member;
    }

    public String toString() {
        String str = "== " + shopName + " Members ==\n";
        int counter = 0;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                counter++;
                str += counter + ".) " + registeredMembers[i].toString() + "\n";
            }
        }
        return str;
    }

    public boolean deleteMember(BobaShopMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null && registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}
