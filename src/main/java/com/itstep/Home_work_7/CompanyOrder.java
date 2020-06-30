package com.itstep.Home_work_7;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by utilizator on 6/3/20.
 */
public class CompanyOrder implements Order {
    protected Company company;
    protected  List<Item> items;


    public CompanyOrder( Company company, List<Item> items) {
        this.company = company;
        this.items = items;
    }

    public List<Item> filterItemsByType(Catalogue type) {
        List<Item> filteredList = new ArrayList<>();
        for (Item item : items) {
            if (item.getType() == type) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "CompanyOrder{" +
                "items=" + items +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public double sum() {
        double temp = 0;
        for(Item i: items){
            temp= i.getPrice()+temp;
        }return temp;
    }

    @Override
    public int count() {
        return items.size();
    }

    public double sum(Item item){
        return 0;
    }
    public double count(Item item){

        return 0;
    }
}
