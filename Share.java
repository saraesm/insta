
package instagram;


public class Share extends Post{
    
    private int user_id;
    private int post_id;
    
    public Share(){
        
        user_id=(int)Math.random();
        post_id=(int)Math.random();
    }
    
}
