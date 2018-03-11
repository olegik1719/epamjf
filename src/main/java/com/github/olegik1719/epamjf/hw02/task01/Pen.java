package com.github.olegik1719.epamjf.hw02.task01;

public class Pen {
    private final int width;
    private final String colour;
    private final String model;
    private final int HASH_PRIME = 47;


    public Pen(int width,String colour, String model){
        this.width = width;
        this.colour = colour;
        this.model = model;
    }

    @Override
    public int hashCode() {
        int result = width;
        result *= HASH_PRIME;
        result += str_hashcode(colour);
        result *= HASH_PRIME;
        result += str_hashcode(model);
        return result;
    }

    private int str_hashcode(String string){
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            result*=HASH_PRIME;
            result+=string.charAt(i);
        }
        return result;
    }

    @Override
    public String toString(){
        return colour + " " + model + " size: " + width;
    }
}
