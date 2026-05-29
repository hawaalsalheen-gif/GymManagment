package gymmanagement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

public class Member extends Person {
    private String membershipType; // نوع الاشتراك: شهري أو سنوي

    public Member(int id, String name, String phone, String membershipType) {
        super(id, name, phone); // استدعاء Constructor الكلاس الأساسي باستخدام super
        this.membershipType = membershipType;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    // تطبيق الـ Method Overriding لإظهار دور المشترك
    @Override
    public void displayRole() {
        System.out.println("Role: Gym Member. Trainee ID: " + getId() + ", Plan: " + membershipType);
    }
}