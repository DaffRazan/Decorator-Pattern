/**
 * @author Muhammad Daffa Razan
 * @since 2019
 * @version 1.0
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
