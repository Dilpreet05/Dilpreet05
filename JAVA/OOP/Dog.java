package OOP;


public class Dog {
        
        String name;
        int age;
        double weight;

        Dog(String name, int age, double weight){

                this.name = name;
                this.age = age;
                this.weight = weight;

        }

        void feed(){

                System.out.printf("You gave %s food\n", this.name);

        }

        void drink(){

                System.out.printf("You gave %s water\n", this.name);

        }

}
