package observer;

public class CarMagazineSubscriber extends Observer {

    public CarMagazineSubscriber(Subject magazine, String observerName) {
        super(magazine, observerName);
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s! Car magazine issue %d is available!",
                this.observerName, this.magazine.getMagazineIssue()));
    }
}
