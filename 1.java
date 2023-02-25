import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex2 {


    public static void main(String[] args) throws IOException {
        int [] mas = {11, 3, 14, 16, 7};
        Logger logger = Logger.getLogger(ex2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        logger.log(Level.INFO, ConvertArray(mas));
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int buf;
            for (int i = 0; i < mas.length-1; i++)  {
                System.out.println(Arrays.toString(mas));
                if(mas[i] > mas[i+1]){
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }

    private static String ConvertArray(int [] nums){
        Arrays.sort(nums);
        String a=Arrays.toString(nums);
        String ar[]=a.substring(1,a.length()-1).split(", ");
        Arrays.toString(ar);
        return a;
    }
}