package exhibitmanagement.Factory;

import exhibitmanagement.domain.PreciousMetals;

/**
 * Created by Bonga on 4/3/2016.
 */
public class PreciousMetalsFactory {

    public static PreciousMetals getPreciousMetals(String mass, String type, String density, String meltingPoint)
    {
        PreciousMetals myPreciousMetals = new PreciousMetals.Builder(mass)
                .type(type)
                .density(density)
                .meltingPoint(meltingPoint)
                .build();
        return myPreciousMetals;

    }
}
