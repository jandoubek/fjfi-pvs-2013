package cz.jandoubek.view;

import cz.jandoubek.assets.Asset;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PersonalWorthTest {

    @Test
    public void testSum(){
        Set<Asset> assetSet = new HashSet<Asset>();

        Asset asset1 = mock(Asset.class);
        when(asset1.getValue()).thenReturn(100.0);

        Asset asset2 = mock(Asset.class);
        when(asset2.getValue()).thenReturn(100.0);

        assetSet.add(asset1);
        assetSet.add(asset2);

        PersonalWorth personalWorth = new PersonalWorth();

        assertTrue("The method should add two assets value togedher " + asset1.getValue() + " + " + asset2.getValue() + " = " + personalWorth.getWorth(assetSet), personalWorth.getWorth(assetSet) == 200.0);
    }
}
