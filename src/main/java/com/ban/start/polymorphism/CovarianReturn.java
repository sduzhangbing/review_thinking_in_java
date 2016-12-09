package com.ban.start.polymorphism;

/**
 * 协变返回类型
 * Created by banzhang on 16-11-26.
 */

class Grain{
    @Override
    public String toString() {
        return "Grain{}";
    }
}

class Wheat extends Grain{
    @Override
    public String toString() {
        return "Wheat{}";
    }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}

public class CovarianReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain g = mill.process();
        System.out.println(g);
        mill = new WheatMill();
        g = mill.process();
        System.out.println(g);
    }
}
