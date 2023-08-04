package builder;

public class Person {
    //required fields
    private String firstName;
    private String lastName;
    private int age;

    //optional fields
    private String email;
    private String facebookAccount;
    private boolean hasBachelorDegree;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public boolean getHasBachelorDegree() {
        return hasBachelorDegree;
    }

    @Override
    public String toString() {
        return "Person{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", age=" + age +
               ", email='" + email + '\'' +
               ", facebookAccount='" + facebookAccount + '\'' +
               ", hasBachelorDegree=" + hasBachelorDegree +
               '}';
    }

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.lastName = personBuilder.lastName;
        this.age = personBuilder.age;
        this.email = personBuilder.email;
        this.facebookAccount = personBuilder.facebookAccount;
        this.hasBachelorDegree = personBuilder.hasBachelorDegree;
    }

    public static PersonBuilder builder(String firstName, String lastName, int age) {
        return new PersonBuilder(firstName, lastName, age);
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;

        private String email;
        private String facebookAccount;
        private boolean hasBachelorDegree;

        public PersonBuilder(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder setFacebookAccount(String facebookAccount) {
            this.facebookAccount = facebookAccount;
            return this;
        }

        public PersonBuilder setHasBachelorDegree(boolean hasBachelorDegree) {
            this.hasBachelorDegree = hasBachelorDegree;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
