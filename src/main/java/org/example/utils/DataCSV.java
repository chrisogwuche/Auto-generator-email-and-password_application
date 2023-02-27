package org.example.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import org.example.entity.User;

public class DataCSV {
//    private final String filepath = "./DataCSV.csv";

    private List<User> dataList = new ArrayList<>();
    public void readFromCSv(String filepath) throws IOException, CsvException {
        FileReader fileReader  = new FileReader(filepath);
        CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
        List<String[]> datas = new ArrayList<>();
        datas = csvReader.readAll();
        for(String[] row: datas){
            dataList.add(new User(row[0],row[1],row[2],row[3],row[4],row[5]));
        }
    }

    public List<User> getDataList(String filename) throws IOException,CsvException {
        readFromCSv(filename);
        return dataList;
    }

    public void updateCSV(String fileAddress, String replace,int row,int col) throws IOException, CsvException {

        File inputFile = new File(fileAddress);
        // Read existing file
        CSVReader reader = new CSVReader(new FileReader(inputFile));
        List<String[]> csvBody = reader.readAll();
        // get StoreCSV row column  and replace with by using row and column
        csvBody.get(row)[col] = replace;
        reader.close();

        // Write to CSV file which is open
        CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
        writer.writeAll(csvBody);
        writer.flush();
        writer.close();
    }

}
