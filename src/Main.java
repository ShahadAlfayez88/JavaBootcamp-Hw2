import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        // 1
        System.out.println("1.Write a program that prints the numbers from 1 to 100 such that");
        for(int num = 1 ; num<=100 ; num++){
            if (num%3==0 && num%5==0) {
                System.out.println("FizzBuzz");
            }else if (num%5==0){
                System.out.println("Buzz");
            }else if (num%3==0){
                    System.out.println("Fizz");
            } else
                System.out.println(num);
        }

        //2
        System.out.println("2.Write a Java program to reverse a string.");
        String input = n.nextLine();
        String Reverse = " ";
        int i = input.length()-1;
        while(i>=0){
            Reverse = Reverse + input.charAt(i);
            i--;
        }

        System.out.println("After Reverse:"+ Reverse);


        // 3
        System.out.println("Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number");
        int number = n.nextInt();
        int result=0;
        for (int j=1;j<=10;j++){
            result=j*number;
            System.out.println(number+" X "+j+" = "+result);
        }

        // 4
        System.out.println("4.Write a program to find the factorial value of any number entered through the keyboard.");
        int fac = n.nextInt();
        int result2 = 1;
        for(int x=1 ; x<=fac ;x++){
            result2 = result2 * x;
        }
        System.out.println("The result is "+result2);

        //5
        System.out.println("Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)");
        System.out.println("please enter the first num");
        int number1 = n.nextInt();
        System.out.println("please enter the Second num");
        int number2 = n.nextInt();
        int MultiplicationResult = 1;

        while (number2!=0){
          MultiplicationResult *= number1;
            number2--;
        }
        System.out.println("The Result is : "+MultiplicationResult);

        // 6
        System.out.println("6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.");
        int Oddsum = 0;
        int Evensum = 0;
        int range = 0;
        do {
            System.out.println("Enter number or enter -1 if you want to stop");
             range = n.nextInt();
            if (range % 2 == 0) {
                Evensum += range;
            } else if (range % 2 == 1) {
                Oddsum += range;
            }
        }while(range != -1);

        System.out.println("the summation of odd numbers is:" + Oddsum);
        System.out.println("the summation of Even numbers is:" + Evensum);

        // 7

        System.out.println("7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.");
        int primenumber = n.nextInt();
         if(primenumber == 1 || primenumber == 0) {
            System.out.println("Not a prime number");
        }
        for(int p=2;p<primenumber;p++) {
            if(primenumber % p == 0) {
                System.out.println("NO");
                return;
            }
            break;
        }

        System.out.println(primenumber+" is a prime number");

//

        // 8
        System.out.println("8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.");

        int numbers = 0;
        int positivecount = 0;
        int negativecount = 0;
        int zeroscount = 0;
        char choice ;

        do {
            System.out.println("Enter number");
            numbers = n.nextInt();
            if (numbers > 0) {
                positivecount ++;
            } else if (numbers < 0) {
                negativecount ++;
            } else if (numbers ==0) {
                zeroscount++;
            }
            System.out.println(" do you want continue adding numbers y/n");
            choice = n.next().charAt(0);
        }while(choice == 'y');
        System.out.println("the Count of Positive numbers is:" + positivecount);
        System.out.println("the Count of Negative numbers is:" + negativecount);
        System.out.println("the Count of Zero numbers is:" + zeroscount);
        n.nextLine();

        // 9
        System.out.println("Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.");
        for(int w = 1 ; w<=4 ; w++){
            System.out.println("Week"+w);
            for (int d=1 ; d<=7 ; d++){
                System.out.println("\n Day"+d);
            }
            System.out.println();
        }
         // 10
        System.out.println("10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.");
        String word = n.nextLine();
        n.nextLine();
        String Reversedword = "";
        int w = word.length()-1;
        while(w>=0){
            Reversedword = Reversedword + word.charAt(w);
            w--;
        }
        if (word.toLowerCase().equals(Reversedword.toLowerCase())){
            System.out.println(word + " it's a palindrome");
        } else
            System.out.println(word + " it's not a palindrome");
    }
    }


