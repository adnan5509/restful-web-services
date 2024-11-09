package com.adnanafzalbajwa.rest.webservices.restfulWebServices.beans;

public class HelloWorldBean {

    String message;

    public HelloWorldBean(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
