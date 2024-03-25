import java.util.ArrayList;
import java.util.List;

public class Gym {
    private String name;
    private String location;
    private int capacity;
    private List<String> members;

    public Gym(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.members = new ArrayList<>();
    }
}
