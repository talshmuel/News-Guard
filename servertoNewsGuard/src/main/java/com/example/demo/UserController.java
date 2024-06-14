// UserController.java
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getAllUsers() {
        // Retrieve and return all users
    }

    @GetMapping("/{name}")
    public User getUserByName(@PathVariable Long name) {
        // Retrieve and return user by Name
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        // Create and return new user
    }

    @PutMapping("/{name}")
    public User updateUser(@PathVariable Long name, @RequestBody User user) {
        // Update and return existing user
    }

    @DeleteMapping("/{name}")
    public void deleteUser(@PathVariable Long name) {
        // Delete user by NAME
    }
}
