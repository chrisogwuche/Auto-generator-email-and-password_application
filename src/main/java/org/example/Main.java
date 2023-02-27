package org.example;

import com.opencsv.exceptions.CsvException;
import org.example.services.EmailServiceImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
        EmailServiceImpl  service = new EmailServiceImpl();
        service.setUpdate("src/main/resources/DataCSV.csv","stars","com");
    }
}