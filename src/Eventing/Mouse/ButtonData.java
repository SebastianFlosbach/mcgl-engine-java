package Eventing.Mouse;

public class ButtonData extends BaseMouseData {
    public ButtonData( int button, double timePressed ){

    }

    public int getButton(){
        return button_;
    }

    public double getTimePressed(){
        return timePressed_;
    }

    private int button_;
    private double timePressed_;

}
