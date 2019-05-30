import Eventing.Key.IKeyEventCallback;
import Eventing.Key.KeyEvent;
import Eventing.Mouse.MouseEvent;
import Eventing.Mouse.IMouseEventCallback;

public class Main {

    public static void main( String[] args ){
        MCGLEngine engine = new MCGLEngine();

        engine.CreateEngine();
        engine.CreateCamera( 0, 0, 0, 1, 0, 0 );
        engine.CreateWindow( 800, 600, "MCGLEngine" );
        engine.SetTextures("C:\\Users\\Sebastian\\Documents\\Projects\\mcgl_engine\\mcgl_engine\\resources\\textures\\mcgl-texture-atlas.png", 16, 4 );
        engine.SetShader(
                "C:\\Users\\Sebastian\\Documents\\Projects\\mcgl_engine\\mcgl_engine\\resources\\shaders\\vertexShader",
                "C:\\Users\\Sebastian\\Documents\\Projects\\mcgl_engine\\mcgl_engine\\resources\\shaders\\fragmentShader"
        );

        class KeyEventCallback implements IKeyEventCallback{
            public void invoke( KeyEvent event ){
                System.out.println( event.getType() );
            }
        }

        class MouseEventCallback implements IMouseEventCallback{
            public void invoke( MouseEvent event ) { System.out.println( event.getType() ); }
        }

        engine.RegisterKeyEventCallback( new KeyEventCallback() );
        engine.RegisterMouseEventCallback( new MouseEventCallback() );

        Block block = new Block(1, false, 2, 2, 2, 2, 0, 1);

        Chunk chunk = new Chunk();
        chunk.setPosition( 0,0  );

        for( int x = 0; x < 16; x++){
            for( int z = 0; z < 16; z++){
                for( int y = 0; y < 10; y++){
                    chunk.setBlock( x,y,z,1 );
                }
            }
        }

        engine.AddChunk(chunk);

        engine.Run();


        try{
            Thread.sleep( 2500 );
        } catch( Exception ex ) {}

        engine.Stop();

        engine.DestroyEngine();
    }
}
