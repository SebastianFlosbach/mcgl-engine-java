package Eventing.Mouse;

public class MouseEvent {
    public MouseEvent( EMouseEventType type, double x, double y ) {
        type_ = type;
        data_ = new PositionData( x, y );
    }

    public MouseEvent( EMouseEventType type, int button, double timePressed ){
        type_ = type;
        data_ = new ButtonData( button, timePressed );
    }

    public EMouseEventType getType(){
        return type_;
    }

    public BaseMouseData getData(){
        return data_;
    }

    private EMouseEventType type_;
    private BaseMouseData data_;

}
