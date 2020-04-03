import java.util.ArrayList;
import java.util.List;


public class VerhovnaRada {
    List<Fruction> fructions = new ArrayList<>();

    public void addFructions(Fruction fruction){
        fructions.add(fruction);
    }

    public List<Fruction> getFructions() {
        return fructions;
    }

    public void setFructions(List<Fruction> fructions) {
        this.fructions = fructions;
    }
}
