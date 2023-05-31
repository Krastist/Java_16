public class Player {
    private int id;
    private String name;
    private int strangth;

    public Player(int id, String name, int strangth) {
        this.id = id;
        this.name = name;
        this.strangth = strangth;
    }

    public String getName() {
        return name;
    }

    public int getStrangth() {
        return strangth;
    }
}
