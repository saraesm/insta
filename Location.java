
package instagram;


public class Location extends Post{
   
    private int location_id;
    private int post_id;
    
    public Location(){
        
        location_id=(int)Math.random();
        post_id=(int)Math.random();
    }
}
