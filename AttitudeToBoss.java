/**
 * Created by саша on 09.03.2017.
 */
public enum AttitudeToBoss{
    HATE((byte) -128),
    LOW((byte) -64),
    DEFAULT((byte) 0),
    NORMAL((byte) 63),
    HIGH((byte) 127);
    protected final byte attitude;
    AttitudeToBoss(byte attitude){
        this.attitude = attitude;
    }
}
