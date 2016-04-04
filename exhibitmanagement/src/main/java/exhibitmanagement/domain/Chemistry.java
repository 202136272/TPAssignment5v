package exhibitmanagement.domain;

/**
 * Created by Bonga on 4/1/2016.
 */
public class Chemistry extends Department{
    private  String id;
    private  String mass;
    private  String amount;
    private String type;
    private String effect ;

    public String getId() {
        return id;
    }

    public String getMass() {
        return mass;
    }

    public String getAmount() {
        return amount;
    }

   /*
    public String getName() {
        return name;
    }
    */

    public String getEffect() {
        return effect;
    }
}
