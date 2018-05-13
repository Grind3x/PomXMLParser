import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Dependencies {

    @XmlElement(name = "dependency")
    private List<Dependency> dependencies = new ArrayList<>();

    public Dependencies() {
    }

    private void addDependency(Dependency dependency) {
        if (dependency == null) {
            throw new IllegalArgumentException();
        }
        dependencies.add(dependency);
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    @Override
    public String toString() {
        return "Dependencies{" +
                "dependencies=" + dependencies +
                '}';
    }
}
