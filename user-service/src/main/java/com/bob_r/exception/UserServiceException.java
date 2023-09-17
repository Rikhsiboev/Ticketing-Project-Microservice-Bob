package com.bob_r.exception;

public class UserServiceException extends Exception {

    public UserServiceException () {
        super();
    }

    public UserServiceException (String message) {
        super(message);
    }

    public UserServiceException (String message, Throwable cause) {
        super(message, cause);
    }
}
