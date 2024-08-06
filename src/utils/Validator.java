package utils;

import models.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.ArrayList;

public class Validator {
    public static boolean validateName(String name) {
        return isAlpha(name) && !name.isEmpty() && !name.isBlank() && name.length() <= Constants.MAX_NAME_LENGTH;
    }

    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateDateOfBirth(String stringDateOfBirth) {
        if (stringDateOfBirth == null || stringDateOfBirth.isEmpty()) {
            System.out.println("Ngày sinh không được để trống!");
            return false;
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateOfBirth = LocalDate.parse(stringDateOfBirth, formatter);
            
            int year = dateOfBirth.getYear();
            if (year < Constants.MIN_BIRTH_YEAR || year > Constants.MAX_BIRTH_YEAR) {
                System.out.println("Năm sinh phải nằm trong khoảng từ " + Constants.MIN_BIRTH_YEAR + " đến " + Constants.MAX_BIRTH_YEAR + "!");
                return false;
            }
            return true;
        } catch (DateTimeParseException e) {
            System.out.println("Ngày sinh không hợp lệ! Vui lòng nhập lại theo định dạng dd/MM/yyyy.");
            return false;
        }
    }
    
    public static boolean validateAddress(String address) {
        if (address.isEmpty()) {
            return true;
        } else {
            return address.length() <= Constants.MAX_ADDRESS_LENGTH;
        }
    }

    public static boolean validateHeight(String stringHeight) {
        if (stringHeight.isEmpty()) {
            return true;
        } else {
            float height = Float.parseFloat(stringHeight);
            return height >= Constants.MIN_HEIGHT && height <= Constants.MAX_HEIGHT;
        }
    }

    public static boolean validateWeight(String stringWeight) {
        if (stringWeight.isEmpty()) {
            return true;
        } else {
            float weight = Float.parseFloat(stringWeight);
            return weight >= Constants.MIN_WEIGHT && weight <= Constants.MAX_WEIGHT;
        }
    }

    public static boolean validatestudenId(String studenId, Student[] students) {
        if (studenId.length() != Constants.STUDENT_CODE_LENGTH) {
            return false;
        }
        for (Student student : students) {
            if (student != null) {
                if (student.getStudentId().equals(studenId)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validatestudenId(String studenId, ArrayList<Student> students) {
        if (studenId.length() != Constants.STUDENT_CODE_LENGTH) {
            return false;
        }
        for (Student student : students) {
            if (student.getStudentId().equals(studenId)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateSchool(String school) {
        return !school.isEmpty() && school.length() <= Constants.MAX_SCHOOL_NAME_LENGTH;
    }

    public static boolean validateyearStart(String stringyearStart) {
        if (!stringyearStart.isEmpty()) {
            int yearStart = Integer.parseInt(stringyearStart);
            return yearStart >= Constants.MIN_START_YEAR && yearStart <= Constants.MAX_START_YEAR;
        } else {
            return false;
        }
    }

    public static boolean validateGpa(String stringGpa) {
        if (stringGpa.isEmpty()) {
            return true;
        } else {
            float gpa = Float.parseFloat(stringGpa);
            return gpa >= Constants.MIN_GPA && gpa <= Constants.MAX_GPA;
        }
    }
}
