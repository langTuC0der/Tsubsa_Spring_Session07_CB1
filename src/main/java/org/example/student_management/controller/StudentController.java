package org.example.student_management.controller;

import jakarta.validation.Valid;
import org.example.student_management.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @PostMapping
    public ResponseEntity<String> createStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return ResponseEntity.ok("Thêm sinh viên thành công: " + studentDTO.getFullName());
    }
}