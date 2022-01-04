import java.util.Scanner;  //Needed for Scanner class
class Main {
  public static void main(String[] args) {
    final int SIZE = 5;    // size of array

      // Create an array to hold employee salary.
      double[] salaries = new double[SIZE];

      // Create a Scanner object for keyboard input.
      Scanner console = new Scanner(System.in);

      System.out.println("Enter the salaries of " + SIZE
                         + " employees.");

      // Get employees' salary.
      for (int i = 0; i < SIZE; i++)
      {
         salaries[i] = console.nextDouble();
      }

      // Display the values stored in the array.
      System.out.println("The salaries are:");

      for (int i = 0; i < SIZE; i++)
      {
         System.out.println(salaries[i]);
      }
      int size;

      

      System.out.print("Enter the size of the array: ");
      size = console.nextInt();

      // Create an array to hold integers.
      int[] list = new int[size];

      System.out.println("Enter " + list.length + " integers.");

      // Get integers.
      for (int i = 0; i < list.length; i++)
      {
         list[i] = console.nextInt();
      }

      int sum = 0;    // To hold total

      // Calculate the sum of elements.
      for (int i = 0; i < list.length; i++)
      {
         sum += list[i];
      }

      // Display the sum of array elements.
      System.out.println("The sum of array :" + sum);
  }
}