package observers;

import observable.Observable;
import observable.ObservableImpl;

public class ObserverImpl_2 implements Observer {
    private int counter;
    @Override
    public void onAction(Observable observable) {
        int newState = ((ObservableImpl)observable).getState();
        System.out.println("-------Observer 2 -----------");
        System.out.println("Observer2 a reçu la nouvelle valeur de l'état = " + newState );
       if(newState%2==0) {
           ++counter;
           counter+=1;
       }
        System.out.println("Identification de l'état reçu S'il est pair ou impair = " +
                          ((newState%2)==0?"pair":"impair"));
        System.out.println("Calcul du compteur = " + counter);
        System.out.println("fin du calcul de l'observer 2...");
    }
}
