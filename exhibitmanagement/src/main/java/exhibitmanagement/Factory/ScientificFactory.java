package exhibitmanagement.Factory;

import exhibitmanagement.domain.PreciousMetals;
import exhibitmanagement.domain.Scientific;
import exhibitmanagement.domain.Station;

/**
 * Created by Bonga on 4/3/2016.
 */
public class ScientificFactory {

    public static Scientific getScientific(String name, Double mass) {
        Scientific myScientific = new Scientific.Builder(name)
                .mass(mass)
                .build();
        return myScientific;


    }


}