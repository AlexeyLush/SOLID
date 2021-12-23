package persons;

import actions.Fly;
import items.AbstractItem;
import place.Place;

public class Witch extends AbstractPerson implements Fly {

    private Witch.Person personWitch;
    public Witch() {
        super("ведьма");
        personWitch = this.new Person();
    }


    @Override
    public String fly(AbstractItem item) {
        return String.format("пролетает %s%s %s, ", personWitch.getPlace(), item.getTitle(), personWitch.getName());
    }
}
