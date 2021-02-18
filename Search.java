package instagram;

public class Search extends Follower {
  
    private int user_id;
    private String username;
    private String fullname;
    private String location;
    private String hashtag;
    
    public Search(){
        
        user_id=(int)Math.random();
        username="";
        fullname="";
        location="";
        hashtag="";
    }
    
}
