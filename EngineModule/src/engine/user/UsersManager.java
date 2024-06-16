package engine.user;

import data.transfer.object.LoginDTO;
import data.transfer.object.NewUserDTO;
import engine.report.Report;

import java.util.Map;

public class UsersManager {
    Map<Integer,User> usersByID;

    public void addNewUser(NewUserDTO newUserData) {
        for (Map.Entry<Integer, User> IDUserPair : usersByID.entrySet()) {
            if (IDUserPair.getValue().getEmail() == newUserData.getEmail()) {
                throw new IllegalArgumentException("User with email " + newUserData.getEmail() + " already exists.");
            }
        }

        User newUser = new User(newUserData);
        usersByID.put(newUser.getID(), newUser);
    }
    public boolean checkLoginDetails(LoginDTO loginDTO){
        //אני פה!!
        return usersByID.get(loginDTO.getEmail()).checkUserPassword(loginDTO.getPasswordToCheck());
    }
   public void addReportToUser(String userEmail, Report newReport){
        usersByID.get(userEmail).addNewReport(newReport);
   }



}
