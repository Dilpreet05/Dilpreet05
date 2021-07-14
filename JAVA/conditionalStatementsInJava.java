public class conditionalStatementsInJava {
        public static void main(String[] args) {
 
                //conditionals are temporary 
                // once the conditional is complete the item is trashed and can no longer be accessed
                //used to compare information and if the information is "TRUE"
                
                int a; // delaring variable a
                
                if ( 5 > 1 ) {  // if (condition or test) {start of code block
                int age = 25;
                a = 15; //initialize 15 with a
                System.out.println(a);
                System.out.println(age); //what command to do if conditional is TRUE                
                } // end of code block}
                
                //System.out.print(age);        This will be an error
                //because the variable age is inside of the conditional
                //System.out.print(a);  //if the conditional is false there is no value assigned to a because of the false statement 


        }
}