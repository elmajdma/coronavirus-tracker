package com.elmajdma.coronavirustracker;

import com.elmajdma.coronavirustracker.models.LocationStatus;
import com.elmajdma.coronavirustracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeControllers {
    @Autowired
    CoronavirusDataService coronavirusDataService;

  @GetMapping("/")
    public String home(Model model){
      List<LocationStatus> allStats=coronavirusDataService.getAllStatus();
      int totalReportedCases=allStats.stream().mapToInt(stat ->stat.getLatestTotalCases()).sum();
      int totalNewCasesRecorded=allStats.stream().mapToInt(stat ->stat.getDifferanceFromLastDate()).sum();


      NumberFormat myFormat = NumberFormat.getInstance();
      myFormat.setGroupingUsed(true);

      model.addAttribute( "locationStats", allStats);
        model.addAttribute("totalReportedCases", myFormat.format(totalReportedCases));
        model.addAttribute("totalNewCasesRecorded",myFormat.format(totalNewCasesRecorded));
        return "home";

    }
}
