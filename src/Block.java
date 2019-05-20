public class Block {
    Block( int id, boolean isTransparent,
           int leftTextureId,
           int rightTextureId,
           int frontTextureId,
           int backTextureId,
           int topTextureId,
           int bottomTextureId ){
        id_ = id;
        isTransparent_ = isTransparent;
        leftTextureId_ = leftTextureId;
        rightTextureId_ = rightTextureId;
        frontTextureId_ = frontTextureId;
        backTextureId_ = backTextureId;
        topTextureId_ = topTextureId;
        bottomTextureId_ = bottomTextureId;
    }


    private int id_;
    private boolean isTransparent_;
    private int leftTextureId_;
    private int rightTextureId_;
    private int frontTextureId_;
    private int backTextureId_;
    private int topTextureId_;
    private int bottomTextureId_;

}
