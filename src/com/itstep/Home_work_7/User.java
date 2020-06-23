package com.itstep.Home_work_7;
import java.util.Map;
import java.util.Random;

/**
 * Created by utilizator on 5/15/20.
 */
public class User extends AbstractUser{
    private long id;
    public long getId() {
        return id;
    }

        public User(final String username, Map<String, Address> addresses) {
              super(username, addresses);
        Random random = new Random();
        this.id = random.nextInt();

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                "} " + super.toString();
    }
}
