package training;

/**
 * Task V.3 Set
 */

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    @Test
    public void main() {
        User2 theodor = new User2("Theodor", "TheoPass");
        User2 john = new User2("John", "JohnPass");
        User2 mara = new User2("Mara", "MaraPass");
        User2 kleo = new User2("Kleo", "KleoPass");
        User2 skywalker = new User2("Skywalker", "SkywalkerPass");
        User2 john2 = new User2("John", "TestPass");
        User2 mara2 = new User2("Mara", "TestPass");
        User2 kleo2 = new User2("Kleo", "TestPass");

        java.util.Set<String> allPasswords = new HashSet<String>();
        allPasswords.add(theodor.password);
        allPasswords.add(john.password);
        allPasswords.add(mara.password);
        allPasswords.add(kleo.password);
        allPasswords.add(john2.password);
        allPasswords.add(mara2.password);
        allPasswords.add(kleo2.password);

        Assert.assertEquals(allPasswords.contains("KleoPass"), true);
        Assert.assertEquals(allPasswords.contains("TestPass"), true);
        Assert.assertEquals(allPasswords.contains("MyTestPass "), false);
        Assert.assertEquals(allPasswords.size(), 5); //только 5 элементов в сете, так как "ТестПасс" повторяется трижды
    }
}
