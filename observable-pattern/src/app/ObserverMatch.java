package app;

import app.interfaces.MyObserver;

/**
 * ObserverMatch: the SUBSCRIBER
 */
public class ObserverMatch implements MyObserver {

    private String id;
    private String score;

    public ObserverMatch(String id) {
        this.id = id;
    }

    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public void update(Object score) {
        System.out.println("(observer-" + id + ") risultato: "+  (String) score);
        this.score = (String) score;
    }

}