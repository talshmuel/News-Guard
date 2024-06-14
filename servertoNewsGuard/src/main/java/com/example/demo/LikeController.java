// LikeController.java
@RestController
@RequestMapping("/reports/{reportId}/likes")
public class LikeController {

    @PostMapping
    public void likePost(@PathVariable Long reportId) {
        // Like a specific report
    }

    @DeleteMapping
    public void unlikePost(@PathVariable Long reportId) {
        // Unlike a specific report
    }
}
