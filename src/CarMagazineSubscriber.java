public class CarMagazineSubscriber extends Observer {
    public CarMagazineSubscriber(Subject magazine, String observerName) {
        this.observerName = observerName;
        this.magazine = magazine;
        this.magazine.register(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s! Car magazine issue %d is available!",
                this.observerName, this.magazine.getMagazineIssue()));
    }
}
