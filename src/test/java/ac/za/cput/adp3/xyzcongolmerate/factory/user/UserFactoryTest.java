package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    //Check if object is created
    public void buildUser() {
        User user = UserFactory.buildUser("ajwiese@gmail.com", "AJ", "Wiese");
        Assert.assertNotNull(user);
        System.out.println(user);
    }
}