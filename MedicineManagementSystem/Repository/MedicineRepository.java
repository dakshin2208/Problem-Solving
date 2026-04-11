package MedicineManagementSystem.Repository;

import MedicineManagementSystem.Model.Medicine;

import java.util.ArrayList;

public class MedicineRepository {
    private ArrayList<Medicine> medicineDb = new ArrayList<>();
     public MedicineRepository(){

    }

    public boolean addMedicine(Medicine medicine){
        medicineDb.add(medicine);
        return true;
    }
    public ArrayList<Medicine> getAllMedicine(){
        return medicineDb;
    }
}
