package com.example.CarList;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Company data of Cars")
public class Cars {
    @ApiModelProperty("unique mark of cars")
    private int mark;
    private String model;
    private String yearofproduction;

    //TODO example of todo message
    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getyearOfProduction() {
        return yearofproduction;
    }

    public void setyearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark=" + Mark +
                ", model='" + Model + '\'' +
                ", yearofproduction='" + Yearofproduction + '\'' +
                '}';
    }
}