import exceptions.CountMoneyException;
import items.*;
import persons.*;
import place.Place;
import state.State;

import javax.print.Doc;

public class App {
    public static void main(String[] args) {

        Kid kid = new Kid();
        Kid.Person personKid = kid.new Person();

        Karlson karlson = new Karlson();
        Karlson.Person personKarlson = karlson.new Person();

        UncleJulius uncleJulius = new UncleJulius();
        UncleJulius.Person personUncleJulius = uncleJulius.new Person();

        Doctor doctor = new Doctor() {
            public String returned(){
                return "вернулся";
            }
        };
        Doctor.Person personDoctor = doctor.new Person();

        Witch witch = new Witch();
        Witch.Person personWitch = witch.new Person();

        Medicine medicine = new Medicine();
        Coin coin = new Coin();
        Era era = new Era();
        Mood mood = new Mood();
        Days days = new Days();
        Eyes eyes = new Eyes();
        WorldOfTales worldOfTales = new WorldOfTales();
        Window window = new Window();

        personKarlson.setState(State.WIDE);
        System.out.println(karlson.looked(personKid) + personKarlson.getState() + eyes.getAdjectiveAndTitle());

        System.out.println(kid.notHear() + medicine.getAdjectiveAndTitle());

        personKarlson.setState(State.COMPASSIONATELY);
        personDoctor.setState(State.SILENTLY);
        System.out.println(karlson.sighed() + uncleJulius.returned(personDoctor) + uncleJulius.cameUp(personKarlson) + uncleJulius.putInHand(coin));

        System.out.println(uncleJulius.thanked(personKarlson) + uncleJulius.was(new State[] {State.HAPPY, State.FORTUNATE}) + uncleJulius.dontNeed(era) + uncleJulius.lifting(mood));

        personUncleJulius.setState(State.FORTUNATE);
        System.out.println(uncleJulius.repeated() + personUncleJulius.getState() + uncleJulius.notForget(days));

        personUncleJulius.setPlace(Place.HERE);
        System.out.println(personUncleJulius.getPlace() + uncleJulius.open(worldOfTales));

        personUncleJulius.setState(State.SOOTH);
        personWitch.setPlace(Place.BESIDE);
        System.out.println(personUncleJulius.getState() + uncleJulius.scared() + uncleJulius.seen() + personWitch.getPlace() + witch.fly(window) + uncleJulius.notDeny());


    }

}
