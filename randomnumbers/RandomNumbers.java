package randomnumbers;
import java.util.Random;
/**
 * Created by shuyi_chen on 6/21/17.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        int die1, die2, countDoubles = 0;
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            if (die1 == die2) {
                countDoubles++;
            }
        }

        System.out.println("I rolled " + countDoubles + " doubles");

    }
}
