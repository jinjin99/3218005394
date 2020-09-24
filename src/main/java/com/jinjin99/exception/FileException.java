package com.free.exception;

/**
 * @ClassNameFileException
 * @Description
 * @Author Free
 * @Date2020/9/21 23:32
 * @Version V1.0
 **/
public class FileException extends Exception {
    public FileException() {
    }

    public FileException(String message) {
        super(message);
    }

    public FileException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileException(Throwable cause) {
        super(cause);
    }

    public FileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
