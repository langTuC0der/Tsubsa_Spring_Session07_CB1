package org.example.student_management.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class StudentDTO {


    @NotBlank(message = "Họ tên không được để trống")
    @Size(min = 5, max = 100, message = "Họ tên phải từ 5 đến 100 ký tự")
    private String fullName;

    @NotBlank(message = "Chuyên ngành không được để trống")
    private String major;


    @Min(value = 18, message = "Tuổi phải từ 18 trở lên")
    private Integer age;


    @Min(value = 0, message = "Điểm GPA không được âm")
    @Max(value = 10, message = "Điểm GPA không được quá 10.0")
    private Double gpa;


    public StudentDTO() {
    }

    public StudentDTO(String fullName, String major, Integer age, Double gpa) {
        this.fullName = fullName;
        this.major = major;
        this.age = age;
        this.gpa = gpa;
    }

    // --- Getters & Setters (Nhớ Generate thêm cho age và gpa) ---
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
}