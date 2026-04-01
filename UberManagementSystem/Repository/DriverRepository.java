package UberManagementSystem.Repository;

import UberManagementSystem.Model.Driver;

import java.util.HashMap;

public class DriverRepository {
    HashMap<Integer , Driver> db = new HashMap<>();
    private int id =1;
    public DriverRepository(){
        Driver d = new Driver();
        d.id = id++;
        d.name = "driver1";
        db.put(1 , d);
    }
    public Driver findById(int id) {
        return db.get(id);
    }

    public void update(Driver driver) {
        db.put(driver.id, driver);
    }
}
