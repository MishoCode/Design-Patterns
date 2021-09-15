package singleton;

public class HeavyObject {

    private static HeavyObject instance = new HeavyObject();

    private HeavyObject() {
        //constructor body
    }

    public static HeavyObject getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("I am working!");
    }
}
