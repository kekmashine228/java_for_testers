import java.io.File;

public class hello {
    static void main(String[] args) {
        System.out.println("hello");

        System.out.println(2 + 2);
        System.out.println(2 - 2);
        System.out.println(2 * 2);
        System.out.println(2 / 2);

        var configFile = new File("sandbox/build.gradle");
        System.out.println(configFile.getAbsolutePath());
        System.out.println(configFile.exists());
    }
}
