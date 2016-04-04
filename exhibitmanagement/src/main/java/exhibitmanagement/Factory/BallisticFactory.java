package exhibitmanagement.Factory;

import exhibitmanagement.domain.Ballistic;
import exhibitmanagement.domain.Person;

/**
 * Created by Bonga on 4/3/2016.
 */
public class BallisticFactory {

    public static Ballistic getBallistic(String name, String reference,String type)
    {
        Ballistic myBallistic = new Ballistic.Builder(name)
                .reference(reference)
                .type(type)
                .build();
        return myBallistic;

    }
}
