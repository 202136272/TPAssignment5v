package exhibitmanagement.domain;

/**
 * Created by Bonga on 4/1/2016.
 */
public class Ballistic extends Department {
    private String name;
    private String reference;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




        public Ballistic(Builder builder) {


            name = builder.name;
            reference = builder.reference;
            type = builder.type;

        }


        public static class Builder {

            //Equivalent to setters
            private String name;
            private String reference;
            private String type;



            public Builder (String name) {
                this.name = name; //compalsury
            }

            public Builder reference(String reference) {
                this.reference = reference;
                return this;
            }

            public Builder type(String type) {
                this.type = type;
                return this;
            }



            public Builder copy(Ballistic ballistic){
                this.name = ballistic.getName();
                this.reference = ballistic.getReference();
                this.type = ballistic.getType();

                return this;
            }
            public Ballistic build() {
                return new Ballistic(this);
            }
        }

    }