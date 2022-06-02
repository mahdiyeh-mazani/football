package football;

public class Team {
    private String name;
    private Player[] Players;
    private int goals=0;

    public Team(String name, Player[] players, int goals) {
        this.name = name;
        Players = players;
        this.goals = goals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(Player[] players) {
        Players = players;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public Player[] getPlayers() {
        return Players;
    }

    public int getGoals() {
        return goals;
    }
}
