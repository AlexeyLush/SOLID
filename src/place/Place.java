package place;

public enum Place {
    HERE("здесь"),
    BESIDE("мимо");

    private String place;

    Place(String state) {
        this.place = state;
    }

    public String getPlace(){
        return String.format("%s ", this.place);
    }
}
