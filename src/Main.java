import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<String>(); //HashSet is a set of data, a set means only one exact instance of data can be present within the structure at a time

        emails.add("mika@gmail.com");
        emails.add("rolf@gmail.com");
        emails.add("rita@gmail.com");
        emails.add("sara@gmail.com");

        emails.add("sara@gmail.com");                   //So there can't be 2 times the same email saved like in this example
        emails.add("rita@gmail.com");

        System.out.println(emails.toString());

        for(String email : emails) {
            System.out.println(email);
        }

        System.out.println();

        emails.remove("rolf@gmail.com");             //.remove same as with the lists, also index number possible, but difficult since the content isn't sorted alphabetically but
                                                       //via their hash number
        System.out.println(emails.toString());

        for(String email : emails) {
            System.out.println(email);
        }

        System.out.println();

        if(emails.contains("mika@gmail.com")) {         //.contains also returns a boolean like with lists
            System.out.println("Email address is present");
        }

        if(emails.contains("peter@gmail.com")) {
            System.out.println("Email address is present");
        }
    }
}