package org.example.services;

import com.opencsv.exceptions.CsvException;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.entity.User;
import org.example.utils.DataCSV;

import java.io.IOException;

public class EmailServiceImpl implements EmailService{
    DataCSV dataCSV = new DataCSV();
    public void setUpdate(String fileAddress,String companyName,String emailExtension) throws IOException, CsvException {

        int row = 1;
        for(User user: dataCSV.getDataList(fileAddress)){
            if(user.getEmailAddress().isBlank()){
                String generatedEmail = user.getFirstName() +"." +user.getLastName() +"@" +companyName +"." +emailExtension;
                dataCSV.updateCSV(fileAddress,generatedEmail,row,4);
            }
            if(user.getPassword().isBlank()){
                dataCSV.updateCSV(fileAddress,setPassword(),row,5);
            }
            row+=1;
        }
    }

    public String setPassword(){
        int length = 7;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedPassword = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedPassword;
    }

}
