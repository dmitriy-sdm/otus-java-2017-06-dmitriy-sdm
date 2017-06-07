package ru.otus.hw1;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maven project");
        try {
            CSVReader reader = new CSVReader(new FileReader("emails.csv"));
            String[] CsvLine;
            while ((CsvLine = reader.readNext()) != null) {
                System.out.println(CsvLine[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
