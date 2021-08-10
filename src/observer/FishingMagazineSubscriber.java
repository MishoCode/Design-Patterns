package observer;

public class FishingMagazineSubscriber extends Observer {

    public FishingMagazineSubscriber(Subject magazine, String observerName) {
        this.observerName = observerName;
        this.magazine = magazine;
        this.magazine.register(this);
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s! Fishing magazine issue %d is available!",
                this.observerName, this.magazine.getMagazineIssue()));
    }
}
