package com.tproject.TProject.config;

public class NotFoundCodeException extends Exception {
    public NotFoundCodeException() {
        super("INVALID_COUNTRY_CODE");
    }
}
