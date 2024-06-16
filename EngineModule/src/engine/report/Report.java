package engine.report;

import engine.reliability.managment.Rate;
import engine.user.User;

import javax.xml.stream.Location;
import java.sql.Time;
import java.util.ArrayList;

public class Report {
    String text;
    String imageURL;
    ArrayList<User> usersWhoLiked;
    ArrayList<Comment> comments;
    ArrayList<User> guards;
    Rate reliabilityRate;
    User reporter;
    boolean isAnonymousReport;
    ArrayList<String> tags;
    ArrayList<Genre> genres;
    Location location;
    Time timeReported;

    public Report(String text, String imageURL, boolean isAnonymousReport, ArrayList<String> tagUsersEmails, ArrayList<Genre> genres, Location location) {
        this.text = text;
        this.imageURL = imageURL;
        this.reporter = reporter;
        this.isAnonymousReport = isAnonymousReport;
        this.tags = tagUsersEmails;
        this.genres = genres;
    }
    public void setReporter(User reporter){
        this.reporter = reporter;
    }
}
