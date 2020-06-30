package com.itstep.Home_work_7;
import java.util.Map;

/**
 * Created by utilizator on 6/3/20.
 */
public class AdminUser extends AbstractUser{


    public AdminUser(final String username, Map<String, Address> addresses) {
       super(username, addresses);

    }
    void approveOrder(Order order){
        System.out.println("Order is approved: "+order);
    };
    void rejectOrder(Order order){
        System.out.println("Order is rejected: "+order);
    };

    @Override
    public String toString() {
        return "AdminUser{" +
                ", adminname='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

