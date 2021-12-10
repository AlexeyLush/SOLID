package items;

import actions.*;
import persons.AbstractPerson;
import state.State;

public class UncleJulius extends AbstractPerson implements Returned,
        CameUp, PutInHand, Thanked, Was, DontNeed,
        Lifting, Repeated, NotForget, Open, Scared, Seen, NotDeny {

    public UncleJulius() {
        super("Дядя Юлиус");
    }

    @Override
    public String returned(AbstractPerson person) {
        return String.format("%s вернулся от %s, ", this.getName(), person.getName());
    }

    @Override
    public String cameUp(AbstractPerson person) {
        return String.format("%s подошёл к %s и ", this.getName(), person.getName());
    }

    @Override
    public String putInHand(AbstractItem item) {
        return String.format("сунул в руку %s ", item.getAdjectiveAndTitle());
    }

    @Override
    public String thanked(AbstractPerson person) {
        return String.format("%s поблагодарил %s ", this.getName(), person.getName());
    }

    @Override
    public String was(State[] states) {
        String statesStr = "";

        for (int i = 0; i < states.length; i++){
            if (i == states.length - 1){
                statesStr += states[i].getState();
            }else{
                statesStr += states[i].getState() + " и ";
            }
        }
        return String.format("%s был %s ", this.getName(), statesStr);
    }

    @Override
    public String dontNeed(AbstractItem item) {
        return String.format("%s не нуждался в %s ", this.getName(), item.getAdjectiveAndTitle());
    }

    @Override
    public String lifting(AbstractItem item) {
        return String.format("для подъёма %s ", item.getTitle());
    }

    @Override
    public String repeated() {
        return String.format("%s повторял, что он ", this.getName());
    }

    @Override
    public String notForget(AbstractItem item) {
        return String.format("никогда не забудет эти %s ", item.getTitle());
    }

    @Override
    public String open(AbstractItem item) {
        return String.format("отркылся ему %s ", item.getAdjectiveAndTitle());
    }

    @Override
    public String scared() {
        return String.format("%s испугался ", this.getName());
    }


    @Override
    public String seen() {
        return String.format("когда увидел ");
    }

    @Override
    public String notDeny() {
        return String.format("%s это отрицать не будет, но... ", this.getName());
    }
}
