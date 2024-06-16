package engine.reliability.managment;

import engine.report.Report;
import engine.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ReliabilityManager {
    //location history of the last 24 hours
    Map<Integer, ReportVerificationProcess> runningVerificationProcesses;

    public ReliabilityManager(){
        runningVerificationProcesses = new HashMap<>();
    }

    public void startReportVerificationProcess(Report reportToVerify){
        ArrayList<User> reportGuards = findReportGuards(reportToVerify);
        ReportVerificationProcess newVerificationProcess = new ReportVerificationProcess(reportToVerify, reportGuards);
        runningVerificationProcesses.put(newVerificationProcess.ID, newVerificationProcess);
        //newVerificationProcess.sendVerificationRequestToGuards();

    }
    public void getRunningVerificationProcesses(){

    }
    private ArrayList<User> findReportGuards(Report reportToVerify){
        ArrayList<User> guards = new ArrayList<>();
        //todo: find by location history
        return guards;
    }
    public void setGuardVerificationResponse(int verificationProcessID, User guard, GuardResponse response){
        runningVerificationProcesses.get(verificationProcessID).setGuardResponse(guard, response);
    }
}
