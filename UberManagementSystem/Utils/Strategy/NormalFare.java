package UberManagementSystem.Utils.Strategy;

public class NormalFare implements FareStrategy {


    @Override
    public double calculateFare(String pickup, String drop) {
        return 699;
    }
}
