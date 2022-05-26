import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String file = "/Users/decagon/Desktop/my-app/CSVTWO/src/product.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String [] row = line.split(",");

                for (String i : row) {
                    System.out.printf("%-15s", i);
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
        finally {

            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }






//        String path = "/Users/decagon/Desktop/SacramentocrimeJanuary2006.csv";
//        String line = "";
//
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            while ((line = br.readLine()) != null) {
//                String [] values = line.split(",");
//                System.out.println(values[1]);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
