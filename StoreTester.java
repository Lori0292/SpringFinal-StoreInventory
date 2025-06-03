import java.util.Scanner;
import java.util.*;

public class StoreTester
{
    public static void main(String[] args)
    {
        ArrayList<Foods> foods = new ArrayList<Foods>();
        Foods num1 = new Foods("none", 1);
        foods.add(num1);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Store!");
        System.out.println("If you wish to buy items, enter yes. Otherwise, enter no");
        String ans = input.nextLine();
       
        while(ans.equals("yes")){
           // try- catch block
           try{
                System.out.println("Choose from one of these sections (select 1 or 2):");
                System.out.println("1. Fresh Foods, 2. Pantry Items " );
                int num = input.nextInt();
                System.out.println("Enter the first letter of the food you want:");
                String letters = input.nextLine();
                String letter = input.nextLine();
                if(num == 1){
                    for(int i = 0; i < num1.getNames().length/2; i++){
                        if(num1.getNames()[i].substring(0,1).equals(letter)){
                            System.out.println(i+1 +". "+ num1.getNames()[i]);
                        }
                    }
                }
                else{
                    for(int i = 32; i < num1.getNames().length; i++){
                        if(num1.getNames()[i].substring(0,1).equals(letter)){
                            System.out.println(i+1 +". "+ num1.getNames()[i]);
                        }
                    }
                }
                System.out.println("If these are one of the items you want to buy, enter the number. Otherwise, enter 0");
                int option = input.nextInt();
                if(option == 0){
                    break;
                }
                System.out.println("Enter the amount of the item that you want to buy:");
                int amount = input.nextInt();
                int year = 2025;
                if(num == 2){
                    //creates new Pantry object
                    Foods item = new PantryItems(num1.getNames()[option-1],amount, year);
                    foods.add(item);
                    input.nextLine();
                }
                else{
                    //creates new FreshFoods object
                    System.out.println("Do you want to buy the organic version of " + num1.getNames()[option-1] + "? Enter yes or no: (It will be one dollar extra)");
                    String org = input.nextLine();
                    input.nextLine();
                    if(org.equals("yes")){
                        Foods item = new FreshFoods(num1.getNames()[option-1], amount, true);
                        foods.add(item);
                    }
                    else{
                        Foods item = new FreshFoods(num1.getNames()[option-1], amount, false);
                        foods.add(item);
                    }
                    
                }
                System.out.println("Would you like to add another item to your cart?");
                ans = input.nextLine();
            
            //catches if input type does not match variable type    
            }catch(InputMismatchException e) {
                System.out.println("Invalid answer. Please respond with a number.");
                input.nextLine();
            //More general catch if any error is shown
            }catch(Exception e){
                System.out.println("Unexpected error has occurred, please retry.");
                }
            }
            
            int a = 0;
            for(int f = 1; f < foods.size(); f++){
                a += foods.get(f).getNumOrganic(); 
            }
            int sum = 0;
            for(int i = 1; i < foods.size(); i++){
                sum += foods.get(i).getTotal();
            }
            sum += a;
            System.out.println("The total cost is " + sum + " $");
            System.out.print(foods.get(0).toString());
            for(int f = 1; f < foods.size(); f++){
                System.out.print(foods.get(f).firstLine());
            }
            System.out.println();
            System.out.println();
            System.out.println("Number of Organic items bought: " + a);
            int trues = 0;
            for(int i = 0; i< foods.size(); i++){
                if(foods.get(i) instanceof PantryItems){
                    trues = 1;
                }
            }
            if(trues==1){
                 System.out.println("The Expiration Date of your Pantry items are 2030");
            }

    
    }
}
