package com.kunal.omnicellbackend.responses;

import com.kunal.omnicellbackend.model.Recipe;

import java.util.List;

public class FetchAllRecipesBean {
    public boolean isSuccessful;
    public String message;
    public List<Recipe> data;

    public FetchAllRecipesBean() {
    }

    public FetchAllRecipesBean(boolean isSuccessful, String message, List<Recipe> data) {
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

    public List<Recipe> getData() {
        return data;
    }

    public void setData(List<Recipe> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "FetchAllRecipesBean{" +
                "isSuccessful=" + isSuccessful +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
