import java.io.File;

public class Main {
    public static void main(String[] args) {
        Dependencies dependencies = Service.loadXMLFromFile(new File("pom.xml"));
        System.out.println(dependencies);
    }
}
