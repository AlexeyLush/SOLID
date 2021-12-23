package state;
public enum State {
    COMPASSIONATELY("сочувственно"),
    SILENTLY("молча"),
    HAPPY("весел"),
    SOOTH("правда"),
    FORTUNATE("счастлив"),
    WIDE("широко");

    private String state;

    State(String state) {
        this.state = state;
    }

    public String getState(){
        return String.format("%s ", this.state);
    }

}
