package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){}
    void flip(){
        int temp = x;
        x = -y;
        y = -temp;
    }
    double distance(Point point){
        double distanceInPoints = Math.sqrt((Math.pow(x-point.x, 2) + Math.pow(y-point.y, 2)));
        return distanceInPoints;
    }
    public String toString(){
        return "(" + x + "; " + y + ")";
    }

    void print() {
        String pointToString = String.format("(%d, %d)", x, y);
        System.out.println(pointToString);
    }
}
