package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    @Test
    //Check if object is created
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser("12321", "aj_enterprises@gmail.com");
        Assert.assertNotNull(organisationUser);
        System.out.println(organisationUser);
    }
}