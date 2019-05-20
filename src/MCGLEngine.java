import Eventing.IKeyEventCallback;
import Eventing.IMouseEventCallback;
import Eventing.IStatusEventCallback;

public class MCGLEngine {
    static {
        System.loadLibrary("mcgl-engine");
        System.loadLibrary("mcgl-engine-java");
    }

    native void CreateEngine();
    native void DestroyEngine();
    native void CreateWindow( int width, int height, String title );
    native void CloseWindow();
    native void Run();
    native void Stop();
    native void RegisterBlockType( Block block );
    native void SetTextures( String path, int textureSize, int textureCount );
    native void SetShader( String vertexShaderPath, String fragmentShaderPath );
    native void AddChunk( Chunk chunk );
    native void RemoveChunk( ChunkCoordinates position );

    native void CreateCamera( float x, float y, float z, float pitch, float yaw, float roll );
    native void MoveCamera( int cameraId, float dx, float dy, float dz );
    native void RotateCamera( int cameraId, float pitch, float yaw, float roll );

    native void RegisterKeyEventCallback( IKeyEventCallback callback );

    native void RegisterMouseEventCallback( IMouseEventCallback callback );
    native void RegisterStatusEventCallback( IStatusEventCallback callback );

    native float GetDeltaTime();
    native WorldCoordinates GetCameraPosition();

}
