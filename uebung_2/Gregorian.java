import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Gregorian{

    public static void main(String[] args ) {

        writeToFile("/home/geeray/uni/win-2/Prog_2/Praktikum/daten-greg.csv",
                "/home/geeray/uni/win-2/Prog_2/Praktikum/daten-jul.csv");
    }


   public static void writeToFile(String gregCSV_path, String julCSV_path){
        try {
            // get the dates from the source CSV file
            ArrayList<String> dates = datesFromFile(gregCSV_path);

            // create the writer object to write to the destination file
            BufferedWriter writer = new BufferedWriter(new FileWriter(julCSV_path));

            // each date is written to its julian equivalent
            for (int i = 0; i <= dates.size()-1; i++) {
                if ((i+1)%3 == 0){ // takes care of the formating, 3 columns!
                    writer.write(toJulian(dates.get(i)) + "\n");
                }else{
                    writer.write(toJulian(dates.get(i)) + ", ");

                }
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


   }


    // process a CSV file, to store its content to a ArrayList
    public static ArrayList<String> datesFromFile(String filePath){
        BufferedReader reader = null;
        ArrayList<String> dateList = new ArrayList<String>();

        try {
            File file = new File(filePath);
            reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\\s+","");
                String[] dateArray = line.split(",");
                dateList.addAll(Arrays.asList(dateArray));

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return dateList;

    }


    // For a given date format (as String) convert the date to its julian equivalent
    public static String toJulian(String strDate){
        // specify the pattern to parse
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // subtract 12 days from parsed date
        LocalDate parsedDate = LocalDate.parse(strDate, formatter).minusDays(12);

        return parsedDate.format(formatter); // return Julian date as String
    }

}