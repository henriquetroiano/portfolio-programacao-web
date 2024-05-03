package com.example.demo.exceptions;

import java.io.Serializable;
import java.util.Date;


public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    public StandardError() {
        // Construtor vazio
    }

    public StandardError(Date timestamp, Integer status, String error, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Integer getStatus() {
    	return status;
    }
    
    public void setStatus(Integer status) {
    	this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
    	return path;
    }
    
    public void setPath(String path) {
    	this.path = path;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}