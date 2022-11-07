package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public String toString(){
        return "( " + p1.toString() + " " + p2.toString() + " )";
    }

    public boolean isCollinearLine(Point p){
        boolean truePart1 = (p.getX() - p1.getX()) * (p2.getY() - p1.getY()) - (p2.getX() - p1.getX()) * (p.getY() - p1.getY()) == 0;
        boolean truePart2 = (0 <= ((p.getX() - p1.getX()) * (p2.getX()) - p.getX())) && (Math.pow(p1.getX() - p2.getX(), 2) <= ((p.getX() - p1.getX()) * (p2.getX()) - p.getX()));
        boolean truePart3 = (0 <= ((p.getY() - p1.getY()) * (p2.getY()) - p.getY())) && (Math.pow(p1.getY() - p2.getY(), 2) <= ((p.getY() - p1.getY()) * (p2.getY()) - p.getY()));
        return truePart1 && truePart2 && truePart3;
    }
}
