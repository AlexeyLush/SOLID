package persons;
import actions.NotHear;

public class Kid extends AbstractPerson implements NotHear {

    private Kid.Person personKid;
    public Kid() {
        super("Малыш");
        personKid = this.new Person();
    }

    public static class Action{
        public static String actionHear(){
            return " ничего не слышал про ";
        }
    }

    @Override
    public String notHear() {
        return String.format("%s%s", personKid.getName(), Action.actionHear());
    }
}
