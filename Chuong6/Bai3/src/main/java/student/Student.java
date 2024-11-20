/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author pc
 */
public class Student {
    private String code;
    private String name;
    private String dob;
    private String gender;

    public Student() {
    }

    public Student(String code, String name, String dob, String gender) {
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", dob=" + dob + ", gender=" + gender + '}';
    }
    
}
