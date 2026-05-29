package gymmanagement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Admin extends Person implements Authenticatable {
    
    public Admin(int id, String name, String phone) {
        super(id, name, phone);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: System Administrator. Full Access Granted.");
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }
}
