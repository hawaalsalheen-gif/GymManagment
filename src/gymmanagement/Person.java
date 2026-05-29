package gymmanagement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
// كلاس مجرد (Abstract) يمثل الأساس لكل الأشخاص في المنظومة
public abstract class Person {
    // الخصائص private لتطبيق الـ Encapsulation
    private int id;
    private String name;
    private String phone;

    // الـ Constructor لتجهيز البيانات عند الوراثة
    public Person(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    // دوال الـ Getters و Setters للوصول الآمن للبيانات
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    // دالة مجردة لإجبار الكلاسات الأخرى على تحديد صلاحياتها ودورها
    public abstract void displayRole();
}