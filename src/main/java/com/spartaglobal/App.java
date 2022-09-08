package com.spartaglobal;

public class App {

    public static void main(String[] args) {

        final double WEIGHT = 120;

        for (Planet planet : Planet.values()) {
            planet.printAll();
            System.out.println("The weight of an object which weights " + WEIGHT
                    + " newtons would weight " + planet.getWeight(WEIGHT)
                    + " newtons on planet " + planet.getName() + ".");
            System.out.println();
        }
    }

}
