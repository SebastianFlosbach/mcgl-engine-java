public class Chunk {
    public Chunk(){
        blocks_ = new int[16][128][16];
    }

    public void setBlock( int x, int y, int z, int id ){
        blocks_[x][y][z] = id;
    }
    public void setPosition( int x, int z ) { position_ = new ChunkCoordinates( x, z ); }

    public int getBlockId( int x, int y, int z ){
        return blocks_[x][y][z];
    }

    private ChunkCoordinates position_;
    private int blocks_[][][];
}
