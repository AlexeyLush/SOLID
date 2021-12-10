package persons;
import actions.NotHear;

public class Kid extends AbstractPerson implements NotHear {

    public Kid() {
        super("Малыш");
    }

    @Override
    public String notHear() {
        return String.format("%s ничего не слышал про ", this.getName());
    }
}
