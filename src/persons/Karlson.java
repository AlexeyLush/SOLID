package persons;
import actions.Sighed;

public class Karlson extends AbstractPerson implements Sighed {
    public Karlson() {
        super("Карлсон");
    }

    @Override
    public String sighed() {
        return String.format("%s %sвздохнул, когда ", this.getName(), this.getState());
    }
}
