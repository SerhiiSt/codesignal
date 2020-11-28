package com.edge;

import java.util.Arrays;

public class  MakeArrayConsecutive {
    int makeArrayConsecutive2(int[] statues) {
        int max = Arrays.stream(statues).max().getAsInt();
        int min = Arrays.stream(statues).min().getAsInt();
        return max - min - statues.length + 1;

    }
}
