/**
 * Created by саша on 09.03.2017.
 */
public class MultipleSausageException extends RuntimeException {

    /**
     * Creates a new instance of <code>MultipleSausageException</code> without
     * detail message.
     */
    public MultipleSausageException() {
    }

    /**
     * Constructs an instance of <code>MultipleSausageException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MultipleSausageException(String msg) {
        super(msg);
    }
}
