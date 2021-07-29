package OOP;


/**
 * Main
 */
public class Main {
        public static void main(String[] args) {
         
                Dog dog1 = new Dog("Carl", 3, 4.2);
                Dog dog2 = new Dog("Ralph", 15, 7.0);

                System.out.println(dog1.name + " Is " + dog1.age + "years old."); 
                dog1.feed();
                dog2.drink();

        }
}