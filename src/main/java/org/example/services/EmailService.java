package org.example.services;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;

public interface EmailService {
    void setUpdate(String fileAddress, String companyName,String emailExtension) throws IOException, CsvException;
}
