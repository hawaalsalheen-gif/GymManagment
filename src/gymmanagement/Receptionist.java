package gymmanagement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

public class Receptionist extends Person implements Authenticatable {
    private String shiftTime; // دوام الموظف: صباحي أو مسائي

    public Receptionist(int id, String name, String phone, String shiftTime) {
        super(id, name, phone);
        this.shiftTime = shiftTime;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Receptionist Desk. Shift: " + shiftTime);
    }

    // تطبيق الدالة القادمة من الـ Interface (Authenticatable)
    @Override
    public boolean login(String username, String password) {
        // التحقق الافتراضي (سيتم ربطه بقاعدة البيانات لاحقاً)
        return username.equals("rc") && password.equals("123");
    }
}