package football;

public class Player implements Success{
private int number;

    public Player(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean isSuccessful() {
        return false;
    }
}
