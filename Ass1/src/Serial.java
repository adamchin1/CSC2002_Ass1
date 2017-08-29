import java.util.Arrays;

public class Serial {

    public Serial() {
        
    }
      
        public float[] MedianFilter (float[] data, int filterSize){
            
            int dataSize = data.length;
            int width = (filterSize - 1) / 2; // useful value 3 = 1; 5 = 2; 7 = 3 etc

            float[] temp = new float[filterSize];
            float[] filteredArray = new float[dataSize];
            for (int i = 0; i < dataSize; i++) {
                if (i <= width - 1 || i >= dataSize - width) {
                    filteredArray[i] = data [i];
                } else {
                    for (int j = 0; j < filterSize; j++) {
                        temp[j] = data[i - width + j];
                    }
                    Arrays.sort(temp);
                    filteredArray[i] = temp[width];
                }
            }  
           return filteredArray;
        }
}

