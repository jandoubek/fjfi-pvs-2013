package cz.jandoubek.view;

import cz.jandoubek.assets.Asset;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: jdoubek
 * Date: 10/24/13
 * Time: 10:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersonalWorth {

    public float getWorth(Set<Asset> setOfAssets){

        float personalWorth = 0;

        for(Asset asset: setOfAssets){
            personalWorth += asset.getValue();
        }

        return personalWorth;
    }

}
