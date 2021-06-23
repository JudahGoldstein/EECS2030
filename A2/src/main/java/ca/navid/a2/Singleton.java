package ca.navid.a2;

import org.jetbrains.annotations.Nullable;

import java.util.Hashtable;
import java.util.UUID;

/**
 * To be complete by students for caching layer
 */
public class Singleton {
    /**
     * cache hashtable
     */
    public static final Hashtable<UUID, MultipleListingService> cache = new Hashtable<>();
    /**
     * single static instance of class, needed to access singleton class.
     */
    public static Singleton instance = new Singleton();
    /**
     * constructor is made private, prevents instantiation of new instances
     */
    private Singleton(){}
    /**
     * @param uuid uuid of the mls entry not in cache
     * @param record corresponding record to be cached
     */
    public void cache(UUID uuid, MultipleListingService record){
        cache.put(uuid, record);
    }
    /**
     * @param uuid uuid to be looked up in cache
     * @return mls corresponding to the UUID if it is in cache, otherwise return null
     */
    @Nullable
    public MultipleListingService cacheLookup(UUID uuid){
        if(cache.containsKey(uuid)){
            return cache.get(uuid);
        }
        return null;
    }
    /**
     * clears the cache
     */
    public void clearCache(){
        cache.clear();
    }

    public static Singleton getInstance(){
        return instance;
    }
}

