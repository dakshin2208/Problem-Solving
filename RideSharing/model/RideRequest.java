package RideSharing.model;

public class RideRequest {
    private int request_id;
    private static int req=0;
    private String status;
    Driver driver;
    Passenger passenger;
    public RideRequest( Driver driver,Passenger passenger){
        this.request_id=++req;
        this.driver=driver;
        this.passenger=passenger;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public int getreqid(){
        return request_id;
    }
    public Driver getdriver(){
        return driver;
    }
    public Passenger getpassenger(){
        return passenger;
    }
    public String getstatus(){
        return status;
    }
}
