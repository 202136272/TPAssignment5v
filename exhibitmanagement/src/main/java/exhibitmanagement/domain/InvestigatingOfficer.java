package exhibitmanagement.domain;

/**
 * Created by Leonard Dukashe on 2016/03/28.
 */
public class InvestigatingOfficer {

    private String name;
    private String rank;
    private String station;
    private String persalNumber;

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getStation() {
        return station;
    }

    public String getPersalNumber() {
        return persalNumber;
    }



    public InvestigatingOfficer(Builder builder) {

        name = builder.name;
        rank = builder.rank;
        station = builder.station;
        persalNumber = builder.persalNumber;

    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String rank;
        private String station;
        private String persalNumber;


        public Builder (String name) {
            this.name = name; //compalsury
        }

        public Builder rank(String rank) {
            this.rank = rank;
            return this;
        }

        public Builder station(String station) {
            this.station = station;
            return this;
        }


        public Builder persalNumber(String persalNumber) {
            this.persalNumber = persalNumber;
            return this;
        }



        public Builder copy(InvestigatingOfficer investigatingOfficer){
            this.name = investigatingOfficer.getName();
            this.rank = investigatingOfficer.getRank();
            this.station = investigatingOfficer.getStation();
            this.persalNumber = investigatingOfficer.getPersalNumber();
            return this;
        }

        public InvestigatingOfficer build() {
            return new InvestigatingOfficer(this);
        }
    }

}

