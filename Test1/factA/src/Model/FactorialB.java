package Model;

import java.util.Random;
import java.util.Enumeration;
import java.util.Hashtable;

public class FactorialB {
    Hashtable<Integer, Integer> cache = new Hashtable<>();

    public int calculateWithCache(int x) throws Exception {
        if (x >= 0) {
            if (cache.containsKey(x)) { //if its in cache return the stored value
                return cache.get(x);
            }
            //enumerate through hashtable to find the key with the greatest value less than x
            int best = 0;
            Enumeration<Integer> e = cache.keys();
            while (e.hasMoreElements()) {
                int key = e.nextElement();
                if (key < x && key > best) {
                    best = key;
                }
            }
            cache(x); //runs the caching method
            if (best > 0) {
                return cache.get(best) * calculate(best, x); //used cached value to derive new value
            } else {
                return calculate(x); //calculate normally when there's nothing lower than you in cache
            }
        }
        throw new Exception("x must be greater than or equal to zero");
    }

    private Integer calculate(int key, int x) {
        System.out.println(key + "-" + x);
        int result = 1;
        while (x > key) {
            result *= x;
            x--;
        }
        return result;
    }

    private int calculate(int x) { //same as FactorialA
        int result = 1;
        while (x > 0) {
            result *= x;
            x--;
        }
        return result;
    }


    public void cache(int x) {
        Random r = new Random();
        int max = x / 2 - cache.size();
        while (max > 0) {
            //fill in the quarters first for more even distribution of stored numbers
            if (!(cache.containsKey(x / 4))) {
                cache.put(x / 4, calculate(x / 4));
                max--;
            } else if (!(cache.containsKey(x / 2))) {
                cache.put(x / 2, calculate(x / 2));
                max--;
            } else if (!(cache.containsKey(3 * x / 4))) {
                cache.put(3 * x / 4, calculate(3 * x / 4));
                max--;
            } else if (!(cache.containsKey(x))) {
                cache.put(x, calculate(x));
                max--;
            } else {
                Boolean flag = false;
                do {
                    int random = r.nextInt(x + 1); //random number < x in case quarters are filled
                    if (!(cache.containsKey(random))) {//if all the quarters are filled in then fill in randomly between 0 and x
                        cache.put(random, calculate(random));
                        max--;
                        flag = true;
                    }
                } while (!flag);
            }
        }
    }
}
