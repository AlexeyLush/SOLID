package persons;
import actions.Looked;
import actions.Sighed;

public class Karlson extends AbstractPerson implements Sighed, Looked {

    private Karlson.Person personKarlson;

    public Karlson() {
        super("Карлсон");
        personKarlson = this.new Person();
    }

    @Override
    public String sighed() {
        return String.format("%s %s вздохнул, когда ", personKarlson.getName(), personKarlson.getState());
    }

    @Override
    public String looked(Person person) {
        return String.format("%s глядел на %s ", personKarlson.getName(), person.getName());
    }
}
