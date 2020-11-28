package com.edge;

public class Adjustment {
    static int adjacentElementsProduct(int[] inputArray) {

        int production = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > production) {
                production = inputArray[i] * inputArray[i + 1];
            }
        }
        return production;
    }
}
