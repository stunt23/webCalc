package com.example.webcalculator;

public class CalculationDTO {
    private String type;
    private Integer x;
    private Integer y;
    private Integer result;

    private CalculationDTO(String type, Integer x, Integer y, Integer result) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.result = result;
    }
    public static CalculationDTO of(String type, Integer x, Integer y, Integer result){
        return new CalculationDTO(type,x,y,result);
    }

    public String getType() {
        return type;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getResult() {
        return result;
    }
}
