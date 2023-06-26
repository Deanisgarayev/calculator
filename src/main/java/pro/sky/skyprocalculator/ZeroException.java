package pro.sky.skyprocalculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroException extends RuntimeException{

    public ZeroException() {
    }

    public ZeroException(String message) {
        super(message);
    }

    public ZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
