/**
 * @author Muhammad Daffa Razan
 * @since 2019
 * @version 1.0
 */
public class MilkShake extends Beverage {
    @Override
    public String getDescription() {
        return "Milk Shake";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
