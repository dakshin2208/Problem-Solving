package RideSharing.service;

import RideSharing.model.Cancellation;
import RideSharing.model.RideRequest;
import RideSharing.model.Users;

import java.util.ArrayList;
import java.util.List;

public class CancellationService {

    private List<Cancellation> cancellations = new ArrayList<>();

    public void cancelRide(RideRequest request, Users user, String date, String reason) {

        if (request == null) {
            System.out.println("Invalid Ride Request!");
            return;
        }

        request.setStatus("CANCELLED");

        Cancellation cancel = new Cancellation(request, user, date, reason);
        cancellations.add(cancel);

        System.out.println("Ride Cancelled Successfully! Cancel ID: " + cancel.getCancelId());
    }

    public void displayCancellations() {

        if (cancellations.isEmpty()) {
            System.out.println("No cancellations found!");
            return;
        }

        for (Cancellation c : cancellations) {
            System.out.println("--------------------------------");
            System.out.println("Cancel ID: " + c.getCancelId());
            System.out.println("User: " + c.getUser().getName());
            System.out.println("Ride ID: " + c.getRide().getreqid());
            System.out.println("Date: " + c.getCancelledOn());
            System.out.println("Reason: " + c.getReason());
        }
    }
}