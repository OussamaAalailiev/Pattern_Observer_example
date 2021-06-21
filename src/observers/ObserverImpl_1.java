package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl_1 implements Observer {
    /**when we receive a notification to get the new State, we call the method
     * getState() then we compute a new Result*/
    /**The observers are independent from each other, every one of them is
     * programmed to perform a Specific Task*/
    @Override
    public void onAction(Observable observable) {
        System.out.println("--------- Observer 1 --------------");
        int newState = ((ObservableImpl)observable).getState();
        double result = Math.random()*1000*newState;
        System.out.println("Observer1 a reçu la nouvelle valeur de l'état = " + newState );
        System.out.println("Calcul du Résultat = " + result);
        System.out.println("fin du calcul de l'observer 1...");

    }
}
