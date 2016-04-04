package exhibitmanagement.domain;

/**
 * Created by Bonga on 4/2/2016.
 */
public class Administrator {
    private  String name;
    private String surname;
    private  String persalNumber;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersalNumber() {
        return persalNumber;
    }

    public Administrator(Builder builder) {


        name = builder.name;
        surname = builder.surname;
        persalNumber = builder.persalNumber;

    }


    public static class Builder {

        //Equivalent to setters
        private String name;
        private String surname;
        private String persalNumber;



        public Builder (String name) {
            this.name = name; //compulsary
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder persalNumber(String persalNumber) {
            this.persalNumber = persalNumber;
            return this;
        }



        public Builder copy(Administrator administrator){
            this.name = administrator.getName();
            this.surname = administrator.getSurname();
            this.persalNumber = administrator.getPersalNumber();

            return this;
        }
        public Administrator build() {
            return new Administrator(this);
        }
    }

}
