import items.*;
import persons.Doctor;
import persons.Karlson;
import persons.Kid;
import persons.Witch;
import place.Place;
import state.State;

public class App {
    public static void main(String[] args) {

        Kid kid = new Kid();
        Karlson karlson = new Karlson();
        UncleJulius uncleJulius = new UncleJulius();
        Doctor doctor = new Doctor();
        Witch witch = new Witch();

        Medicine medicine = new Medicine();
        Coin coin = new Coin();
        Era era = new Era();
        Mood mood = new Mood();
        Days days = new Days();
        WorldOfTales worldOfTales = new WorldOfTales();
        Window window = new Window();

        System.out.println(kid.notHear() + medicine.getAdjectiveAndTitle());

        karlson.setState(State.COMPASSIONATELY);
        doctor.setState(State.SILENTLY);
        System.out.println(karlson.sighed() + uncleJulius.returned(doctor) + uncleJulius.cameUp(karlson) + uncleJulius.putInHand(coin));

        System.out.println(uncleJulius.thanked(karlson) + uncleJulius.was(new State[] {State.HAPPY, State.FORTUNATE}) + uncleJulius.dontNeed(era) + uncleJulius.lifting(mood));

        uncleJulius.setState(State.FORTUNATE);
        System.out.println(uncleJulius.repeated() + uncleJulius.getState() + uncleJulius.notForget(days));

        uncleJulius.setPlace(Place.HERE);
        System.out.println(uncleJulius.getPlace() + uncleJulius.open(worldOfTales));

        uncleJulius.setState(State.SOOTH);
        witch.setPlace(Place.BESIDE);
        System.out.println(uncleJulius.getState() + uncleJulius.scared() + uncleJulius.seen() + witch.getPlace() + witch.fly(window) + uncleJulius.notDeny());
    }
}
