package org.jiaoda.mtappsys_team01.entity;
/**
 * 店铺实体类
 */
public class Store {
    private Integer sid;
    private String name;
    private String disc;
    private String picPath;
    private Double score;
    private Integer salNum;
    private Double distance;
    private Integer deliveryTime;
    private double startPrice;
    private double currentPirce;

    public Store(){

    }

    public Store(Integer sid, String name, String disc, String picPath, Double score, Integer salNum, Double distance, Integer deliveryTime, double startPrice, double currentPirce) {
        this.sid = sid;
        this.name = name;
        this.disc = disc;
        this.picPath = picPath;
        this.score = score;
        this.salNum = salNum;
        this.distance = distance;
        this.deliveryTime = deliveryTime;
        this.startPrice = startPrice;
        this.currentPirce = currentPirce;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getSalNum() {
        return salNum;
    }

    public void setSalNum(Integer salNum) {
        this.salNum = salNum;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Integer deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getCurrentPirce() {
        return currentPirce;
    }

    public void setCurrentPirce(double currentPirce) {
        this.currentPirce = currentPirce;
    }
}
