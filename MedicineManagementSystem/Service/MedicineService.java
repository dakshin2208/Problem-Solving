package MedicineManagementSystem.Service;

import MedicineManagementSystem.Model.Medicine;

import java.util.ArrayList;

public interface MedicineService {
    public void addMedicine(String name,int dose , double price);
    void displayAllMedicine();
}
