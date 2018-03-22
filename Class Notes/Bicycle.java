package com.company;
/*the bicycle project
  Tony Zhong
  S3C7
  2018.2.28
 */
public class Bicycle {
    private int weight;
    private int RofWheels;
    private int speed;
    private int maxspeed;
    public Bicycle(){

        weight=100;
        RofWheels=20;
        speed=15;

    }
    public Bicycle(int a, int b, int c, int d){
        maxspeed=a;
        weight=b;
        RofWheels=c;
        speed=d;

    }
    public void curspeed (int d){
        while (speed<maxspeed)
        { speed=maxspeed+d;

        }

    }
    public void addspeed(){
        this.speed=maxspeed*(weight/RofWheels);
    }
    public int getSpeed(){
        return speed;
    }


    }