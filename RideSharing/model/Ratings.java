package RideSharing.model;

public class Ratings {

    private int ratingId;
    private static int r = 0;

    private int rating; // 1 to 5
    private String feedback;

    private ConfirmTrip trip;

    public Ratings(ConfirmTrip trip, int rating, String feedback) {
        this.ratingId = ++r;
        this.trip = trip;
        this.rating = rating;
        this.feedback = feedback;
    }

    public int getRatingId() {
        return ratingId;
    }

    public int getRating() {
        return rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public ConfirmTrip getTrip() {
        return trip;
    }
}