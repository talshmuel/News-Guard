package data.transfer.object;

import javax.xml.stream.Location;
import java.sql.Time;
import java.util.ArrayList;

public final class NewReportDTO {
    String text;
    String imageURL;
    String reporterEmail;
    boolean isAnonymousReport;
    ArrayList<String> tagsUsersEmails;
    ArrayList<String> genres;
    Location location;
    Time timeReported;

    public NewReportDTO(String text, String imageURL, String reporterEmail, boolean isAnonymousReport, ArrayList<String> tagsUsersEmails, ArrayList<String> genres, Location location, Time timeReported) {
        this.text = text;
        this.imageURL = imageURL;
        this.reporterEmail = reporterEmail;
        this.isAnonymousReport = isAnonymousReport;
        this.tagsUsersEmails = tagsUsersEmails;
        this.genres = genres;
        this.location = location;
        this.timeReported = timeReported;
    }

    public String getText() {
        return text;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public boolean isAnonymousReport() {
        return isAnonymousReport;
    }

    public ArrayList<String> getTagsUsersEmails() {
        return tagsUsersEmails;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public Location getLocation() {
        return location;
    }

    public Time getTimeReported() {
        return timeReported;
    }
}
