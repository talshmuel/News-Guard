package engine;

import data.transfer.object.LoginDTO;
import data.transfer.object.NewReportDTO;
import data.transfer.object.NewUserDTO;
import engine.location.history.managment.LocationHistoryManager;
import engine.reliability.managment.GuardResponse;
import engine.reliability.managment.ReliabilityManager;
import engine.report.Report;
import engine.report.ReportsManager;
import engine.user.User;
import engine.user.UsersManager;

import static sun.plugin.javascript.navig.JSType.Location;

public class Engine {
    UsersManager usersManager;
    ReportsManager reportsManager;
    LocationHistoryManager locationHistoryManager;
    ReliabilityManager reliabilityManager;

    public void createNewUser(NewUserDTO newUserData){
        usersManager.addNewUser(newUserData);

    }
    public boolean checkLoginDetails(LoginDTO loginDTO){
        return usersManager.checkLoginDetails(loginDTO);
    }
    public void addNewReportAndStartVerificationProcess(NewReportDTO newReportDTO){
        Report newReport = reportsManager.addNewReport(newReportDTO);

        usersManager.addReportToUser(newReportDTO.getReporterID(), newReport);
        reliabilityManager.startReportVerificationProcess(newReport);
    }
    public void setGuardVerificationResponse(int verificationProcessID, User guard, GuardResponse response){

    }
}
