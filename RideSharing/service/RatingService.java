package RideSharing.service;

import RideSharing.model.ConfirmTrip;
import RideSharing.model.Ratings;

import java.util.ArrayList;
import java.util.List;

public class RatingService {

    private List<Ratings> ratingsList = new ArrayList<>();

    public void addRating(ConfirmTrip trip, int rating, String feedback) {

        if (trip == null) {
            System.out.println("Invalid Trip!");
            return;
        }

        if (!trip.getTripStatus().equals("COMPLETED")) {
            System.out.println("Trip not completed yet!");
            return;
        }

        if (rating < 1 || rating > 5) {
            System.out.println("Rating must be between 1 and 5!");
            return;
        }

        Ratings r = new Ratings(trip, rating, feedback);
        ratingsList.add(r);

        System.out.println("Rating submitted successfully! ID: " + r.getRatingId());
    }
    
    public void displayRatings() {

        if (ratingsList.isEmpty()) {
            System.out.println("No ratings available!");
            return;
        }

        for (Ratings r : ratingsList) {
            System.out.println("--------------------------------");
            System.out.println("Rating ID: " + r.getRatingId());
            System.out.println("Trip ID: " + r.getTrip().getTripId());
            System.out.println("Rating: " + r.getRating());
            System.out.println("Feedback: " + r.getFeedback());
        }
    }
}