package com.edge;

public class ShapeArea {

  static   int shapeArea(int n) {
        return (int)(Math.pow(n,2) + Math.pow(n-1,2));
    }

    public static void main(String[] args) {
        System.out.println(shapeArea(3));
    }
}
