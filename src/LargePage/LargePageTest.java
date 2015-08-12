package LargePage;

import java.util.HashMap;
import java.util.Random;

public class LargePageTest {

    static long maxElements = 50000000;
    static long maxLookUps = 100000000;
    static HashMap<Long,String> testHashMap = new HashMap();
    static Random rand = new Random();
    static int randomKey = 0;

    static void initHashMap()
    {
        for(long x=1;x<=maxElements;x++)
        {
            testHashMap.put(x,"this_is_some_random_value_to_use_as_a_reference");
        }
    }

    static void testLookUps()
    {
        for(long x=1;x<=maxLookUps;x++)
        {
            randomKey = rand.nextInt((int)maxElements);
            testHashMap.get(randomKey);
        }
    }


    public static void main(String[] args) {
        initHashMap();
    }

}
