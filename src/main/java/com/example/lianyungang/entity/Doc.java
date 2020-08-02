package com.example.lianyungang.entity;

public class Doc {
    public String getDate() {
        return date;
    }

    public Doc() {

    }

    public Doc(String date, String orderNo, String shipNo) {
        this.date = date;
        this.orderNo = orderNo;
        this.shipNo = shipNo;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    @Override
    public String toString() {
        return date +"|"+orderNo+"|"+shipNo;
    }

    public String date;
    public String orderNo;
    public String shipNo;
}
