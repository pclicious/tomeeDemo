import java.io.IOException;
import java.io.PrintWriter;
import EjbReply.Reply;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReplyServlet")
public class ReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReplyServlet() {
        super();
       
    }

//    @EJB
//    Reply r;
    @EJB(beanInterface = Reply.class, beanName = "Reply", name = "myFriend")
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try
		{
			PrintWriter wr=res.getWriter();
			
			String a=req.getParameter("t1");
			
			
			
			Reply friend = (Reply) new InitialContext().lookup("java:comp/env/myFriend");
			friend.setname(a);
			wr.println(friend.Message());
			
			
		}
		catch(Exception e)
		{
							
		}
	}

}
