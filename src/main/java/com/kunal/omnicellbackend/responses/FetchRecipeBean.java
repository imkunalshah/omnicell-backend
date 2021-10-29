package com.kunal.omnicellbackend.responses;

public class FetchRecipeBean {
    public boolean isSuccessful;
    public String message;
    public Object data;

    public FetchRecipeBean() {
    }

    public FetchRecipeBean(boolean isSuccessful, String message, Object data) {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FetchRecipe{" +
                "isSuccessful=" + isSuccessful +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
