package engine;

import data.transfer.object.NewUserDTO;
import engine.location.history.managment.LocationHistoryManager;
import engine.reliability.managment.ReliabilityManager;
import engine.report.ReportsManager;
import engine.user.UsersManager;

public class Engine {
    UsersManager usersManager;
    ReportsManager reportsManager;
    LocationHistoryManager locationHistoryManager;
    ReliabilityManager reliabilityManager;

    public void createNewUser(NewUserDTO newUserData){

    }

}
