package controllers;

import models.Student;
import utils.Level;
import utils.Validator;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Controller {
    public static void createStudent(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        while (!Validator.validateName(name)) {
            System.out.println("Tên không hợp lệ! Nhập lại: ");
            name = scanner.nextLine();
        }
        System.out.println("Nhập ngày sinh của sinh viên (dd/MM/yyyy): ");
        String stringDateOfBirth = scanner.nextLine();
        while (!Validator.validateDateOfBirth(stringDateOfBirth)) {
            System.out.println("Ngày sinh không hợp lệ! Nhập lại: ");
            stringDateOfBirth = scanner.nextLine();
        }
        LocalDate dateOfBirth = LocalDate.parse(stringDateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập địa chỉ của sinh viên : ");
        String address = scanner.nextLine();
        while (!Validator.validateAddress(address)) {
            System.out.println("Địa chỉ không hợp lệ! Nhập lại: ");
            address = scanner.nextLine();
        }
        System.out.println("Nhập chiều cao của sinh viên (50-300cm) : ");
        String stringHeight = scanner.nextLine();
        while (!Validator.validateHeight(stringHeight)) {
            System.out.println("Chiều cao không hợp lệ (Chiều cao trong khoảng 50-300(cm))! Nhập lại: ");
            stringHeight = scanner.nextLine();
        }
        Double height = stringHeight.isEmpty() ? null : Double.parseDouble(stringHeight);
        System.out.println("Nhập cân nặng của sinh viên (5-1000kg): ");
        String stringWeight = scanner.nextLine();
        while (!Validator.validateWeight(stringWeight)) {
            System.out.println("Cân nặng không hợp lệ (Cân nặng trong khoảng 5-1000(kg))! Nhập lại: ");
            stringWeight = scanner.nextLine();
        }
        Double weight = stringWeight.isEmpty() ? null : Double.parseDouble(stringWeight);
        System.out.println("Nhập mã sinh viên: ");
        String studenId = scanner.nextLine();
        while (!Validator.validatestudenId(studenId, students)) {
            System.out.println("Mã sinh viên không hợp lệ! Nhập lại: ");
            studenId = scanner.nextLine();
        }
        System.out.println("Nhập tên trường của sinh viên: ");
        String school = scanner.nextLine();
        while (!Validator.validateSchool(school)) {
            System.out.println("Tên trường không hợp lệ! Nhập lại: ");
            school = scanner.nextLine();
        }
        System.out.println("Nhập năm bắt đầu của sinh viên: ");
        String stringyearStart = scanner.nextLine();
        while (!Validator.validateyearStart(stringyearStart)) {
            System.out.println("Năm bắt đầu không hợp lệ! Nhập lại: ");
            stringyearStart = scanner.nextLine();
        }
        int yearStart = Integer.parseInt(stringyearStart);
        System.out.println("Nhập điểm GPA của sinh viên: ");
        String stringGpa = scanner.nextLine();
        while (!Validator.validateGpa(stringGpa)) {
            System.out.println("Điểm GPA của sinh viên không hợp lệ! Nhập lại: ");
            stringGpa = scanner.nextLine();
        }
        Double gpa = stringGpa.isEmpty() ? null : Double.parseDouble(stringGpa);
        Student newStudent = new Student(name, dateOfBirth, address, height, weight, studenId, school, yearStart, gpa);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
        System.out.println(newStudent);
    }

    public static void createStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        while (!Validator.validateName(name)) {
            System.out.println("Tên không hợp lệ! Nhập lại: ");
            name = scanner.nextLine();
        }
        System.out.println("Nhập ngày sinh của sinh viên (dd/MM/yyyy): ");
        String stringDateOfBirth = scanner.nextLine();
        while (!Validator.validateDateOfBirth(stringDateOfBirth)) {
            System.out.println("Ngày sinh không hợp lệ! Nhập lại: ");
            stringDateOfBirth = scanner.nextLine();
        }
        LocalDate dateOfBirth = LocalDate.parse(stringDateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhập địa chỉ của sinh viên: ");
        String address = scanner.nextLine();
        while (!Validator.validateAddress(address)) {
            System.out.println("Địa chỉ không hợp lệ! Nhập lại: ");
            address = scanner.nextLine();
        }
        System.out.println("Nhập chiều cao của sinh viên (50-300cm): ");
        String stringHeight = scanner.nextLine();
        while (!Validator.validateHeight(stringHeight)) {
            System.out.println("Chiều cao không hợp lệ (Chiều cao trong khoảng 50-300(cm))! Nhập lại: ");
            stringHeight = scanner.nextLine();
        }
        Double height = stringHeight.isEmpty() ? null : Double.parseDouble(stringHeight);
        System.out.println("Nhập cân nặng của sinh viên (5-1000kg): ");
        String stringWeight = scanner.nextLine();
        while (!Validator.validateWeight(stringWeight)) {
            System.out.println("Cân nặng không hợp lệ (Cân nặng trong khoảng 5-1000(kg))! Nhập lại: ");
            stringWeight = scanner.nextLine();
        }
        Double weight = stringWeight.isEmpty() ? null : Double.parseDouble(stringWeight);
        System.out.println("Nhập mã sinh viên: ");
        String studenId = scanner.nextLine();
        while (!Validator.validatestudenId(studenId, students)) {
            System.out.println("Mã sinh viên không hợp lệ! Nhập lại: ");
            studenId = scanner.nextLine();
        }
        System.out.println("Nhập tên trường của sinh viên: ");
        String school = scanner.nextLine();
        while (!Validator.validateSchool(school)) {
            System.out.println("Tên trường không hợp lệ! Nhập lại: ");
            school = scanner.nextLine();
        }
        System.out.println("Nhập năm bắt đầu của sinh viên: ");
        String stringyearStart = scanner.nextLine();
        while (!Validator.validateyearStart(stringyearStart)) {
            System.out.println("Năm bắt đầu không hợp lệ! Nhập lại: ");
            stringyearStart = scanner.nextLine();
        }
        int yearStart = Integer.parseInt(stringyearStart);
        System.out.println("Nhập điểm GPA của sinh viên: ");
        String stringGpa = scanner.nextLine();
        while (!Validator.validateGpa(stringGpa)) {
            System.out.println("Điểm GPA của sinh viên không hợp lệ! Nhập lại: ");
            stringGpa = scanner.nextLine();
        }
        Double gpa = stringGpa.isEmpty() ? null : Double.parseDouble(stringGpa);
        Student newStudent = new Student(name, dateOfBirth, address, height, weight, studenId, school, yearStart, gpa);
        students.add(newStudent);
        System.out.println(newStudent);
    }

    public static Student readStudent(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên: ");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student != null) {
                if (student.getpersonId() == id) {
                    return student;
                }
            }
        }
        return null;
    }

    public static Student readStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sinh viên: ");
        int id = scanner.nextInt();
        for (Student student : students) {
            if (student.getpersonId() == id) {
                return student;
            }
        }
        return null;
    }

    public static void updateStudent(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        Student student = readStudent(students);
        if (student == null) {
            System.out.println("ID không hợp lệ!");
            return;
        }
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            while (!Validator.validateName(name)) {
                System.out.println("Tên không hợp lệ! Nhập lại: ");
                name = scanner.nextLine();
            }
            student.setName(name);
        }
        System.out.println("Nhập ngày sinh của sinh viên (dd/MM/yyyy): ");
        String stringDateOfBirth = scanner.nextLine();
        if (!stringDateOfBirth.isEmpty()) {
            while (!Validator.validateDateOfBirth(stringDateOfBirth)) {
                System.out.println("Ngày sinh không hợp lệ! Nhập lại: ");
                stringDateOfBirth = scanner.nextLine();
            }
            LocalDate dateOfBirth = LocalDate.parse(stringDateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            student.setDateOfBirth(dateOfBirth);
        }
        System.out.println("Nhập địa chỉ của sinh viên: ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) {
            while (!Validator.validateAddress(address)) {
                System.out.println("Địa chỉ không hợp lệ! Nhập lại: ");
                address = scanner.nextLine();
            }
            student.setAddress(address);
        }
        System.out.println("Nhập chiều cao của sinh viên (50-300cm): ");
        String stringHeight = scanner.nextLine();
        if (!stringHeight.isEmpty()) {
            while (!Validator.validateHeight(stringHeight)) {
                System.out.println("Chiều cao không hợp lệ (Chiều cao trong khoảng 50-300(cm))! Nhập lại: ");
                stringHeight = scanner.nextLine();
            }
            Double height = Double.parseDouble(stringHeight);
            student.setHeight(height);
        }
        System.out.println("Nhập cân nặng của sinh viên (5-1000kg): ");
        String stringWeight = scanner.nextLine();
        if (!stringWeight.isEmpty()) {
            while (!Validator.validateWeight(stringWeight)) {
                System.out.println("Cân nặng không hợp lệ (Cân nặng trong khoảng 5-1000(kg))! Nhập lại: ");
                stringWeight = scanner.nextLine();
            }
            Double weight = Double.parseDouble(stringWeight);
            student.setWeight(weight);
        }
        System.out.println("Nhập mã sinh viên: ");
        String studenId = scanner.nextLine();
        if (!studenId.isEmpty()) {
            while (!Validator.validatestudenId(studenId, students)) {
                System.out.println("Mã sinh viên không hợp lệ! Nhập lại: ");
                studenId = scanner.nextLine();
            }
            student.setStudentId(studenId);
        }
        System.out.println("Nhập tên trường của sinh viên: ");
        String school = scanner.nextLine();
        if (!school.isEmpty()) {
            while (!Validator.validateSchool(school)) {
                System.out.println("Tên trường không hợp lệ! Nhập lại: ");
                school = scanner.nextLine();
            }
            student.setSchool(school);
        }
        System.out.println("Nhập năm bắt đầu của sinh viên: ");
        String stringyearStart = scanner.nextLine();
        if (!stringyearStart.isEmpty()) {
            while (!Validator.validateyearStart(stringyearStart)) {
                System.out.println("Năm bắt đầu không hợp lệ! Nhập lại: ");
                stringyearStart = scanner.nextLine();
            }
            int yearStart = Integer.parseInt(stringyearStart);
            student.setYearStart(yearStart);
        }
        System.out.println("Nhập điểm GPA của sinh viên (tuỳ chọn): ");
        String stringGpa = scanner.nextLine();
        if (!stringGpa.isEmpty()) {
            while (!Validator.validateGpa(stringGpa)) {
                System.out.println("Điểm GPA của sinh viên không hợp lệ! Nhập lại: ");
                stringGpa = scanner.nextLine();
            }
            Double gpa = Double.parseDouble(stringGpa);
            student.setGpa(gpa);
        }
        System.out.println(student);
    }

    public static void updateStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        Student student = readStudent(students);
        if (student == null) {
            System.out.println("ID không hợp lệ!");
            return;
        }
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            while (!Validator.validateName(name)) {
                System.out.println("Tên không hợp lệ! Nhập lại: ");
                name = scanner.nextLine();
            }
            student.setName(name);
        }
        System.out.println("Nhập ngày sinh của sinh viên (dd/MM/yyyy): ");
        String stringDateOfBirth = scanner.nextLine();
        if (!stringDateOfBirth.isEmpty()) {
            while (!Validator.validateDateOfBirth(stringDateOfBirth)) {
                System.out.println("Ngày sinh không hợp lệ! Nhập lại: ");
                stringDateOfBirth = scanner.nextLine();
            }
            LocalDate dateOfBirth = LocalDate.parse(stringDateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            student.setDateOfBirth(dateOfBirth);
        }
        System.out.println("Nhập địa chỉ của sinh viên (tuỳ chọn): ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) {
            while (!Validator.validateAddress(address)) {
                System.out.println("Địa chỉ không hợp lệ! Nhập lại: ");
                address = scanner.nextLine();
            }
            student.setAddress(address);
        }
        System.out.println("Nhập chiều cao của sinh viên (50-300cm) (tuỳ chọn): ");
        String stringHeight = scanner.nextLine();
        if (!stringHeight.isEmpty()) {
            while (!Validator.validateHeight(stringHeight)) {
                System.out.println("Chiều cao không hợp lệ (Chiều cao trong khoảng 50-300(cm))! Nhập lại: ");
                stringHeight = scanner.nextLine();
            }
            Double height = Double.parseDouble(stringHeight);
            student.setHeight(height);
        }
        System.out.println("Nhập cân nặng của sinh viên (5-1000kg) (tuỳ chọn): ");
        String stringWeight = scanner.nextLine();
        if (!stringWeight.isEmpty()) {
            while (!Validator.validateWeight(stringWeight)) {
                System.out.println("Cân nặng không hợp lệ (Cân nặng trong khoảng 5-1000(kg))! Nhập lại: ");
                stringWeight = scanner.nextLine();
            }
            Double weight = Double.parseDouble(stringWeight);
            student.setWeight(weight);
        }
        System.out.println("Nhập mã sinh viên (xxxxxxxxxx): ");
        String studenId = scanner.nextLine();
        if (!studenId.isEmpty()) {
            while (!Validator.validatestudenId(studenId, students)) {
                System.out.println("Mã sinh viên không hợp lệ! Nhập lại: ");
                studenId = scanner.nextLine();
            }
            student.setStudentId(studenId);
        }
        System.out.println("Nhập tên trường của sinh viên: ");
        String school = scanner.nextLine();
        if (!school.isEmpty()) {
            while (!Validator.validateSchool(school)) {
                System.out.println("Tên trường không hợp lệ! Nhập lại: ");
                school = scanner.nextLine();
            }
            student.setSchool(school);
        }
        System.out.println("Nhập năm bắt đầu của sinh viên: ");
        String stringyearStart = scanner.nextLine();
        if (!stringyearStart.isEmpty()) {
            while (!Validator.validateyearStart(stringyearStart)) {
                System.out.println("Năm bắt đầu không hợp lệ! Nhập lại: ");
                stringyearStart = scanner.nextLine();
            }
            int yearStart = Integer.parseInt(stringyearStart);
            student.setYearStart(yearStart);
        }
        System.out.println("Nhập điểm GPA của sinh viên (tuỳ chọn): ");
        String stringGpa = scanner.nextLine();
        if (!stringGpa.isEmpty()) {
            while (!Validator.validateGpa(stringGpa)) {
                System.out.println("Điểm GPA của sinh viên không hợp lệ! Nhập lại: ");
                stringGpa = scanner.nextLine();
            }
            Double gpa = Double.parseDouble(stringGpa);
            student.setGpa(gpa);
        }
        System.out.println(student);
    }

    public static void deleteStudent(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        Student student = readStudent(students);
        if (student == null) {
            System.out.println("ID không hợp lệ!");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getpersonId() == student.getpersonId()) {
                students[i] = null;
                System.out.println("Đã xóa sinh viên có ID " + student.getpersonId());
                return;
            }
        }
    }

    public static void deleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        Student student = readStudent(students);
        if (student == null) {
            System.out.println("ID không hợp lệ!");
            return;
        }
        students.remove(student);
        System.out.println("Đã xóa sinh viên có ID " + student.getpersonId());
    }

    public static void displayLevel(Student[] students) {
        int studentsLength = 0;
        Map<Level, Integer> levelMap = new HashMap<>();
        for (Student student : students) {
            if (student != null) {
                studentsLength++;
                if (student.getLevel() != null) {
                    if (levelMap.containsKey(student.getLevel())) {
                        levelMap.put(student.getLevel(), levelMap.get(student.getLevel()) + 1);
                    } else {
                        levelMap.put(student.getLevel(), 1);
                    }
                }
            }
        }
        if (!levelMap.isEmpty()) {
            List<Map.Entry<Level, Integer>> list = new ArrayList<>(levelMap.entrySet());
            list.sort(Map.Entry.comparingByValue());
            Collections.reverse(list);
            for (Map.Entry<Level, Integer> entry : list) {
                double percentage = (double) entry.getValue() / studentsLength * 100;
                if (entry.getKey() != null) {
                    System.out.println(entry.getKey() + " " + percentage + "%");
                }
            }
        } else {
            System.out.println("Không có số liệu!");
        }
    }

    public static void displayLevel(ArrayList<Student> students) {
        Map<Level, Integer> levelMap = new TreeMap<>();
        for (Student student : students) {
            if (student.getLevel() != null) {
                if (levelMap.containsKey(student.getLevel())) {
                    levelMap.put(student.getLevel(), levelMap.get(student.getLevel()) + 1);
                } else {
                    levelMap.put(student.getLevel(), 1);
                }
            }
        }
        if (!levelMap.isEmpty()) {
            List<Map.Entry<Level, Integer>> list = new ArrayList<>(levelMap.entrySet());
            list.sort(Map.Entry.comparingByValue());
            Collections.reverse(list);
            for (Map.Entry<Level, Integer> entry : list) {
                double percentage = (double) entry.getValue() / students.size() * 100;
                if (entry.getKey() != null) {
                    System.out.println(entry.getKey() + " " + percentage + "%");
                }
            }
        } else {
            System.out.println("Không có số liệu!");
        }
    }

    public static void displayPoint(Student[] students) {
        int studentsLength = 0;
        Map<Double, Integer> pointMap = new TreeMap<>();
        for (Student student : students) {
            if (student != null) {
                studentsLength++;
                if (student != null) {
                    if (pointMap.containsKey(student.getGpa())) {
                        pointMap.put(student.getGpa(), pointMap.get(student.getGpa()) + 1);
                    } else {
                        pointMap.put(student.getGpa(), 1);
                    }
                }
            }
        }
        if (!pointMap.isEmpty()) {
            for (Map.Entry<Double, Integer> entry : pointMap.entrySet()) {
                double percentage = (double) entry.getValue() / studentsLength * 100;
                System.out.println(entry.getKey() + " " + percentage + "%");
            }
        } else {
            System.out.println("Không có số liệu!");
        }
    }

    public static void displayPoint(ArrayList<Student> students) {
        Map<Double, Integer> pointMap = new TreeMap<>();
        for (Student student : students) {
            if (student.getLevel() != null) {
                if (pointMap.containsKey(student.getGpa())) {
                    pointMap.put(student.getGpa(), pointMap.get(student.getGpa()) + 1);
                } else {
                    pointMap.put(student.getGpa(), 1);
                }
            }
        }
        if (!pointMap.isEmpty()) {
            for (Map.Entry<Double, Integer> entry : pointMap.entrySet()) {
                double percentage = (double) entry.getValue() / students.size() * 100;
                System.out.println(entry.getKey() + " " + percentage + "%");
            }
        } else {
            System.out.println("Không có số liệu!");
        }
    }

    public static void getStudentByLevel(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mức độ (KEM/YEU/TRUNG_BINH/KHA/GIOI/XUAT_SAC): ");
        String s = scanner.nextLine();
        Level level = Level.valueOf(s);
        ArrayList<Student> studentListByLevel = new ArrayList<>();
        for (Student student : students) {
            if (student != null) {
                if (student.getLevel().equals(level)) {
                    studentListByLevel.add(student);
                }
            }
        }
        if (!studentListByLevel.isEmpty()) {
            for (Student student : studentListByLevel) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không có số liệu!");
        }
    }

    public static void getStudentByLevel(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mức độ (KEM/YEU/TRUNG_BINH/KHA/GIOI/XUAT_SAC): ");
        String s = scanner.nextLine();
        Level level = Level.valueOf(s);
        ArrayList<Student> studentListByLevel = new ArrayList<>();
        for (Student student : students) {
            if (student.getLevel().equals(level)) {
                studentListByLevel.add(student);
            }
        }
        if (!studentListByLevel.isEmpty()) {
            for (Student student : studentListByLevel) {
                System.out.println(student);
            }
        } else {
            System.out.println("Không có số liệu!");
        }
    }

    public static void writeFile(Student[] students) throws IOException {
        FileWriter fileWriter = new FileWriter("students.txt");
        for (Student student : students) {
            if (student != null) fileWriter.append(student.toString()).append("\n");
        }
        fileWriter.close();
    }

    public static void writeFile(ArrayList<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter("students.txt");
        for (Student student : students) {
            if (student != null) fileWriter.append(student.toString()).append("\n");
        }
        fileWriter.close();
    }
}
