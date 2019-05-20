public class WorldCoordinates {
    WorldCoordinates( float x, float y, float z ){
        x_ = x;
        y_ = y;
        z_ = z;
    }

    public float getX(){
        return x_;
    }

    public float getY(){
        return y_;
    }

    public float getZ(){
        return z_;
    }

    private float x_, y_, z_;
}
