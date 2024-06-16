package engine.report;

import data.transfer.object.NewReportDTO;
import engine.user.User;

import java.util.ArrayList;
import java.util.List;

public class ReportsManager {
    ArrayList<Report> reports;

    public ReportsManager() {
        this.reports = new ArrayList<>();
    }

    public Report addNewReport(NewReportDTO newReportDTO){
        ArrayList<Genre> genreEnumList = convertGenreStrToEnum(newReportDTO.getGenres());
        Report newReport = new Report(newReportDTO.getText(), newReportDTO.getImageURL()
                , newReportDTO.isAnonymousReport(), newReportDTO.getTagsUsersEmails()
                ,genreEnumList, newReportDTO.getLocation());
        reports.add(newReport);
        return newReport;
    }

    private ArrayList<Genre> convertGenreStrToEnum(ArrayList<String> genreStrList){
        ArrayList<Genre> genreEnumList = new ArrayList<>();
        genreStrList.forEach((genreStr)->{
            genreEnumList.add(Genre.convertStringToGenre(genreStr));
        });
        return genreEnumList;
    }
}
