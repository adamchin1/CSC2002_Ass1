import java.util.Arrays;

public class MedianFilter {

    public static void main(String[] args) {

        double[] data = {3.2, 4.5, 10.0, 2.1, 3.5, 6.4, 1.1}; //default

        int dataSize = data.length;
        int filterSize = 3; //in this case
        int filterFactor = (filterSize - 1) / 2; // useful value 3 = 1; 5 = 2; 7 = 3 etc

        System.out.println("Filter Size is: " +filterSize);
        System.out.println("Data Size is: " +dataSize);
        
        double[] temp = new double[filterSize];

        for (int i = 0; i < dataSize; i++) {
            if (i <= filterFactor - 1 || i >= dataSize - filterFactor) {
            } else {
                for (int j = 0; j < filterSize; j++) {
                    temp[j] = data[i - filterFactor + j];
                }
                Arrays.sort(temp);
                data[i] = temp[filterFactor];
            }
        }

        for (int i = 0; i < dataSize; i++) {
            System.out.print(data[i] + " ");
        }

    }

}
