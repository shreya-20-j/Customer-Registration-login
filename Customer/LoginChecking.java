package studioManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/checking")
public class LoginChecking extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{  PrintWriter out=res.getWriter();

	   res.setContentType("text.html");
		String myname=req.getParameter("your_name");
		String mypass=req.getParameter("your_pass");
		try {
           Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studio_db","root","");
			PreparedStatement ps=con.prepareStatement("select * from customer_info where name=? and password=?");
			ps.setString(1, myname);
			ps.setString(2, mypass);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				
				RequestDispatcher rd=req.getRequestDispatcher("/welcome.jsp");
				req.setAttribute("myname", rs.getString("name"));
				rd.include(req, res);
			}
			else
			{res.setContentType("text/html");
			 out.println("<html><head>");
			 out.println("<link rel='stylesheet' href='welcomestyle.css'>");
	            out.println("</head><body>");
	            out.println("<div class='popup'>");
	            out.println("<div class='imgbox'>");
	            out.println("<img src='sorry.jpg' alt='Error Image' class='img'>");
	            out.println("</div>");
	            out.println("<div class='title'>");
	            out.println("<h3>sorry</h3>");
	            out.println("</div>");
	            out.println("<p class='para'>wrong username or password</p>");
	            out.println("<button class='button-ok' onclick='closePopup()'>OK</button>");
	            out.println("</div>");
	            out.println("<script>");
	            out.println("function closePopup() {");
	            out.println("    var popup = document.querySelector('.popup');");
	            out.println("    popup.style.display = 'none';");
	            out.println("}");
	            out.println("</script>");
	            out.println("</body></html>");
				RequestDispatcher rd=req.getRequestDispatcher("/customerLogin.jsp");
				rd.include(req, res);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
}