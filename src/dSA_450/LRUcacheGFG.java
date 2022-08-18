package dSA_450;
import java.util.*;
public class LRUcacheGFG {

	public static void main(String[] args) {
	}

}
class LRUCache
{
    static int size;
    static Map<Integer,Integer> mp;
    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int cap)
    {
        //code here
    	size=cap;
    	mp=new LinkedHashMap<>();
    }

    //Function to return value corresponding to the key.
    public static int get(int key)
    {
        // your code here
    	if(mp.containsKey(key)) {
    		int data=mp.get(key);
    		mp.remove(key,data);
    		mp.put(key,data);
    		return data;
    	}
    	return -1;
    }

    //Function for storing key-value pair.
    public static void set(int key, int value)
    {
        // your code here
    	if(mp.size()<size) {
    		mp.put(key, value);
    	}else {
    		if(mp.containsKey(key)) {
    			mp.remove(key);
    			mp.put(key, value);
    		}else {
    		    int LRUKey=0;
    			for(int k:mp.keySet()) {
    				LRUKey=k;
    				break;
    			}
    			mp.remove(LRUKey);
    			mp.put(key, value);
    		}
    	}
    }
}

