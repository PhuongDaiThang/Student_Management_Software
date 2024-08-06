package models;

import utils.Level;

import java.time.LocalDate;

public class Student extends Person {
    private String studentId;
    private String school;
    private int yearStart;
    private double gpa;
    private Level level;

    public Student(String name, LocalDate dateOfBirth, String address, double height,
                   double weight, String studentId, String school, int yearStart, double gpa) {
        super(name, dateOfBirth, address, height, weight);
        this.studentId = studentId;
        this.school = school;
        this.yearStart = yearStart;
        this.gpa = gpa;
        setLevel(gpa);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
        setLevel(gpa);
    }

    public Level getLevel() {
        return level;
    }

    private void setLevel(Double gpa) {
        if (gpa == null) {
            level = null;
            return;
        }
        if (gpa < 3) {
            level = Level.KEM;
        } else if (gpa < 5) {
            level = Level.YEU;
        } else if (gpa < 6.5) {
            level = Level.TRUNG_BINH;
        } else if (gpa < 7.5) {
            level = Level.KHA;
        } else if (gpa < 9) {
            level = Level.GIOI;
        } else {
            level = Level.XUAT_SAC;
        }
    }

    public String toString() {
        return super.toString() + "\n" +"Mã sinh viên: "+ studentId +"\n"+ "Trường: " +school + "\n" +"Năm bắt đầu: " +yearStart + "\n" +"Điểm: " + gpa + "\n" +"Xếp loại: "+ level;
    }
}