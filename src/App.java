import observable.Observable;
import observable.ObservableImpl;
import observers.Observer;
import observers.ObserverImpl_1;
import observers.ObserverImpl_2;

public class App {
    public static void main(String[] args) {
        /**Design Pattern Observer (observing the behavior of how the
         * objects will interact with each other to resolve a problem in a performant manner)*/
        //creation of the subject:
        ObservableImpl observable = new ObservableImpl();
        //creation of two observers object:
        Observer observer1 = new ObserverImpl_1();
        Observer observer2 = new ObserverImpl_2();
        //Adding two observers to the observable object list "Subscribe":
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        //changing the state inside the observable :
        System.out.println("************1st change of the State************************");
        observable.setState(100);
        //Unsubscribe of an observer that will no longer receive a state:
        observable.removeObserver(observer2);
        //changing the state again inside the observable :
        System.out.println("************2nd change of the State************");
        observable.setState(77);

    }
}
