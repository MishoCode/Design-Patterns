package singleton;

public class Main {
    public static void main(String[] args) {
        //private constructor!!!
        //HeavyObject heavyObject = new HeavyObject()

        HeavyObject heavyObject = HeavyObject.getInstance();//the only object available
        heavyObject.doSomething();
    }
}
