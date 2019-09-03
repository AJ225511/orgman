package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    //Check if object is created
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole("1234", "ajwiese@gmail.com", "CEO");
        Assert.assertNotNull(userRole);
        System.out.println(userRole);
    }
}