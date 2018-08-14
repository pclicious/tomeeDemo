package EjbReply;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Reply
 */
@Stateless
@LocalBean
public class Reply {

	private String name,wish;
	
	public String getname()
	{
		return this.name;
	}
	
	
	public void setname(String n)
	{
		this.name= n;
	}
	
	public String Message()
	{
		this.wish="hello";
		return this.wish+" "+ this.name;
	}
    public Reply() {
        // TODO Auto-generated constructor stub
    	
    	
    }
    
    
    
    

}
