package UberManagementSystem.Repository;

import UberManagementSystem.Model.Ride;

import java.util.HashMap;
import java.util.Map;

public class RideRepository {
    private Map<Integer, Ride> db = new HashMap<>();
    private int idCounter = 1;

    public Ride save(Ride ride){
        ride.id = idCounter++;
        db.put(ride.id, ride);
        return ride;
    }
    public Ride findById(int id){
        return db.get(id);
    }

    public void update(Ride ride){
        db.put(ride.id , ride);
    }
}
