package observer;

public abstract class Observer {

    protected Subject magazine;
    protected String observerName;

    public abstract void update();
}
