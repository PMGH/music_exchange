package com.example.peter.stevesmusicexchange.store;

import com.example.peter.stevesmusicexchange.store.behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by Peter on 28/10/2017.
 */

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void add(Sellable item){
        stock.add(item);
    }

    public void remove(Sellable item){
        stock.remove(item);
    }

    public double calculateProfit(){
        double total = 0;

        for(Sellable item : stock){
            total += item.calculateMarkup();
        }

        return total;
    }

    public double calculateOutgoing(){
        double total = 0;
        for (Sellable item : stock){
            total += item.getBoughtPrice();
        }

        return total;
    }

    public int stockCount(){
        return stock.size();
    }

//    public int stockCountByType(String instrumentType){
//        String rootPackage = "com.example.peter.stevesmusicexchange.store.";
//        int count = 0;
//
//        for (Sellable item : stock){
//            String instrumentClass = item.getClass().getName();
//
//            if (item.getClass().getName().contains("accessories")){
//                if (instrumentClass.equals(rootPackage + "accessories." + instrumentType)){
//                    count++;
//                }
//            }
//
//            if (item.getClass().getName().contains("instruments")){
//                if (instrumentClass.equals(rootPackage + "instruments." + instrumentType)){
//                    count++;
//                }
//            }
//
//        }
//
//        return count;
//    }

    public int stockCountByType(String instrumentType){
        int count = 0;

        for (Sellable item : stock){
            String instrumentClass = item.getClass().getName();
            String itemClass = resolvePackagePath(instrumentType, item);

            if (instrumentClass.equals(itemClass)){
                count++;
            }
        }

        return count;
    }

    public String resolvePackagePath(String instrumentType, Sellable item){
        String rootPackagePath = "com.example.peter.stevesmusicexchange.store.";
        String instrumentClass = item.getClass().getName();

        if (item.getClass().getName().contains("accessories")){
            String accessoryPath = rootPackagePath + "accessories." + instrumentType;
            return accessoryPath;
        }

        if (item.getClass().getName().contains("instruments")){
            String instrumentPath = rootPackagePath + "instruments." + instrumentType;
            return instrumentPath;
        }

        return "Error: Path failed to resolve";
    }

}
