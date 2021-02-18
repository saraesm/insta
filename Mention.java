
package instagram;


public class Mention extends Follower {
    
    private int post_id;
    private int story_id;
    private int user_id;
    
    public Mention(){
        
        post_id=(int)Math.random();
        story_id=(int)Math.random();
        user_id=(int)Math.random();
    }
    
}
