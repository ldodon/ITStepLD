package com.itstep.Home_work_7;
import java.util.Random;

/**
 * Created by utilizator on 5/15/20.
 */
public class Item {
    private long id;
    private String title;
    private Catalogue type;
    private double price;
    Random random =new Random();
    public Item(String title,Catalogue type, double price){
        this.type=type;
        this.id= random.nextInt();
        this.title=title;
        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Catalogue getType() {
        return type;
    }

    public void setType(Catalogue type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
