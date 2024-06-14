// AuthController.java
@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        // Authenticate user and return token
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest registerRequest) {
        // Register new user
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        // Log out user
    }
}
