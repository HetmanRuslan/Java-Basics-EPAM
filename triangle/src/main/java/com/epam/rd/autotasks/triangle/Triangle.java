package com.epam.rd.autotasks.triangle;

import javax.sound.sampled.Line;

class Triangle {
    private final double aX;
    private final double aY;
    private final double bX;
    private final double bY;
    private final double cX;
    private final double cY;
    double lengthA;
    double lengthB;
    double lengthC;
    public Triangle(Point a, Point b, Point c) {
        //TODO
        this.aX = a.getX();
        this.aY = a.getY();
        this.bX = b.getX();
        this.bY = b.getY();
        this.cX = c.getX();
        this.cY = c.getY();
        this.lengthA = Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
        this.lengthB = Math.sqrt(Math.pow((bX - cX), 2) + Math.pow((bY - cY), 2));
        this.lengthC = Math.sqrt(Math.pow((cX - aX), 2) + Math.pow((cY - aY), 2));
        if(lengthA+lengthB<=lengthC||lengthA+lengthC<=lengthB||lengthB+lengthC<=lengthA){
            throw new IllegalArgumentException();
        }
        if(a.equals(null)||b.equals(null)||c.equals(null)){
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        //TODO
        double halfPerimeter = (lengthA+lengthB+lengthC)/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-lengthA)*(halfPerimeter-lengthB)*(halfPerimeter-lengthC));
    }

    public Point centroid(){
        //TODO
        return new Point((aX+bX+cX)/3,(aY+bY+cY)/3);
    }

}
