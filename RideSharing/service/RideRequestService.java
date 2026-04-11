package RideSharing.service;

import RideSharing.model.Driver;
import RideSharing.model.Passenger;
import RideSharing.model.RideRequest;

import java.util.ArrayList;
import java.util.List;

public class RideRequestService {

    private List<RideRequest> requests = new ArrayList<>();

    public RideRequest createRequest(Driver driver, Passenger passenger) {
        RideRequest request = new RideRequest(driver, passenger);
        request.setStatus("PENDING");

        requests.add(request);

        System.out.println("Ride Request Created with ID: " + request.getreqid());
        return request;
    }
    public void displayAllRequests() {
        if (requests.isEmpty()) {
            System.out.println("No Ride Requests Found!");
            return;
        }

        for (RideRequest r : requests) {
            System.out.println("--------------------------------");
            System.out.println("Request ID: " + r.getreqid());
            System.out.println("Passenger: " + r.getpassenger().getName());
            System.out.println("Driver: " + r.getdriver().getName());
            System.out.println("Status: " + r.getstatus());
        }
    }
    public RideRequest findRequestById(int id) {
        for (RideRequest r : requests) {
            if (r.getreqid() == id) {
                return r;
            }
        }
        return null;
    }
    public void acceptRide(int requestId) {
        RideRequest request = findRequestById(requestId);

        if (request != null) {
            request.setStatus("ACCEPTED");
            System.out.println("Ride Accepted!");
        } else {
            System.out.println("Request not found!");
        }
    }

    public void rejectRide(int requestId) {
        RideRequest request = findRequestById(requestId);

        if (request != null) {
            request.setStatus("REJECTED");
            System.out.println("Ride Rejected!");
        } else {
            System.out.println("Request not found!");
        }
    }

    public void cancelRide(int requestId) {
        RideRequest request = findRequestById(requestId);

        if (request != null) {
            request.setStatus("CANCELLED");
            System.out.println("Ride Cancelled!");
        } else {
            System.out.println("Request not found!");
        }
    }
}