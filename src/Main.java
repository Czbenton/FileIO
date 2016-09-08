import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static final String BOW_DESCRIPTION_FILE = "BowDescription.json";
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        JsonReadWrite jsonMethods = new JsonReadWrite();

        Bow bow = null;
        try {
            bow = jsonMethods.readJson(BOW_DESCRIPTION_FILE);
            System.out.println(bow);
        } catch (FileNotFoundException e) {
            bow = new Bow();
            System.out.println("No previous file found.\n");
        }

        System.out.println("Hi there! Welcome to Benton's Archery Tournament.\n" +
                "Please enter the following information about your bow.\n");

        userInputSetAttributes(bow);
        jsonMethods.writeJson(BOW_DESCRIPTION_FILE, bow);
    }

    public static void userInputSetAttributes(Bow bow) {
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

        bow.setType(userInputType);
        bow.setBrand(userInputBrand);
        bow.setSize(userInputSize);
        bow.setMaterial(userInputMaterial);
        bow.setCost(userInputCost);
    }
}
