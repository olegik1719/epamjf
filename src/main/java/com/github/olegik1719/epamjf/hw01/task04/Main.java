package com.github.olegik1719.epamjf.hw01.task04;

public class Main {

    public static double max (double ... data){
        int size = data.length;
        if (size < 2 || size % 2 != 0) throw new RuntimeException("You must get any data for this method!");
        double max = data[0]+data[size-1];
        for (int i = 1; i < size-1; i++) {
            double current = data[i] + data[size - i - 1];
            max = max < current ? current : max;
        }
        return max;
    }

}
