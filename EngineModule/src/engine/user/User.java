package engine.user;

import data.transfer.object.NewUserDTO;
import engine.notification.Notification;
import engine.reliability.managment.Rate;
import engine.report.Genre;
import engine.report.Report;
import engine.user.registration.UserRegistrationDetails;

import java.util.ArrayList;

public class User {
    UserRegistrationDetails registrationDetails;
    ArrayList<Report> reports;
    ArrayList<Notification> notifications;
    ArrayList<Report> reportsThatTheUserIsAGuardOf;
    Rate reliabilityRate;

    public User(NewUserDTO newUserData) {
        this.registrationDetails = getRegistrationDetails(newUserData);
        reports = new ArrayList<>();
        notifications = new ArrayList<>();
        reportsThatTheUserIsAGuardOf = new ArrayList<>();
        reliabilityRate = Rate.THREE;//todo: להחליט מאיזה דירוג מתחיל יוזר חדש

    }
    private UserRegistrationDetails getRegistrationDetails(NewUserDTO newUserData){
        ArrayList<Genre> genrePreferences = new ArrayList<>();
        ArrayList<Rate> ratePreferences = new ArrayList<>();

        for(String genreStr : newUserData.getGenrePreference()){
            genrePreferences.add(Genre.convertStringToGenre(genreStr));
        }
        for(Integer reliabilityRateInt : newUserData.getReliabilityRatePreference()){
            ratePreferences.add(Rate.convertIntToRate(reliabilityRateInt));
        }
        return new UserRegistrationDetails(newUserData.getFirstName(), newUserData.getLastName(),
                newUserData.getCountry(), newUserData.getEmail(), newUserData.getPassword(),
                newUserData.getImageURL(), newUserData.getPhoneNumber(), genrePreferences,
                ratePreferences, newUserData.getCountriesPreference(),
                newUserData.isLocationAccessPermission());

    }
}
