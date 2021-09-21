package com.example.project.entities;




public class Response {
    private String status;
    private  String data;
    private String error;

    public Response(String status, String data, String error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public Response() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
