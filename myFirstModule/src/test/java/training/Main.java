package training;

import org.testng.annotations.Test;
import org.testng.Assert;

public class Main {

    @Test
    public void main() {
        User user1 = new User();
        user1.setUserName("TestUsername");
        System.out.println(user1.getUserName());


        Profile profile1 = new Profile(53, 'M', 142.64, "java developer", 'n', 'Y');
        Profile profile2 = new Profile(167, 'F', 280, "bussines analyst", 'y', 'n');
        User user2 = new User("TestUsername", "TestPassword", profile2);
        User user3 = new User(user2);
        System.out.println(user2.getUserName());
        user3.setUserName("hababalala");
        System.out.println(user3.getUserName());
        System.out.println(user2.getUserName());
        user3.setUserName("hababalala");
        System.out.println(user3.getUserName());
        Profile profile3 = new Profile(10, 'F', 300.01, "web designer", 'n', 'n');

        Assert.assertEquals(profile1.getAvarageSalary(), 142.64);


    }


}