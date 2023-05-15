public class SalesPerson {
    private String id;
    private Sales[] salesHistory;
    private int count;

    public SalesPerson(String id) {
        this.id = id;
        this.salesHistory = new Sales[100];
        this.count = 0;
    }

    public SalesPerson(String id, Sales[] salesHistory, int count) {
        this.id = id;
        this.salesHistory = salesHistory;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public Sales getSalesHistory(int i) {
        return salesHistory[i];
    }

    public int getCount() {
        return count;
    }

    public void setSalesHistory(Sales sales) {
        salesHistory[count] = sales;
        count++;
    }

    public double calcTotalSales() {
        double totalSales = 0;
        for (int i = 0; i < count; i++) {
            totalSales += salesHistory[i].getValue() * salesHistory[i].getQuantity();
        }
        return totalSales;
    }
}
