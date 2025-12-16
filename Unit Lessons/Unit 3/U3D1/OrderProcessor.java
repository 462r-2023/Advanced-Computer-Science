public class OrderProcessor {

    /*
     * processCustomerOrder(Item[] items, double taxRate) was split into getPremiumItemsList(Item[]
     * items) and calculateSubtotal(Item[] items). The former further uses trimArray(String[]
     * expensiveItemsTemp, int premiumCount). In additon, Item now has getTotal(), isExpensive(),
     * and toString() methods.
     */

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        String[] expensiveItems = getPremiumItemsList(items);
        double subtotal = calculateSubtotal(items);
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + expensiveItems.length);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    public static String[] trimArray(String[] expensiveItemsTemp, int premiumCount) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
        return expensiveItems;
    }

    public static String[] getPremiumItemsList(Item[] items) {
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            if (item.isExpensive()) {
                expensiveItemsTemp[premiumCount] = item.getName();
                premiumCount++;
            }
        }

        return trimArray(expensiveItemsTemp, premiumCount);
    }

    public static double calculateSubtotal(Item[] items) {
        double subtotal = 0;
        for (Item item : items) {
            subtotal += item.getTotal();
            System.out.println(item);
        }
        return subtotal;
    }
}
