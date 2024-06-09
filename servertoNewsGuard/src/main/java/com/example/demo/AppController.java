package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AppController {

    // Login screen endpoint
    @GetMapping("/login")
    public ResponseEntity<?> loginScreen() {
        return new ResponseEntity<>("Login screen placeholder", HttpStatus.OK);
    }

    // Sign up screen endpoint
    @GetMapping("/signup")
    public ResponseEntity<?> signupScreen() {
        return new ResponseEntity<>("Sign up screen placeholder", HttpStatus.OK);
    }

    // Register endpoint
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> userDetails) {
        // Placeholder for registration logic
        return new ResponseEntity<>("User registered placeholder", HttpStatus.CREATED);
    }

    // Add new report screen endpoint
    @GetMapping("/add-report")
    public ResponseEntity<?> addReportScreen() {
        return new ResponseEntity<>("Add new report screen placeholder", HttpStatus.OK);
    }

    // Approve or deny report screen endpoint
    @GetMapping("/approve-deny-report")
    public ResponseEntity<?> approveDenyReportScreen() {
        return new ResponseEntity<>("Approve or deny report screen placeholder", HttpStatus.OK);
    }

    // User profile screen endpoint
    @GetMapping("/profile")
    public ResponseEntity<?> profileScreen() {
        return new ResponseEntity<>("User profile screen placeholder", HttpStatus.OK);
    }
}
