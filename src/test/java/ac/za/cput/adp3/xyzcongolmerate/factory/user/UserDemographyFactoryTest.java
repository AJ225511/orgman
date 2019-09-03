package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    //Check if object is created
    public void buildUserDemography() throws ParseException {

        String string = "06/01/1989";
        DateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dtf.parse(string);

        UserDemography userDemography = UserDemographyFactory.buildUserDemography("ajwiese@gmail.com", "Mr", "1", "1",date );
        Assert.assertNotNull(userDemography);
        System.out.println(userDemography);
    }
}