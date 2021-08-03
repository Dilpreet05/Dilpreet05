import java.util.Arrays;
public class sortedSquaredArray {
        public static void main(String[] args) {
                
                int[] array = {-6,-4,1,2,3,5};
                for(int i = 0; i < array.length; i++){
                        if(array[i] < 0){
                                array[i]*=-1;
                        }
                }

                Arrays.sort(array);
                for(int i = 0; i < array.length; i++){
                        array[i]*=array[i];
                }

                System.out.println(Arrays.toString(array));
                
        }
}