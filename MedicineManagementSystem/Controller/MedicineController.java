package MedicineManagementSystem.Controller;

import MedicineManagementSystem.Service.MedicineService;
import MedicineManagementSystem.Service.MedicineServiceImpl;

public class MedicineController {
    MedicineService medicineService;

    public MedicineController(){
        medicineService = new MedicineServiceImpl();
    };

    public void addMedicine(String name  ,int quantity , double price){
        medicineService.addMedicine(name, quantity, price);
    }
    public void displayAllMedicine(){
        medicineService.displayAllMedicine();
    }

}
