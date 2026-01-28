package org.example.student_management.controller;

import jakarta.validation.Valid;
import org.example.student_management.dto.StudentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult; // Import BindingResult
import org.springframework.validation.FieldError;   // Import FieldError
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    // Bài 4
    // test  API: POST http://localhost:8080/api/v1/students
    @PostMapping
    public ResponseEntity<?> createStudent(
            @Valid @RequestBody StudentDTO studentDTO,
            BindingResult bindingResult
    ) {

        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage) // Chỉ lấy câu thông báo
                    .collect(Collectors.toList());


            return ResponseEntity.badRequest().body(errors);
        }

        return ResponseEntity.ok("Thêm sinh viên thành công!");
    }
}