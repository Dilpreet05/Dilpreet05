/**
 * forEachLoop
 */
public class forEachLoop {
        public static void main(String[] args) {
         

                String[] cars = {"BMW M2", "Veloster N", "GTI"};

                for(String car : cars) {        // for each loop
                        // declares string car set as null, every time it goes through the cars array it will create a new car. sets new var car and gives it the value of cars
                        System.out.println(car);
                }

                for(int i = 0; i < cars.length; i++) {  // normal for loop
                        System.out.println(cars[i]);
                }



        }
}