public class Main {
    public static void main(String[] args) {
        Subject magazine1 = new Subject();

        Observer observer1  = new CarMagazineSubscriber(magazine1,"Pesho");
        Observer observer2 = new CarMagazineSubscriber(magazine1,"Gosho");
        Observer observer3 = new CarMagazineSubscriber(magazine1,"Mimi");

        magazine1.setMagazineIssue(1);
        System.out.println();
        magazine1.unregister(observer1);
        magazine1.setMagazineIssue(2);
        System.out.println();

        Subject magazine2 = new Subject();
        Observer observer4 = new FishingMagazineSubscriber(magazine2,"John");

        magazine2.setMagazineIssue(37);
    }
}
