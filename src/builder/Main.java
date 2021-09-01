package builder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("Pesho", "Ivanov", 25)
                .setEmail("pepi123@abv.bg")
                .setFacebookAccount("Peshooo")
                .setHasBachelorDegree(true)
                .build();
        System.out.println(person1.toString());

        Person person2 = new Person.PersonBuilder("Gosho","Goshev",35)
                .setEmail("gogata333@gmail.com")
                .build();

        System.out.println(person2.toString());

        Person person3 = new Person.PersonBuilder("Ivan","Ivanov", 105).build();
        System.out.println(person3.toString());
    }
}
