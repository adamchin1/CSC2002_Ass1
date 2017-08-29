
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adam
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Serial s = new Serial();
        Scanner sc = new Scanner(new File("sampleinputfile.txt"));

        float[] data = new float[1000000];

        int count = 0;
        sc.nextLine();

        while (sc.hasNext()) { // Converts datafile to array of floats

            String st = sc.nextLine();
            int p = st.indexOf(" ");
            st = st.substring(p);

            data[count] = Float.parseFloat(st);

            count++;
        }

        data = s.MedianFilter(data, 3); // Apply median filter
        
        for (int i = 0; i < 20; i++) { // Outputting the sorted array
            System.out.println(data[i]);

        }


    }
}
