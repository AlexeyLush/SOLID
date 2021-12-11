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

    public String getName(){
        return this.name;
    }

    public String getState(){
        return this.state.getState();
    }

    public void setState(State state){
        this.state = state;
    }

    public String getPlace() { return this.place.getPlace(); }

    public void setPlace(Place place) { this.place = place; }

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
