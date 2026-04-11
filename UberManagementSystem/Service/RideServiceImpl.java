package UberManagementSystem.Service;

import UberManagementSystem.Util.RideNode;

public class RideServiceImpl implements RideService {

    RideNode head;
    RideNode tail;

    public void fromThePassenger(int sno , String name , String pickup , String destination ,int km){

    }
    public void insert(int sno, String userName, String pickup, String destination, int km) {

        RideNode node = new RideNode(sno, userName, "", pickup, destination, km);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        System.out.println("Ride Added Successfully");
    }



}