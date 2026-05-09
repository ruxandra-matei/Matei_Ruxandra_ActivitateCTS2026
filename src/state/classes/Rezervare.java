package state.classes;

public class Rezervare {
    private int id;
    private IStare stare;

    public Rezervare(int id) {
        this.id = id;
        stare = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("id=").append(id);
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
