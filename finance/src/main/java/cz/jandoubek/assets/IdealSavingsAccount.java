package cz.jandoubek.assets;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Calendar;
import java.util.Date;

public class IdealSavingsAccount implements Asset {

    private double dailyRate;

    private double initialSum;

    private Date initialDate;

    public IdealSavingsAccount(double dailyRate, double initialSum, Date initialDate) {
        this.dailyRate = dailyRate;
        this.initialSum = initialSum;
        this.initialDate = initialDate;
    }

    @Override
    public double getValue() {
        Date today = new Date();

        int daysDiff = Days.daysBetween(new DateTime(initialDate), new DateTime(today)).getDays();

        double multiplicator = Math.pow(dailyRate, daysDiff);

        return multiplicator * initialSum;
    }

    @Override
    public double getValue(Date date) {

        int daysDiff = Days.daysBetween(new DateTime(initialDate), new DateTime(date)).getDays();

        double multiplicator = Math.pow(dailyRate, daysDiff);

        return multiplicator * initialSum;
    }
}
