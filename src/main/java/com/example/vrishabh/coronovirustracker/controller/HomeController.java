package com.example.vrishabh.coronovirustracker.controller;

import com.example.vrishabh.coronovirustracker.models.LocationStats;
import com.example.vrishabh.coronovirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model)
    {
        List<LocationStats> locationStats = coronaVirusDataService.getAllStats();

        int totalCases = locationStats.stream().mapToInt(locationStat -> locationStat.getLatestReportedTotalCase()).sum();

        model.addAttribute("totalCases",totalCases);
        model.addAttribute("locationStats",coronaVirusDataService.getAllStats());
        return "home";
    }

}
