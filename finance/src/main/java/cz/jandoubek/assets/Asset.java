package cz.jandoubek.assets;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jdoubek
 * Date: 10/23/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Asset {

    /**
     *
     * @return todays actual value of the asset
     */
    public double getValue();

    /**
     *
     * @param date - the date when the value
     * @return
     */
    public double getValue(Date date);

}
