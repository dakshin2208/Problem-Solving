package RideSharing.service;

import RideSharing.model.ConfirmTrip;
import RideSharing.model.Driver;
import RideSharing.model.Passenger;

import java.util.ArrayList;
import java.util.List;

public class RideService {

    private List<ConfirmTrip> trips = new ArrayList<>();

    public ConfirmTrip confirmTrip(Passenger passenger, Driver driver, int distance, int duration) {
        ConfirmTrip trip = new ConfirmTrip(passenger, driver, distance, duration);
        trips.add(trip);

        System.out.println("Trip Confirmed with ID: " + trip.getTripId());
        return trip;
    }

    public void startTrip(int tripId) {
        ConfirmTrip trip = findTripById(tripId);

        if (trip != null) {
            trip.setTripStatus("ONGOING");
            System.out.println("Trip Started!");
        } else {
            System.out.println("Trip not found!");
        }
    }

    public void endTrip(int tripId) {
        ConfirmTrip trip = findTripById(tripId);

        if (trip != null) {
            trip.setTripStatus("COMPLETED");
            System.out.println("Trip Completed!");
        } else {
            System.out.println("Trip not found!");
        }
    }

    
    public ConfirmTrip findTripById(int id) {
        for (ConfirmTrip t : trips) {
            if (t.getTripId() == id) {
                return t;
            }
        }
        return null;
    }
    
    public void displayTrips() {
        if (trips.isEmpty()) {
            System.out.println("No trips available!");
            return;
        }

        for (ConfirmTrip t : trips) {
            System.out.println("--------------------------------");
            System.out.println("Trip ID: " + t.getTripId());
            System.out.println("Passenger: " + t.getPassenger().getName());
            System.out.println("Driver: " + t.getDriver().getName());
            System.out.println("Distance: " + t.getDistance());
            System.out.println("Duration: " + t.getDuration());
            System.out.println("Status: " + t.getTripStatus());
        }
    }
}