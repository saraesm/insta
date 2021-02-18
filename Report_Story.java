
package instagram;


public class Report_Story extends Story{
    
    private int user_id;
    private int story_id;
    private String text;
    
     public Report_Story (){
        
        user_id=(int)Math.random();
        story_id=(int)Math.random();
        text="";
    }
}
