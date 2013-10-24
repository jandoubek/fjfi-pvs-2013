package cz.jandoubek.assets;


import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class IdealSavingsAccountTest {

    @Test
    public void testOneDay(){

        Date yesterday = new Date();
        long yLong = yesterday.getTime();
        yLong -= 24*60*60*1000;
        yesterday.setTime(yLong);

        IdealSavingsAccount account = new IdealSavingsAccount(1.1, 100.0, yesterday);

        assertTrue(("One day yield is wrong " + account.getValue() + " " + "110.0"), account.getValue()==110.0);
    }

}
