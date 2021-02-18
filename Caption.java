
package instagram;


public class Caption extends Post{
    
    private int post_id;
    private int user_id;
    private String text;
    private String hashtag;
    
    public Caption(){
        
        post_id=(int)Math.random();
        user_id=(int)Math.random();
        text="";
        hashtag="";
       
    }
    
    public void edit_text(String s){
        
        text=s;
        
    }
    public String get_edit_text(){
        return text;
    }
  
}
