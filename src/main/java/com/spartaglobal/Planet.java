package com.spartaglobal;

public enum Planet {

    MERCURY("Mercury",  0.0579e9,
            0.330103e24,    0.378),
    VENUS("Venus",      0.1082e9,
            4.86731e24,     0.907),
    EARTH("Earth",      0.1496e9,
            5.97217e24,     1.00),
    MARS("Mars",        0.2279e9,
            0.641691e24,    0.377),
    JUPITER("Jupiter",  0.7786e9,
            1898.125e24,    2.36),
    SATURN("Saturn",    1.4335e9,
            568.317e24,     0.916),
    URANUS("Uranus",    2.8725e9,
            86.8099e24,     0.889),
    NEPTUNE("Neptune",  4.4951e9,
            102.4092e24,    1.12);

    private final String name;
    private final double averageDistance;       // in kilometres
    private final double mass;                  // in kilogrammes
    private final double relativeWeightIndex;   // relative to Earth as 1

    private Planet(String name, double averageDistance, double mass,
            double relativeWeightIndex) {
        this.name = name;
        this.averageDistance = averageDistance;
        this.mass = mass;
        this.relativeWeightIndex = relativeWeightIndex;
    }

    public String getName() {
        return name;
    }

    public double getAverageDistance() {
        return averageDistance;
    }

    public double getMass() {
        return mass;
    }

    public double getRelativeWeightIndex() {
        return relativeWeightIndex;
    }

    public double getWeight(double weightOnEarth) {
        return relativeWeightIndex * weightOnEarth;
    }

    public void printName() {
        System.out.println("    " + name);
    }

    public void printAverageDistance() {
        System.out.println("Average distance to the Sun: " + averageDistance
                + " kilometres");
    }

    public void printMass() {
        System.out.println("Mass: " + mass + " kilogrammes");
    }

    public void printRelativeWeightIndex() {
        System.out.println("Weight index relative to Earth: "
        + relativeWeightIndex);
    }

    public void printAll() {
        printName();
        printAverageDistance();
        printMass();
        printRelativeWeightIndex();
    }

}
