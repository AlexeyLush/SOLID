package persons;

import actions.Fly;
import items.AbstractItem;
import place.Place;

public class Witch extends AbstractPerson implements Fly {
    public Witch() {
        super("ведьма");
    }


    @Override
    public String fly(AbstractItem item) {
        return String.format("пролетает %s%s %s, ", this.getPlace(), item.getTitle(), this.getName());
    }
}
