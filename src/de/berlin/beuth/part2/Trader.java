package de.berlin.beuth.part2;

/**
 * Trader Bean Class
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + this.name + '\'' +
                ", city='" + this.city + '\'' +
                '}';
    }
}