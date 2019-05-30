package Eventing.Mouse;

public class PositionData extends BaseMouseData {
    public PositionData( double x, double y ){
        x_ = x;
        y_ = y;
    }

    public double getX(){
        return x_;
    }

    public double getY(){
        return y_;
    }

    private double x_;
    private double y_;
}
