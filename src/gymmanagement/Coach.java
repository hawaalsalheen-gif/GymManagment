package gymmanagement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hp
 */

public class Coach extends Person {
    private String specialization; // تخصص المدرب (مثلاً: كمال أجسام، فتنس)

    public Coach(int id, String name, String phone, String specialization) {
        super(id, name, phone);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Fitness Coach. Specialization: " + specialization);
    }
}