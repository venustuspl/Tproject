package com.tproject.TProject.config;

import java.net.ConnectException;
import java.sql.SQLException;

public class DatabaseException extends ConnectException {

    public DatabaseException() {
        super("INTERNAL_ERROR");
    }
}

