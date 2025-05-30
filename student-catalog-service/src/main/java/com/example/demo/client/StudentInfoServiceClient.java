package com.example.demo.client;

import com.example.demo.dtos.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("student-info-service")
public interface StudentInfoServiceClient {
    @GetMapping("/api/student/{studentId}")
    StudentDTO getStudentId(@PathVariable Long studentId);
}
