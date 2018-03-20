package com.company;

public class rectangle extends Shape{
    public double a;
    public double b;
    public double c;
    public double d;


    public rectangle(double width, double length){
      width = a;
      length = b;

    }

    public double getArea(){
        c = a * b;
        return c;
    }

    public double getPerimeter(){
        d = 2 * (a + b);
        return d;
    }
}
