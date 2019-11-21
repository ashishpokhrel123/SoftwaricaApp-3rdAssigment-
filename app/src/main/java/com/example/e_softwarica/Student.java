package com.example.e_softwarica;

public class Student {
    private String Name;
    private int Age;
    private String Address;
    private String Gender;
    private int Image;




    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public Student(String Name, String Address, String Gender, int age, int image){
        this.Name=Name;
        this.Address=Address;
        this.Age=age;
        this.Image = image;
        this.Gender= Gender;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


}
