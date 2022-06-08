package logger;
import au.com.bytecode.opencsv.CSVWriter;
import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
import main.MyApp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvLogger {
    private static final double ACCURACY = 0.001;
    private final Sin sinFunction;
    private final Cos cosFunction;
    private final Ln lnFunction;
    private final LogTwo logTwoFunction;
    private final MyApp myAppFunction;

    public CsvLogger() {
        this.cosFunction = new Cos(ACCURACY);
        this.sinFunction = new Sin(ACCURACY, cosFunction);
        this.lnFunction = new Ln(ACCURACY);
        this.logTwoFunction = new LogTwo(ACCURACY, lnFunction);
        this.myAppFunction = new MyApp(ACCURACY, sinFunction, lnFunction, logTwoFunction);
    }

    public void goCsv(String funcName, double start, double end, double step) {
        List<String[]> data = new ArrayList<>();
        switch (funcName) {
            case "Sin" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(sinFunction.compute(i))});
                }
                write(data, "sin_res.csv");
            }
            case "Cos" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(cosFunction.compute(i))});
                }
                write(data, "cos_res.csv");
            }
            case "Ln" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(lnFunction.compute(i))});
                }
                write(data, "ln_res.csv");
            }
            case "LogTwo" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(logTwoFunction.compute(i))});
                }
                write(data, "log_two_res.csv");
            }
            case "MyFunction" -> {
                for (double i = start; i <= end; i += step) {
                    data.add(new String[]{String.valueOf(i), String.valueOf(myAppFunction.compute(i))});
                }
                write(data, "my_func_res.csv");
            }
        }
    }

    private void write(List<String[]> data, String fileName) {
        try {
            String csv = "/home/grek/labs-tpo/lab_2/src/main/resources/" + fileName;
            CSVWriter writer = new CSVWriter(new FileWriter(csv));
            data.forEach(writer::writeNext);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}