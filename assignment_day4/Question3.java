import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        // Creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers to add : ");

        // Takes input from the keyboard
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();
        float num4 = input.nextFloat();
        float num5 = input.nextFloat();

        float[] arr = {num1, num2, num3, num4, num5};
        float sum = 0;
		for(int i=0; i<arr.length; i++){
		    System.out.println("number "+i+" ==> "+arr[i]);
		    sum = sum + arr[i];
		}
        
		System.out.println("Addition of 5 numbers is " + sum);

        // Closes the scanner
        input.close();
    }
}