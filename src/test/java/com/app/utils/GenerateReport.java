package com.app.utils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateReport {
    public static void JVMReport(String jsonFile){
        File reportLocation =  new File("src/test/resources/reports");
        Configuration reportConfiguration = new Configuration(reportLocation,"AppleStore");
        reportConfiguration.addClassifications("Browser", "chrome");
        reportConfiguration.addClassifications("Sprint", "1");
        reportConfiguration.addClassifications("OS", "Windows");

        List<String> jsonFiles =  new ArrayList<String>();
        jsonFiles.add(jsonFile);

        ReportBuilder builder = new ReportBuilder(jsonFiles, reportConfiguration);
        builder.generateReports();

    }
}
