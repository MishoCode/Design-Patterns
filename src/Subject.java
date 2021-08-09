import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    protected int magazineIssue;

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public int getMagazineIssue(){
        return magazineIssue;
    }

    public void setMagazineIssue(int newIssue){
        this.magazineIssue = newIssue;
        notifyObservers();
    }
}
