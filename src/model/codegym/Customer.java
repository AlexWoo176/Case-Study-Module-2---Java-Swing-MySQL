/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.codegym;

/**
 *
 * @author Admin
 */
public class Customer {
    private int id, age;
    private String fullname;
    private String username;
    private String password;
    private String retypepass;
    private String gender;
    private String address;
    private String phone;
    private String role;

    public Customer() {
    }

    public Customer(int id, int age, String fullname, String username, String password, String retypepass, String gender, String address, String phone, String role) {
        this.id = id;
        this.age = age;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.retypepass = retypepass;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypepass() {
        return retypepass;
    }

    public void setRetypepass(String retypepass) {
        this.retypepass = retypepass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
