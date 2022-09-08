# Planets

Task for Engineering 149 at Sparta Global.

This project demonstrates the enum type in Java, using an example enum
`Planet`, which contains eight instances, representing the eight planets of the
Solar System.

The enum has four private fields:

- a text string `name`, the name of the planet in English;
- a double-precision floating-point number `averageDistance`, the average
distance of the planet from the Sun, in kilometres;
- a double-precision floating-point number `mass`, the mass of the planet, in
kilogrammes; and
- a double-precision floating-point number `relativeWeightIndex`, the
gravitational acceleration at the surface of the planet, relative to Earth.

Each of the four fields has a public accessor (or getter) method and a public
print method, which prints a formatted string containing the field to the standard output.

Additionally, the enum contains a `getWeight` method, which takes in the weight
on Earth as a double and returns the weight on the planet represented by the
object as a double. For example, the gravitational acceleration at the surface
of Mercury is approximately 0.378 times that of Earth, so invoking the
`getWeight` method on the enum object `Planet.MERCURY` and passing the argument
120 would return 45.36.
