package items;

import java.util.Objects;

public abstract class AbstractItem {

    private String title;
    private String adjective;

    public AbstractItem(String title){
        this.title = title;
    }

    public AbstractItem(String title, String adjective){
        this.title = title;
        this.adjective = adjective;
    }

    public String getAdjective(){
        return this.adjective;
    }

    public void setAdjective(String adjective){
        this.adjective = adjective;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAdjectiveAndTitle(){
        return String.format("%s %s", this.adjective, this.title);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        AbstractItem that = (AbstractItem) object;
        return Objects.equals(title, that.title) && Objects.equals(adjective, that.adjective);
    }

    @Override
    public String toString() {
        return "AbstractItem{" +
                "title='" + title + '\'' +
                ", adjective='" + adjective + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, adjective);
    }
}
