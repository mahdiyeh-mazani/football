package football;

import java.util.Random;

public class Forward extends Player implements Success{

    public Forward(int number) {
        super(number);
    }
    @Override
    public boolean isSuccessful() {
        Random a=new Random();
        if(a.nextInt(101)>=20)
            return true;
        else
            return false;
    }
}
