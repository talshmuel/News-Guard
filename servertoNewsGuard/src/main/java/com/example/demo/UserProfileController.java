// UserProfileController.java
@RestController
@RequestMapping("/users/{name}/profile")
public class UserProfileController {

    @GetMapping
    public UserProfile getUserProfile(@PathVariable Long name) {
        // Retrieve and return user's profile
    }

    @PutMapping
    public UserProfile updateUserProfile(@PathVariable Long name, @RequestBody UserProfile userProfile) {
        // Update and return user's profile
    }
}
