package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    //Check whether ID is generated
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("AJ's Cool Company");
        Assert.assertNotNull(organisation.getOrgCode());
        System.out.println(organisation.getOrgCode());
    }
}