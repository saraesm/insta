
package instagram;


public class Tag extends Post{
    
    private int user_id;
    private int post_id;
    
    public Tag(){
        
        user_id=(int)Math.random();
        post_id=(int)Math.random();
    }
    
}
