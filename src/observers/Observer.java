package observers;

import observable.Observable;

public interface Observer {
    void onAction(Observable observable);
}
