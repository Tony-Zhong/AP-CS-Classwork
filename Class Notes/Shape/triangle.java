package com.company;

public class triangle extends Shape {
    public double a;
    public double b;
    public double c;
    public double d;
    public double e;

    public triangle(double side1, double side2, double side3) {
        a = side1;
        b = side2;
        c = side3;

    }

    public double getPerimeter(){
        e = a + b + c;
        return e;
    }


    public double getArea(){
        double s = (a + b + c)/2;
         d = Math.sqrt(s * (s-a) * (s-b) * (s-c));
         return d;
    }



}


