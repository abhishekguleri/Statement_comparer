import java.util.Scanner;

public class Main{

        public static void main(String[] args) {
            System.out.println("Hello World!");
            Scanner input = new Scanner(System.in);
            System.out.println("do you want to compare two statement\n" +
                    "enter the first statement:");
            String string1 =input.nextLine();
            System.out.println("enter the second statement:");
            String string2 =input.nextLine();
            System.out.println("this is your result------");
            System.out.println("comparing "+string1+" and "+string2+":\t"+string1.equals(string2));
        }
    }
