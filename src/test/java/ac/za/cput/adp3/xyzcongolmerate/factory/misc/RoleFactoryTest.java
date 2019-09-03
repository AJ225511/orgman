package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    //Check whether ID is generated
    public void buildRole() {
        Role role = RoleFactory.buildRole("CEO");
        Assert.assertNotNull(role.getRoleId());
        System.out.println(role.getRoleId());
    }
}