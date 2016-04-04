package exhibitmanagement.Factory;

import exhibitmanagement.domain.Exhibit;

/**
 * Created by Leonard Dukashe on 2016/03/28.
 */
public class ExhibitFactory {


    public static Exhibit getExhibit(String casNumber, String station, String description, String sceneType )
    {
        Exhibit myExhibit = new Exhibit.Builder(casNumber)
                .station(station)
                .description(description)
                .sceneType(sceneType)
                .build();
        return myExhibit;

    }
}
