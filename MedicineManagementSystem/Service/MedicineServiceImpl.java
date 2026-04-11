package MedicineManagementSystem.Service;

import MedicineManagementSystem.Model.Medicine;
import MedicineManagementSystem.Repository.MedicineRepository;

import java.util.ArrayList;

public class MedicineServiceImpl implements MedicineService {

    private MedicineRepository medicineRepository;
    private int medId = 1;

    public MedicineServiceImpl() {
        medicineRepository = new MedicineRepository();
    }

    @Override
    public void addMedicine(String name, int dose, double price) {
        Medicine medicine = new Medicine(medId++, name, dose, price);

        if (medicineRepository.addMedicine(medicine)) {
            System.out.println("Medicine Added Successfully");
        } else {
            System.out.println("Not added");
        }
    }

    @Override
    public void displayAllMedicine() {
        ArrayList<Medicine> medicineDb = medicineRepository.getAllMedicine();

        for (Medicine med : medicineDb) {
            System.out.println(
            "Name: " + med.getMedicineName() +
            ", Dose: " + med.getQuantity() +
            ", Price: " + med.price()
            );
        }
    }
}

