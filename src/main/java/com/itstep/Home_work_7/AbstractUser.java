package com.itstep.Home_work_7;
import java.util.Map;

/**
 * Created by utilizator on 6/3/20.
 */
public abstract class AbstractUser  {
    protected final String username;
    protected Map<String, Address> addresses;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return                "username='" + username + '\'' +
                ", addresses=" + addresses +
                '}';
    }

    public Map<String, Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, Address> addresses) {
        this.addresses = addresses;
    }

    public AbstractUser(String username, Map<String, Address> addresses) {
        this.username = username;
        this.addresses = addresses;

    }
}
