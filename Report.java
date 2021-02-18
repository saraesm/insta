
package instagram;


public class Report extends Post{
    
    private int user_id;
    private int post_id;
    private String text;
    
    public Report(){
        
        user_id=(int)Math.random();
        post_id=(int)Math.random();
        text="";
    }
}
