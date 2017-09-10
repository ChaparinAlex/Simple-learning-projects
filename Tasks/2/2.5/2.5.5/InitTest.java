package labs;

import java.util.Random;

public class InitTest {
    private int id;
    private static int nextId;
    
    static{
    	Random r = new Random();
    	nextId = r.nextInt(1000) + 1;
    }
    
    {
    	nextId++;
    	id = nextId;
    }
    
    public int getId(){
    	return id;
    }
    
    static public int getNextId(){
    	return nextId;
    }
    
}
