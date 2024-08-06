package models;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private static int id = 1;
    protected int personId;
    private String name;
    private LocalDate dateOfBirth;
    private String address;
    private double height;
    private double weight;

    public Person(String name, LocalDate dateOfBirth, String address, double weight, double height) {
        this.personId = ++id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.height = height;
        this.weight = weight;
    }

    public static int getpersonId() {
        return getpersonId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Thông tin: \n" + "Tên: " + name + "\n" + "Sinh nhật: "
                + dateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n"
                + "Địa chỉ: " + address + "\n" + "Chiều cao" + height + "\n" + "Cân nặng: " + weight;
    }
}
