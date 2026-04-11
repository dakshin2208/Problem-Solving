package MedicineManagementSystem.Model;

public class Medicine {
    private int medId;
    private String medicineName;
    private int quantity;
    private double price;

    public Medicine(){};

    public Medicine(int medId, String medicineName, int quantity, double price) {
        this.medId = medId;
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMedicineName(){
        return medicineName;
    }
    public int getQuantity(){
        return quantity;
    }
    public double price(){
        return price;
    }


}
