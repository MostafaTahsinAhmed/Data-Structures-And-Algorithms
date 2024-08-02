//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Exersice1{
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//
//        HashMap<String, String> userNamePasswordMap = new HashMap<>();
//        HashMap<String, String> userNameFullnameMap = new HashMap<>();
//
//
//        try {
//            File file = new File("inputfile.txt");
//            Scanner reader = new Scanner(file);
//
//            while (reader.hasNextLine()) {
//
//
//                String[] line = reader.nextLine().split("\\s+");
//                String FullName1 = line[0];
//                String FullName2 = line[1];
//                String FullName = FullName1 + " " + FullName2;
//
//                String userName = line[2];
//                String password = line[3];
//
//
//                userNameFullnameMap.put(userName, FullName);
//                userNamePasswordMap.put(userName, password);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("The input file doesn't exist");
//        }
//
//
//        for (int i = 0; i < 3; i++) {
//            System.out.print("Enter userName");
//            String InputUsername = in.next();
//
//            System.out.print("Enter password");
//            String password = in.next();
//
//            if (userNamePasswordMap.containsKey(InputUsername) && userNamePasswordMap.get(InputUsername).equals(password)) {
//                System.out.println("Login successful");
//                System.out.println("Welcome " + userNameFullnameMap.get(InputUsername));
//                return;
//            } else {
//                if (i < 2) {
//                    System.out.println("Either the username or password is incorrect. You have " + (2 - i) + " more attempts.");
//                } else {
//                    System.out.println("Sorry. Incorrect login. Please contact the system administrator");
//                }
//            }
//        }
//    }
//}
import java.util.*;
import java.io.*;

public class Exersice1 {
    public static void main(String[] args) {
        // HashMaps to store username-password and username-fullname
        HashMap<String, String> usernamePasswordMap = new HashMap<>();
        HashMap<String, String> usernameFullnameMap = new HashMap<>();


        try {
            File file = new File("inputfile.txt"); // Replace with your file path
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+"); // Split the line by whitespace

                // Concatenate the first two parts for the full name
                String fullname = parts[0] + " " + parts[1];
                String username = parts[2];
                String password = parts[3];

                usernamePasswordMap.put(username, password);
                usernameFullnameMap.put(username, fullname);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        Scanner inputScanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            // User login prompt
            System.out.print("Login: ");
            String username = inputScanner.nextLine();
            System.out.print("Password: ");
            String password = inputScanner.nextLine();

            // Check credentials
            if (usernamePasswordMap.containsKey(username) && usernamePasswordMap.get(username).equals(password)) {
                System.out.println("Login successful");
                System.out.println("Welcome " + usernameFullnameMap.get(username));
                return;
            } else {
                attempts++;
                System.out.println("Either the username or password is incorrect. You have " + (3 - attempts) + " more attempts.");
            }
        }

        System.out.println("Sorry. Incorrect login. Please contact the system administrator.");
        inputScanner.close();
    }
}
