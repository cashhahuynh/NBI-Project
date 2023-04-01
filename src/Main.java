import NBIClasses.NewClient.NewClient;
import NBIClasses.NewMatter.NewMatter;

public class Main {

    public static void main(String[] args) {

        NewClient nc = new NewClient("ABC Company, Inc.", 1, "estate planning", false);
        NewMatter nm = new NewMatter(134, "Google", 2, "non-compete", false);

        System.out.println(nc.toString());
        System.out.println("\n" + nm.toString());

    }

}
