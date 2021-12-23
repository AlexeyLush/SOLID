package persons;

import place.Place;
import state.State;

import java.util.Objects;

public abstract class AbstractPerson {

    private String name;
    private State state;
    private Place place;

    public AbstractPerson(String name){
        this.name = name;
    }


    public class Person{

        public String getName(){
            return AbstractPerson.this.name;
        }

        public String getState(){
            return AbstractPerson.this.state.getState();
        }

        public String getPlace(){
            return AbstractPerson.this.place.getPlace();
        }

        public void setState(State state){
            AbstractPerson.this.state = state;
        }

        public void setPlace(Place place){
            AbstractPerson.this.place = place;
        }
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        AbstractPerson person = (AbstractPerson) object;
        return Objects.equals(name, person.name) && state == person.state;
    }

    @Override
    public String toString() {
        return "AbstractPerson{" +
                "name='" + name + '\'' +
                ", state=" + state +
                ", place=" + place +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name) * state.getState().hashCode();
    }
}
