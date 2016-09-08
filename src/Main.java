import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static final String BOWDESCRIPTIONFILE = "BowDescription.json";
    public static Scanner scanner = new Scanner(System.in);
    public static Bow newBow;

    public static void main(String[] args) throws Exception {
        JsonReadWrite jsonMethods = new JsonReadWrite();

        try {
            newBow = jsonMethods.readJson();
        } catch (FileNotFoundException e) {
            System.out.println("No previous file found.\n");
        }

        if (newBow != null) { System.out.println(newBow); }

        System.out.println("Hi there! Welcome to Benton's Archery Tournament.\n" +
                "Please enter the following information about your bow.\n");

        userInputSetAttributes();
        jsonMethods.writeJson();
    }

    public static void userInputSetAttributes() {
        System.out.println("What type of bow is it?");
        String userInputType = scanner.nextLine();

        System.out.println("What brand name or make is it?");
        String userInputBrand = scanner.nextLine();

        System.out.println("What is the size of your bow?");
        String userInputSize = scanner.nextLine();

        System.out.println("What material is your bow made from?");
        String userInputMaterial = scanner.nextLine();

        System.out.println("How much did you pay for your bow?");
        double userInputCost = Double.parseDouble(scanner.nextLine());

        newBow.setType(userInputType);
        newBow.setBrand(userInputBrand);
        newBow.setSize(userInputSize);
        newBow.setMaterial(userInputMaterial);
        newBow.setCost(userInputCost);
    }
}
