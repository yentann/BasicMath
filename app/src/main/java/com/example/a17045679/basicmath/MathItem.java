package com.example.a17045679.basicmath;

public class MathItem {


    //Constructor
    private String name;
    private String formula;
    private String area;


    //Getter and Setter

    public MathItem(String name, String formula, String area) {
        this.name = name;
        this.formula = formula;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    //toString()


    @Override
    public String toString() {
        return "MathItem{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
