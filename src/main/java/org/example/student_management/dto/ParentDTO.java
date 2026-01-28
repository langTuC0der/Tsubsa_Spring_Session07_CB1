//package org.example.student_management.dto;
//
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Pattern;
//
//public class ParentDTO {
//    // bài 5
//    @NotBlank(message = "Tên phụ huynh không được để trống")
//    private String name;
//
//    @Pattern(regexp = "^0\\d{9}$", message = "SĐT phụ huynh phải là 10 số và bắt đầu bằng 0")
//    private String phoneNumber;
//
//    public ParentDTO() {}
//
//    public ParentDTO(String name, String phoneNumber) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//    public String getPhoneNumber() { return phoneNumber; }
//    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
//}