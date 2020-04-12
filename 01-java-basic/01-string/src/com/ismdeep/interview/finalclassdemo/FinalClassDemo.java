package com.ismdeep.interview.finalclassdemo;

public class FinalClassDemo {

    public static void pointFunc(Point point) {
        point.x = 2;
        point.y = 2;
        System.out.println(String.format("point @ %x", point.hashCode()));
    }

    public static void pointFinalFunc(PointFinal pointFinal) {
        pointFinal.x = 2;
        pointFinal.y = 2;
        System.out.println(String.format("point final @ %x", pointFinal.hashCode()));
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 1;
        point.y = 1;
        System.out.println(point);
        System.out.println(String.format("point @ %x", point.hashCode()));
        pointFunc(point);
        System.out.println(point);

        System.out.println();

        PointFinal pointFinal = new PointFinal();
        pointFinal.x = 1;
        pointFinal.y = 1;
        System.out.println(pointFinal);
        System.out.println(String.format("point final @ %x", pointFinal.hashCode()));
        pointFinalFunc(pointFinal);
        System.out.println(pointFinal);

    }

}
