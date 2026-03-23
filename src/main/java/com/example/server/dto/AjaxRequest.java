package com.example.server.dto;

public class AjaxRequest {
    private String action;
    private String data;

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public  String getData() { return  data; }
    public void setData(String data) { this.data = data; }

    @Override
    public String toString() {
        return "AjaxRequest{action='" + action + "', data='" + data + "'}";
    }
}
