package UberManagementSystem.Utils.Strategy;

public class PremiumFare implements FareStrategy{

    @Override
    public double calculateFare(String pickup, String drop) {
        return 899;
    }
}
