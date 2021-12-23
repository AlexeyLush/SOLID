package persons;

import actions.*;
import exceptions.CountMoneyException;
import exceptions.OpenedPlaceException;
import items.AbstractItem;
import persons.AbstractPerson;
import state.State;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UncleJulius extends AbstractPerson implements Returned,
        CameUp, PutInHand, Was, DontNeed,
        Lifting, Repeated, NotForget, Open, Scared, Seen, NotDeny {

    private UncleJulius.Person personUncleJulius;
    public UncleJulius() {
        super("Дядя Юлиус");
        personUncleJulius = this.new Person();
    }


    @Override
    public String returned(AbstractPerson.Person person) {
        return String.format("%s вернулся от %s, ", personUncleJulius.getName(), person.getName());
    }

    @Override
    public String cameUp(AbstractPerson.Person person) {
        return String.format("%s подошёл к %s и ", personUncleJulius.getName(), person.getName());
    }

    @Override
    public String putInHand(AbstractItem item) {
        return String.format("сунул в руку %s ", item.getTitle());
    }

    public String thanked(AbstractPerson.Person person) {
        Thanked thank = () -> {return "поблагодарил";};
        return String.format("%s %s %s ", personUncleJulius.getName(), thank.thanked(), person.getName());
    }

    @Override
    public String was(State[] states) {

        class States{
            private String statesStr;

            public States(){
                statesStr = "";
            }

            public String getStatesStr(){
                return statesStr;
            }

            public void createStr(State[] states){
                for (int i = 0; i < states.length; i++){
                    if (i == states.length - 1){
                        statesStr += states[i].getState();
                    }else{
                        statesStr += states[i].getState() + " и ";
                    }
                }
            }
        }

        States statesForText = new States();
        statesForText.createStr(states);
        return String.format("%s был %s ", personUncleJulius.getName(), statesForText.getStatesStr());
    }

    @Override
    public String dontNeed(AbstractItem item) {
        int countEra = 0;
        while (true){
            System.out.println("Сколько карлсон дал монеток?");
            Scanner scanner = new Scanner(System.in);
            try {
                countEra = scanner.nextInt();
                if (countEra <= 0 || countEra > 20){
                    throw new CountMoneyException();
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
            } catch (CountMoneyException e) {
                System.out.println(e);
            }
        }

        return String.format("%s не нуждался в %d %s ", personUncleJulius.getName(), countEra, item.getTitle());
    }

    @Override
    public String lifting(AbstractItem item) {
        return String.format("для подъёма %s ", item.getTitle());
    }

    @Override
    public String repeated() {
        return String.format("%s повторял, что он ", personUncleJulius.getName());
    }

    @Override
    public String notForget(AbstractItem item) {
        String title = "";
        while (true){
            System.out.println("Какой открылся дяде Юлиусу мир?");
            Scanner scanner = new Scanner(System.in);
            try {
                title = scanner.next();
                if (!title.equalsIgnoreCase("сказки")){
                    throw new OpenedPlaceException();
                }
                break;
            } catch (OpenedPlaceException e) {
                System.out.println(e);
            }
        }
        return String.format("никогда не забудет эти %s ", item.getTitle());
    }

    @Override
    public String open(AbstractItem item) {
        return String.format("отркылся ему %s ", item.getAdjectiveAndTitle());
    }

    @Override
    public String scared() {
        return String.format("%s испугался ", personUncleJulius.getName());
    }

    @Override
    public String seen() {
        return String.format("когда увидел ");
    }

    @Override
    public String notDeny() {
        return String.format("%s это отрицать не будет, но... ", personUncleJulius.getName());
    }
}
