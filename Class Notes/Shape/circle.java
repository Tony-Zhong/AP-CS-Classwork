package com.company;

public class circle extends Shape {
   public double a;
   public double b;
   public double c;
   private String name;

    public circle (double radus ) {
        a= radus;
    }

    public double getArea(){
        b=Math.PI*a*a;
        return b;
    }

    public double getPerimeter(){
        c=Math.PI*a*2;
        return c;
    }

    public boolean equals (circle obj){
        return (this.name ==obj.name);
    }
    public String toString(){
        return " Tony is so hamdsome" + name;
    }
}


