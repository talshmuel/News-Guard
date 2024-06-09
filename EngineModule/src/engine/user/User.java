package engine.user;

import engine.notification.Notification;
import engine.reliability.managment.Rate;
import engine.report.Report;

import java.util.ArrayList;

public class User {
    String name;
    String email;
    String password;
    String imageURL;
    ArrayList<Report> reports;
    ArrayList<Notification> notifications;
    ArrayList<Report> reportsThatTheUserIsAGuardOf;
    Rate reliabilityScale;

}
