
package instagram;


public class Report_Live extends Live{
    
    private int user_id;
    private int live_id;
    private String text;
    
     public Report_Live (){
        
        user_id=(int)Math.random();
        live_id=(int)Math.random();
        text="";
    }
    
}
