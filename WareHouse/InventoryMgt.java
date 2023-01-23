package WareHouse;

import java.util.ArrayList;

public class InventoryMgt {
    private ArrayList<Stock> stockUnit;

    public InventoryMgt(){
        this.stockUnit = new ArrayList<>();
    }

    public ArrayList<Stock> getStockUnit(){
        return stockUnit;
    }

    public boolean addNewStock(String stockName, int quantity){
        if(findStock(stockName) == null){
            stockUnit.add(new Stock(stockName, quantity));
            return true;
        }
        return false;
    }
    public boolean returnedItems(String stockName, int quantity){
        Stock exitingStock = findStock(stockName);
        if(exitingStock != null){
            exitingStock.Stock

        }

    }

    public Stock findStock(String stockName){
        for(Stock sku: stockUnit){
            if(sku.equals(stockName)){
                return sku;
            }
        }
        return null;
    }

}
