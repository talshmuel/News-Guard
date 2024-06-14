// CommentController.java
@RestController
@RequestMapping("/reports/{reportId}/comments")
public class CommentController {

    @GetMapping
    public List<Comment> getCommentsByReport(@PathVariable Long reportId) {
        // Retrieve and return comments for a specific report
    }

    @PostMapping
    public Comment addComment(@PathVariable Long reportId, @RequestBody Comment comment) {
        // Add and return a comment to a specific report
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long reportId, @PathVariable Long id) {
        // Delete comment by ID
    }
}
