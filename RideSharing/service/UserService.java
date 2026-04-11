package RideSharing.service;

import RideSharing.model.Driver;
import RideSharing.model.Passenger;
import RideSharing.model.Users;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<Users> users = new ArrayList<>();

    public void addDriver(Driver d) {
        users.add(d);
        System.out.println("Driver added with ID: " + d.getUserId());
    }

    public void addPassenger(Passenger p) {
        users.add(p);
        System.out.println("Passenger added with ID: " + p.getUserId());
    }


    public void displayAllUsers() {
        for (Users user : users) {
            System.out.println("ID: " + user.getUserId() + ", Name: " + user.getName());
        }
    }

    public Users findUserById(int id) {
        for (Users user : users) {
            if (user.getUserId() == id) {
                return user;
            }
        }
        return null;
    }
    public Driver getDriverById(int id) {
        for (Users user : users) {
            if (user instanceof Driver && user.getUserId() == id) {
                return (Driver) user;
            }
        }
        return null;
    }

    public Passenger getPassengerById(int id) {
        for (Users user : users) {
            if (user instanceof Passenger && user.getUserId() == id) {
                return (Passenger) user;
            }
        }
        return null;
}
}