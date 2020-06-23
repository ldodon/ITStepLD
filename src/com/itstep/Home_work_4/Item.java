package com.itstep.Home_work_4;

import java.util.Random;

/**
 * Created by utilizator on 5/15/20.
 */
public class Item {
    long id;
    public String title;
    public Catalogue type;
    Random random =new Random();
    public Item(String title,Catalogue type){
        this.type=type;
        this.id= random.nextInt();
        this.title=title;

    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
