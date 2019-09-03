package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    //Check whether ID is generated
    public void buildRace() {
        Race race = RaceFactory.buildRace("Korean");
        Assert.assertNotNull(race.getRaceId());
        System.out.println(race.getRaceId());
    }
}