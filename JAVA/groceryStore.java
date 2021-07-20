import java.util.Scanner;

public class groceryStore {
        static Double totalCost = 0.0;
        static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
                
                System.out.println("--- Welcome to the Super Market ---\n\n");
                System.out.println("What department would you like to shop at?");
                shop();

        }

        private static void shop(){
                // totalCost += Items[i].equals("") ?  : 0;
                System.out.print("BABY\nBAKERY\nDAIRY\nDELI\nFROZEN\nGLUTEN-FREE\nMEAT\nPRODUCE\nSEAFOOD\nENTER: ");
                String department = scan.nextLine().toLowerCase();
                
                switch(department){

                        case"baby":
                                // prices from walmart
                                System.out.println("\nWhat items would you like?");
                                System.out.print("Baby Formula - $34.99 - 27.4 Oz\nClothing - $14.99\nDiapers - $44.99 - 70 count\nFood Blend - $24.99 - 24 count\nSippy Cups - $10.00\nSeperated by Commas\nENTER YOUR ITEMS: ");
                                String babyItem = scan.nextLine().toLowerCase();
                                String[] babyItems = babyItem.split(", ");
                                
                                for (int i = 0; i < babyItems.length; i++){
                                        totalCost += babyItems[i].equals("baby formula") ? 34.99 : 0;
                                        totalCost += babyItems[i].equals("clothing") ? 14.99 : 0;
                                        totalCost += babyItems[i].equals("diapers") ? 44.99 : 0;
                                        totalCost += babyItems[i].equals("food blend") ? 24.99 : 0;
                                        totalCost += babyItems[i].equals("sippy cups") ? 10.00 : 0;
                                }
                                System.out.println("Current Total Cost: " + totalCost); 
                                System.out.println("Is there anything else you would like to purchace? Type \"exit\" to checkout.");
                                shop();
                                break;

                        case"bakery":
                                // prices from safeway  
                                System.out.println("\nWhat Items would you like?");
                                System.out.print("Bagel - $4.99 - 6 count\nBiscuit - $4.99 - 12 count\nSandwich Bread - $3.99 - 20 Oz\nDoughnut - $6.99\nLoaf Bread - $4.99\nMuffin - $4.99 - 5 count\nPie - $9.99\nSeperated by Commas\nENTER YOUR ITEMS: ");
                                String bakeryItem = scan.nextLine().toLowerCase();
                                String[] bakeryItems = bakeryItem.split(", ");
                                for (int i = 0; i < bakeryItems.length; i++){
                                        totalCost += bakeryItems[i].equals("bagel") ? 4.99 : 0;
                                        totalCost += bakeryItems[i].equals("biscuit") ? 4.99 : 0;
                                        totalCost += bakeryItems[i].equals("sandwich bread") ? 3.99 : 0;
                                        totalCost += bakeryItems[i].equals("doughnut") ? 6.99 : 0;
                                        totalCost += bakeryItems[i].equals("loaf bread") ? 4.99 : 0;
                                        totalCost += bakeryItems[i].equals("muffin") ? 4.99 : 0;
                                        totalCost += bakeryItems[i].equals("pie") ? 9.99 : 0;
                                }
                                System.out.println("Current Total Cost: " + totalCost); 
                                System.out.println("Is there anything else you would like to purchace? Type \"exit\" to checkout.");
                                shop();
                                break;
                                
                        case"dairy":
                                // butter cheese cream milk pudding sour cream yogurt  
                                System.out.println("\nWhat Items would you like?");
                                System.out.print("Butter - $4.99 - 8 Oz\nCheese - $8.99 - 32 Oz\nCream - $5.99 - 32 Fl. Oz\nIce Cream - $6.99 - 48 OZT\nMilk - $4.99 - 128 Fl. Oz\nPudding - $3.99 - 22 Oz\nSour Cream - $2.99 - 16 Oz\nYogurt - $4.99 - 32 Oz\nSeperated by Commas\nENTER YOUR ITEMS: ");
                                String dairyItem = scan.nextLine().toLowerCase();
                                String[] dairyItems = dairyItem.split(", ");
                                for (int i = 0; i < dairyItems.length; i++){
                                        totalCost += dairyItems[i].equals("butter") ? 4.99 : 0;
                                        totalCost += dairyItems[i].equals("cheese") ? 8.99 : 0;
                                        totalCost += dairyItems[i].equals("cream") ? 5.99 : 0;
                                        totalCost += dairyItems[i].equals("ice cream") ? 6.99 : 0;
                                        totalCost += dairyItems[i].equals("milk") ? 4.99 : 0;
                                        totalCost += dairyItems[i].equals("pudding") ? 3.99 : 0;
                                        totalCost += dairyItems[i].equals("sour cream") ? 2.99 : 0;
                                        totalCost += dairyItems[i].equals("yogurt") ? 4.99 : 0;
                                }
                                System.out.println("Current Total Cost: " + totalCost); 
                                System.out.println("Is there anything else you would like to purchace? Type \"exit\" to checkout.");
                                shop();
                                break;

                        case"exit":
                                System.out.println("FINAL COST: " + totalCost);
                                break;

                        default:
                                System.out.println("Sorry that is not a valid entry, try again.\n\n");
                                shop();
                }

        }


}