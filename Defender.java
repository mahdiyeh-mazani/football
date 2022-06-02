package football;

import java.util.Random;

public class Defender extends Player implements Success{
    public Defender(int number) {
        super(number);
    }

    @Override
    public boolean isSuccessful() {
        Random a=new Random();
        if(a.nextInt(101)>=60)
            return true;
        else
            return false;
    }
}
