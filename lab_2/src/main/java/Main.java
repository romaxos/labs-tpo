import functions.logarithms.Ln;
import functions.logarithms.LogTwo;
import functions.trigonometry.Cos;
import functions.trigonometry.Sin;
import logger.CsvLogger;
import main.MyApp;

public class Main {
    public static void main(String[] args) {
        CsvLogger csvLogger = new CsvLogger();
        csvLogger.goCsv("Sin", -2 * Math.PI, 2 * Math.PI, Math.PI/4);
        csvLogger.goCsv("Cos", -2 * Math.PI, 2 * Math.PI, Math.PI/4);
        csvLogger.goCsv("Ln", -2 * Math.PI, 2 * Math.PI, Math.PI/4);
        csvLogger.goCsv("LogTwo", -2 * Math.PI, 2 * Math.PI, Math.PI/4);
        csvLogger.goCsv("MyFunction", -2 * Math.PI, 2 * Math.PI, Math.PI/4);
    }
}
