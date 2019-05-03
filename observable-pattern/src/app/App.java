package app;

import app.interfaces.MyObserver;

/*
* https://italiancoders.it/observer-pattern/
*/
public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Demo OBSERVABLE architectural pattern");
        
        ObservableMatch match = new ObservableMatch();
        
        MyObserver observer1 = new ObserverMatch("1");
        MyObserver observer2 = new ObserverMatch("2");
        MyObserver observer3 = new ObserverMatch("3");
        
        match.addObserver(observer1);
        match.addObserver(observer2);
        match.setMatchScore("1-0");
        match.removeObserver(observer2);
        match.setMatchScore("2-0");
        match.addObserver(observer3);
        match.setMatchScore("2-1");
        match.setMatchScore("3-1");
    }

}