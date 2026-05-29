
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gymmanagement;
/**
 *
 * @author hp
 */
// Interface لتطبيق جزء من مفهوم الـ Polymorphism ومعالجة صلاحيات الدخول
public interface Authenticatable {
    // دالة مجردة يجب على الموظفين والمدراء تطبيقها
    boolean login(String username, String password);
}
