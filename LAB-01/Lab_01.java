 import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Collecting basic details which are taken as the input from the user
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your age: ");
            int age = input.nextInt();

            System.out.print("Enter your gender (m/f): ");
            char gender = input.next().charAt(0);

            System.out.print("Enter your state: ");
            String state = input.next();

            // Displaying basic details
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            // Checking gender
            if (gender == 'm') {
                System.out.println("Gender: MALE");
            } else if (gender == 'f') {
                System.out.println("Gender: FEMALE");
            }

      // Checking region
      switch (state) {
            case "Andhra Pradesh":
            case "Karnataka":
            case "Kerala":
            case "Tamil Nadu":
                System.out.println("The student is from the southern states of India");
                break;
            case "West Bengal":
            case "Odisha":
            case "Bihar":
            case "Jharkhand":
                System.out.println("The student is from the eastern states of India");
                break;
            case "Gujarat":
            case "Maharashtra":
            case "Goa":
            case "Rajasthan":
                System.out.println("The student is from the western states of India");
                break;
            case "Punjab":
            case "Haryana":
            case "Himachal Pradesh":
            case "Madhya Pradesh":
                System.out.println("The student is from the northern states of India");
                break;
            default:
                System.out.println("The student's state is not specified or not in the list.");
                break;
   }
        }
}
}



    
    

