package observable;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
         observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer :observers) {
            observer.onAction(this);
        }
    }
    //Getters & Setters for State variable :
    public void setState(int state){
        this.state = state;
        notifyObservers();
    }
    public int getState(){
        return state;
    }
}
