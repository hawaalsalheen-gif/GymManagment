package gymmanagement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */


import java.util.ArrayList;

public class GymManagement {
    public static void main(String[] args) {
        // إنشاء قائمة تجمع كل الأشخاص لتطبيق مفهوم تعدد الأشكال (Polymorphism)
        ArrayList<Person> gymUsers = new ArrayList<>();

        // إضافة بيانات تجريبية داخل القائمة
        gymUsers.add(new Member(101, "Hawa AL-Salheen", "0912345678", "Monthly Plan"));
        gymUsers.add(new Coach(202, "Captain Ahmed", "0921112233", "Bodybuilding"));
        gymUsers.add(new Receptionist(303, "Sara Ali", "0945556677", "Morning Shift"));

        System.out.println("====== Gym Management System - Testing Core OOP ======");
        
        // الدوران على القائمة واستدعاء دالة displayRole (تطبيق الـ Polymorphism)
        for (Person user : gymUsers) {
            user.displayRole();
        }

        System.out.println("\n====== Testing Secure Login Interface ======");
        // تجربة واجهة تسجيل الدخول لموظف الاستقبال
        Receptionist receptionist = new Receptionist(303, "Sara Ali", "0945556677", "Morning Shift");
        boolean loginResult = receptionist.login("rc", "123");
        System.out.println("Receptionist Login with username 'rc' & password '123': " + (loginResult ? "SUCCESS ✅" : "FAILED ❌"));
    }
}