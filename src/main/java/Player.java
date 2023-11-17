class Player {
    protected String name;
    protected Move move;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Move getMove() {
        return move;
    }
}