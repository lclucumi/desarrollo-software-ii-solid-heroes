
import java.util.List;

public class Avengers {
    private final List<Avenger> members;

    public Avengers(List<Avenger> members) {
        this.members = members;
    }

    public void figth() {
        for (Avenger member :  members) {
            member.figth();
        }
    }
}