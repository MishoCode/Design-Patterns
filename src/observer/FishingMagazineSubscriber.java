package observer;

public class FishingMagazineSubscriber extends Observer {

    public FishingMagazineSubscriber(Subject magazine, String observerName) {
        super(magazine, observerName);
    }

    @Override
    public void update() {
        System.out.println(String.format("Hi %s! Fishing magazine issue %d is available!",
                this.observerName, this.magazine.getMagazineIssue()));
    }
}
