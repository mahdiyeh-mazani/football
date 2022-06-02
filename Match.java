package football;

public class Match {

    public static void main(String[] args) {

        Player[] a = new Player[11];

        Player ga = new Goalkeeper(0);
        a[0] = ga;

        Player da1 = new Defender(1);
        a[1] = da1;

        Player da2 = new Defender(2);
        a[2] = da2;

        Player da3 = new Defender(3);
        a[3] = da3;

        Player da4 = new Defender(4);
        a[4] = da4;

        Player ma1 = new Midfielder(5);
        a[5] = ma1;

        Player ma2 = new Midfielder(6);
        a[6] = ma2;

        Player ma3 = new Midfielder(7);
        a[7] = ma3;

        Player ma4 = new Midfielder(8);
        a[8] = ma4;

        Player fa1 = new Forward(9);
        a[9] = fa1;

        Player fa2 = new Forward(10);
        a[10] = fa2;
        Player[] b = new Player[11];

        Player gb = new Goalkeeper(0);
        b[0] = gb;

        Player db1 = new Defender(1);
        b[1] = db1;

        Player db2 = new Defender(2);
        b[2] = db2;

        Player db3 = new Defender(3);
        b[3] = db3;

        Player db4 = new Defender(4);
        b[4] = db4;

        Player mb1 = new Midfielder(5);
        b[5] = mb1;

        Player mb2 = new Midfielder(6);
        b[6] = mb2;

        Player mb3 = new Midfielder(7);
        b[7] = mb3;

        Player mb4 = new Midfielder(8);
        b[8] = mb4;

        Player fb1 = new Forward(9);
        b[9] = fb1;

        Player fb2 = new Forward(10);
        b[10] = fb2;
        Team first = new Team("first", a, 0);
        Team second = new Team("second", b, 0);
        for (int i = 1; i <= 90; i++) {
            int da = 0;
            int db = 0;
            int ma = 0;
            int mb = 0;
            int fa = 0;
            int fb = 0;

            if (da1.isSuccessful() == true) da++;
            if (da2.isSuccessful() == true) da++;
            if (da3.isSuccessful() == true) da++;
            if (da4.isSuccessful() == true) da++;
            if (db1.isSuccessful() == true) db++;
            if (db2.isSuccessful() == true) db++;
            if (db3.isSuccessful() == true) db++;
            if (db4.isSuccessful() == true) db++;
            if (ma1.isSuccessful() == true) ma++;
            if (ma2.isSuccessful() == true) ma++;
            if (ma3.isSuccessful() == true) ma++;
            if (ma4.isSuccessful() == true) ma++;
            if (mb1.isSuccessful() == true) mb++;
            if (mb2.isSuccessful() == true) mb++;
            if (mb3.isSuccessful() == true) mb++;
            if (mb4.isSuccessful() == true) mb++;
            if (fa1.isSuccessful() == true) fa++;
            if (fa2.isSuccessful() == true) fa++;
            if (fb1.isSuccessful() == true) fb++;
            if (fb2.isSuccessful() == true) fb++;
            if (ga.isSuccessful() == true) {
                if (da >= 3) if (ma >= 3) if (fa >= 1) first.setGoals(first.getGoals() + 1);
            }
            if (gb.isSuccessful() == true) {
                if (db >= 3) if (mb >= 3) if (fb >= 1) second.setGoals(second.getGoals() + 1);
            }

        }
        if (first.getGoals() > second.getGoals()) {
            System.out.println("winner:first");
            System.out.println(first.getGoals() + "/" + second.getGoals());
        } else if (first.getGoals() < second.getGoals()) {
            System.out.println("winner:second");
            System.out.println(first.getGoals() + "/" + second.getGoals());
        } else if (first.getGoals() == second.getGoals()) {
            System.out.println("equal");
            System.out.println(first.getGoals() + "/" + second.getGoals());
        }

    }
}
