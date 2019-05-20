import Eventing.IKeyEventCallback;
import Eventing.KeyEvent;

public class Main {

    public static void main( String[] args ){
        MCGLEngine engine = new MCGLEngine();

        engine.CreateEngine();
        engine.CreateCamera( 0, 0, 0, 1, 0, 0 );
        engine.CreateWindow( 800, 600, "MCGLEngine" );

        class KeyEventCallback implements IKeyEventCallback{
            public void invoke( KeyEvent event ){
                System.out.println( event.getType() );
            }
        }

        engine.RegisterKeyEventCallback( new KeyEventCallback() );

        engine.Run();


        try{
            Thread.sleep( 10000 );
        } catch( Exception ex ) {}

        engine.Stop();

        engine.DestroyEngine();
    }
}
