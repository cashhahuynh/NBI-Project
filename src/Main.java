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

        System.out.println("What is the client name?: ");
        String clientName = scanner.nextLine();
        System.out.println("What is the description of matter?: ");
        String description = scanner.nextLine();
        scanner.close();

        StringTokenizer st = new StringTokenizer(description);
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.printf("client name: %s" +
                "\ndescription of matter: %s", clientName, description);

    }

    public static void newMatter() {

        Boolean bool;

        System.out.println("What is the client number?: ");
        int clientNumber = scanner.nextInt();
        //then grabs client name from number;
        System.out.println("What is the description of matter?: ");
        String description = scanner.next();
        System.out.println("Are there parties involved in the matter?: " +
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

        System.out.printf("client number: %d" +
                "\ndescription of matter: %s" +
                "\nconflict search required: %b", clientNumber, description, bool);

    }

}
