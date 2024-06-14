// ReportController.java
@RestController
@RequestMapping("/reports")
public class ReportController {

    @GetMapping
    public List<Report> getAllReports() {
        // Retrieve and return all Reports
    }

    @GetMapping("/{id}")
    public Report getReportById(@PathVariable Long id) {
        // Retrieve and return report by ID
    }

    @PostMapping
    public Report createReport(@RequestBody Report report) {
        // Create and return new Report
    }

    @PutMapping("/{id}")
    public Report updateReport(@PathVariable Long id, @RequestBody Report report) {
        // Update and return existing Report
    }

    @DeleteMapping("/{id}")
    public void deleteReport(@PathVariable Long Report) {
        // Delete Report by ID
    }
}
