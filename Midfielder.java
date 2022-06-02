package football;

import java.util.Random;

public class Midfielder extends Player implements Success{
    public Midfielder(int number) {
        super(number);
    }
    @Override
    public boolean isSuccessful() {
        Random a=new Random();
        if(a.nextInt(101)>=40)
            return true;
        else
            return false;
    }
}
