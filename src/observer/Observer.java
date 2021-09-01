package observer;

public abstract class Observer {

    protected Subject magazine;
    protected String observerName;

    public Observer(Subject magazine, String observerName) {
        this.magazine = magazine;
        this.observerName = observerName;
        this.magazine.register(this);
    }

    public abstract void update();
}
