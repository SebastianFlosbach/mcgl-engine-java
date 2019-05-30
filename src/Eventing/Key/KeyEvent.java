package Eventing.Key;


public class KeyEvent {
    public KeyEvent( EKeyEventType type, int key, float timePressed ){
        type_ = type;
        key_ = key;
        timePressed_ = timePressed;
    }

    public EKeyEventType getType(){
        return type_;
    }

    public int getKey(){
        return key_;
    }

    public float getTimePressed(){
        return timePressed_;
    }

    private EKeyEventType type_;
    private int key_;
    private float timePressed_;
}
