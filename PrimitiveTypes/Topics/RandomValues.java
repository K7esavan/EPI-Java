import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomValues {

    public static void main(String args[]){

        Random rand = new Random();

        System.out.println(rand.nextInt(10)); //0 to 10
        System.out.println(rand.nextBoolean()); //either true or false
        System.out.println(rand.nextInt()); //inside the range of integer
        System.out.println(rand.nextDouble()); //value in [0, 1]

        //random method from math
        System.out.println(Math.random());

        //Random string from a string array can be done using nextInt() itself
        String texts[] = {"hey", "hero", "how", "are", "you"};

        System.out.println(texts[rand.nextInt(texts.length)]); // that's how it is man

        //Random number between some range [a, b]
        int random = ThreadLocalRandom.current().nextInt(100000, 121212121);
        System.out.println(random);
    }
}
