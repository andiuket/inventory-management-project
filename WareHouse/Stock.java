package WareHouse;


public class Stock {
    private String sku;
    private static int quantity = 0;

    public Stock(String sku, int qty){
        this.sku = sku;
        Stock.addQuantity(qty);
    }

    public String getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }
    public static void addQuantity(int qty){
        quantity += qty;
    }

    public static void supplied(int qty){
        quantity -= qty;
    }
}
