package app;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.MyObserver;
    
/**
 * ObservableMatch: the PUBLISHER
 */
public class ObservableMatch {
    
    private String matchScore;
    private List<MyObserver> observers = new ArrayList<>();

    public ObservableMatch() {
        this.matchScore = "0-0";
    }

    public void setMatchScore(String newScore) {
        this.matchScore = newScore;
        for (MyObserver observer : this.observers) {
            observer.update(this.matchScore);
        }
    }
    public String getMatchScore() {
        return matchScore;
    }

    public List<MyObserver> getObservers() {
        return observers;
    }
    public void setObservers(List<MyObserver> observers) {
        this.observers = observers;
    }
    
    public void addObserver(MyObserver observer) {
        // Notifico il risultato iniziale non appena un observer si sottoscrive
        observer.update(this.matchScore);
        this.observers.add(observer);
    }

    public void removeObserver(MyObserver observer) {
        this.observers.remove(observer);
    }
}