import NBIClasses.NewClient.NewClient;
import NBIClasses.NewMatter.NewMatter;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of request type: " +
                "\n1. New Client" +
                "\n2. New Matter for an Existing Client");

        int requestType = scanner.nextInt();

        if(requestType == 1) {
            newClient();
        } else {
            newMatter();
        }

    }

    public static void newClient() {

        //figure out why scanner is not grabbing.

        scanner.nextLine();

        System.out.println("What is the client name?: ");
        String clientName = scanner.nextLine();
        System.out.println("What is the description of matter?: ");
        String description = scanner.nextLine();
        scanner.close();

        NewClient nc = new NewClient(clientName, 1, description, true);

        System.out.printf("CLIENT NAME: %s" +
                "\nDESCRIPTION OF MATTER: %s" +
                "\nCONFLICT SEARCH REQUIRED: %b", nc.getClientName(), nc.getDescription(), nc.isConflictSearch());

    }

    public static void newMatter() {

        Boolean bool;

        System.out.println("What is the client number?: ");
        int clientNumber = scanner.nextInt();
        //then grabs client name from number;

        scanner.nextLine();

        System.out.println("What is the description of matter?: ");
        String description = scanner.nextLine();
        System.out.println("\nAre there parties involved in the matter?: " +
                "\n1. Yes" +
                "\n2. No");
        int csr = scanner.nextInt();;
        scanner.close();

        if (csr == 1) {
            bool = true;
            //generates option to add parties
        } else {
            bool = false;
        }

        NewMatter nm = new NewMatter(clientNumber, "dumby name", 1, description, bool);

        System.out.printf("\nCLIENT NUMBER: %d" +
                "\nDESCRIPTION OF MATTER: %s" +
                "\nCONFLICT SEARCH REQUIRED: %b", nm.getClientNumber(), nm.getDescription(), nm.isConflictSearch());

    }

}
