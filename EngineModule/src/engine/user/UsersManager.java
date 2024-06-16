package engine.user;

import data.transfer.object.NewUserDTO;
import java.util.Map;

public class UsersManager {
    Map<String,User> usersByEmail;
    public void addNewUser(NewUserDTO newUserData){
        if(usersByEmail.containsKey(newUserData.getEmail())){
            //היוזר כבר קיים
        }
        else{
            usersByEmail.put(newUserData.getEmail(), new User(newUserData));
        }

    }
}
