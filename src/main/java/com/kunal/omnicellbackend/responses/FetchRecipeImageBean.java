package com.kunal.omnicellbackend.responses;

public class FetchRecipeImageBean {
    public boolean isSuccessful;
    public String message;
    public String data;

    public FetchRecipeImageBean() {
    }

    public FetchRecipeImageBean(boolean isSuccessful, String message, String data) {
        this.isSuccessful = isSuccessful;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FetchRecipeImage{" +
                "isSuccessful=" + isSuccessful +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
