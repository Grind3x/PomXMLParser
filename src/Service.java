import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Service {
    public static Dependencies loadXMLFromFile(File file) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Dependencies.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Dependencies) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
