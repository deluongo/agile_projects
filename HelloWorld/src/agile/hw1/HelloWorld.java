package agile.hw1;

/**
 * Created by devonluongo on 9/10/17.
 */
public class HelloWorld {
    public static void main(String[] names) {
        for(String name : names) {
            System.out.println("Hello, " + name);
        }
        if(names.length == 0) {
            System.out.println("Hello, World");
        }
    }
}
