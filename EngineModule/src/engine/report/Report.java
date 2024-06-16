package engine.report;

import engine.reliability.managment.Rate;
import engine.user.User;

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
    ArrayList<User> tags;
    ArrayList<Genre> genres;
}
