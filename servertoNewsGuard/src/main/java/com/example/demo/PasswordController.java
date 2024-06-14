// PasswordController.java
@RestController
@RequestMapping("/auth")
public class PasswordController {

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequest request) {
        // Handle password reset request
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest request) {
        // Reset user's password
    }
}
