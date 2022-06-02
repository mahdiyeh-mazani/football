package football;

import java.util.Random;

public class Goalkeeper extends Player implements Success {
    public Goalkeeper(int number) {
        super(number);
    }

    @Override
    public boolean isSuccessful() {
        Random a=new Random();
        if(a.nextInt(101)>=80)
            return true;
        else
            return false;
    }
}
