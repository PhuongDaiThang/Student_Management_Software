package views;

import controllers.Controller;
import models.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class menuView {
    private Student[] staticArrayStudent = new Student[100];
    private ArrayList<Student> dynamicArrayStudent = new ArrayList<Student>();

    public menuView() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn loại mảng: ");
            System.out.println("1. Mảng tĩnh");
            System.out.println("2. Mảng động");
            System.out.println("0. Thoát");
            try {
                int option = scanner.nextInt();
                if (option == 0) {
                    System.out.println("Thoát chương trình...");
                    break;
                } else if (option == 1) {
                    System.out.println("Chọn mảng tĩnh");
                    while (true) {
                        System.out.println("1. Tạo sinh viên.");
                        System.out.println("2. Đọc thông tin sinh viên.");
                        System.out.println("3. Cập nhật thông tin sinh viên.");
                        System.out.println("4. Xóa sinh viên.");
                        System.out.println("5. Hiển thị tỷ lệ phần trăm theo mức độ");
                        System.out.println("6. Hiển thị tỷ lệ phần trăm theo điểm GPA");
                        System.out.println("7. Danh sách sinh viên theo mức độ");
                        System.out.println("0. Thoát");
                        try {
                            int choice = scanner.nextInt();
                            if (choice == 0) {
                                System.out.println("Ghi file và thoát khỏi chức năng...");
                                Controller.writeFile(staticArrayStudent);
                                break;
                            }
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Tạo sinh viên");
                                    Controller.createStudent(staticArrayStudent);
                                    break;
                                case 2:
                                    System.out.println("2. Đọc thông tin sinh viên");
                                    if (staticArrayStudent.length == 0) {
                                        System.out.println("Danh sách sinh viên trống");
                                        break;
                                    }
                                    Student student = Controller.readStudent(staticArrayStudent);
                                    if (student == null) {
                                        System.out.println("ID không hợp lệ!");
                                        break;
                                    } else System.out.println(student);
                                    break;
                                case 3:
                                    System.out.println("3. Cập nhật thông tin sinh viên (Bỏ qua nếu không cập nhật)");
                                    Controller.updateStudent(staticArrayStudent);
                                    break;
                                case 4:
                                    System.out.println("4. Xóa sinh viên");
                                    Controller.deleteStudent(staticArrayStudent);
                                    break;
                                case 5:
                                    System.out.println("5. Hiển thị tỷ lệ phần trăm theo mức độ");
                                    Controller.displayLevel(staticArrayStudent);
                                    break;
                                case 6:
                                    System.out.println("6. Hiển thị tỷ lệ phần trăm theo điểm GPA");
                                    Controller.displayPoint(staticArrayStudent);
                                    break;
                                case 7:
                                    System.out.println("7. Danh sách sinh viên theo mức độ");
                                    Controller.getStudentByLevel(staticArrayStudent);
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ");
                            }
                        } catch (Exception e) {
                            System.out.println("Dữ liệu không hợp lệ! Vui lòng thử lại");
                            scanner.next();
                        }
                    }
                } else if (option == 2) {
                    System.out.println("Chọn mảng động");
                    while (true) {
                        System.out.println("1. Tạo sinh viên.");
                        System.out.println("2. Đọc thông tin sinh viên.");
                        System.out.println("3. Cập nhật thông tin sinh viên.");
                        System.out.println("4. Xóa sinh viên.");
                        System.out.println("5. Hiển thị tỷ lệ phần trăm theo mức độ");
                        System.out.println("6. Hiển thị tỷ lệ phần trăm theo điểm GPA");
                        System.out.println("7. Danh sách sinh viên theo mức độ");
                        System.out.println("0. Thoát");
                        try {
                            int choice = scanner.nextInt();
                            if (choice == 0) {
                                System.out.println("Ghi file và thoát khỏi chức năng...");
                                Controller.writeFile(dynamicArrayStudent);
                                break;
                            }
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Tạo sinh viên");
                                    Controller.createStudent(dynamicArrayStudent);
                                    break;
                                case 2:
                                    System.out.println("2. Đọc thông tin sinh viên");
                                    if (dynamicArrayStudent.isEmpty()) {
                                        System.out.println("Danh sách sinh viên trống");
                                        break;
                                    }
                                    Student student = Controller.readStudent(dynamicArrayStudent);
                                    if (student == null) {
                                        System.out.println("ID không hợp lệ!");
                                        break;
                                    } else System.out.println(student);
                                    break;
                                case 3:
                                    System.out.println("3. Cập nhật thông tin sinh viên (Bỏ qua nếu không cập nhật)");
                                    Controller.updateStudent(dynamicArrayStudent);
                                    break;
                                case 4:
                                    System.out.println("4. Xóa sinh viên");
                                    Controller.deleteStudent(dynamicArrayStudent);
                                    break;
                                case 5:
                                    System.out.println("5. Hiển thị tỷ lệ phần trăm theo mức độ");
                                    Controller.displayLevel(dynamicArrayStudent);
                                    break;
                                case 6:
                                    System.out.println("6. Hiển thị tỷ lệ phần trăm theo điểm GPA");
                                    Controller.displayPoint(dynamicArrayStudent);
                                    break;
                                case 7:
                                    System.out.println("7. Danh sách sinh viên theo mức độ");
                                    Controller.getStudentByLevel(dynamicArrayStudent);
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ");
                            }
                        } catch (Exception e) {
                            System.out.println("Dữ liệu không hợp lệ! Vui lòng thử lại");
                            scanner.next();
                        }
                    }
                } else {
                    System.out.println("Lựa chọn không hợp lệ.");
                }
            } catch (Exception e) {
                System.out.println("Dữ liệu không hợp lệ! Vui lòng thử lại");
                scanner.next();
            }
        }
    }
}
