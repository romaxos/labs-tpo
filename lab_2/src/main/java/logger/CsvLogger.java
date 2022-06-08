package logger;

import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
import main.MyApp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvLogger {
    // private String filePath = "/home/grek/labs-tpo/lab_2/src/main/resources/";
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
        switch (funcName) {
            case "Sin" {

            }
        }
    }

}