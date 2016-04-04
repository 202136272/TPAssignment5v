package exhibitmanagement.domain;

/**
 * Created by Bonga on 3/30/2016.
 */
public class Station {


    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public Station(Builder builder) {

        name = builder.name;
        address = builder.address;
    }

    public static class Builder {

        //Equivalent to setters
        private String name;
        private String address;


        public Builder(String name) {
            this.name = name; //compalsury
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }


        public Builder copy(Station station) {
            this.name = station.getName();
            this.address = station.getAddress();

            return this;
        }

        public Station build() {
            return new Station(this);
        }
    }
}







