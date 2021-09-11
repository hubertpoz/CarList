package com.example.CarList;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Company data of Cars")
public class Car {
    @ApiModelProperty("unique car yearOfProduction ")
    private int yearOfProduction;
    private String model;
    private String mark;

    //TODO example of todo message
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {this.yearOfProduction = yearOfProduction;}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearOfProduction=" + yearOfProduction +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
