package org.example.student_management.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDTO {

    @NotBlank(message = "Họ tên không được để trống")
    @Size(min = 5, max = 100, message = "Họ tên phải từ 5 đến 100 ký tự")
    private String fullName;

    // Yêu cầu 2: Chuyên ngành không được để trống
    @NotBlank(message = "Chuyên ngành không được để trống")
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String fullName, String major) {
        this.fullName = fullName;
        this.major = major;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}