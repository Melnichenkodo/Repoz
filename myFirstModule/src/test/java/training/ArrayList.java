package training;

/**
 * Task V.2 List
 */

import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.*;

public class ArrayList {

    @Test
    public void main() {

        User2 theodor = new User2("Theodor", "TheoPass");
        User2 john = new User2("John", "JohnPass");
        User2 mara = new User2("Mara", "MaraPass");
        User2 kleo = new User2("Kleo", "KleoPass");
        User2 skywalker = new User2("Skywalker", "SkywalkerPass");
        List authenticatedUsers = new LinkedList(); //ArrayList создать не удалось
        authenticatedUsers.add(theodor);
        authenticatedUsers.add(john);
        authenticatedUsers.add(mara);
        authenticatedUsers.add(kleo);
        Assert.assertEquals(authenticatedUsers.contains(mara), true);
        Assert.assertEquals(kleo.password, "KleoPass");
        Assert.assertEquals(authenticatedUsers.contains(skywalker), false);
        Assert.assertEquals(skywalker.password, "SkywalkerPass");
        Assert.assertEquals(authenticatedUsers.size(), 4);
        Assert.assertEquals(authenticatedUsers.get(2), mara);

    }

}
