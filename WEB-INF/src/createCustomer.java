
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dk.brics.xact.XML;

/**
 * Servlet implementation class login
 */
@WebServlet("/createCustomer")
public class createCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("customerName").trim();
		String password = request.getParameter("customerPass").trim();
		String passValidator = request.getParameter("passCheck").trim();
		System.out.println("Bruger: " + username + " Kode: " + password + " Gentag kode: " + passValidator);
		
		if (password != passValidator) {
			//FEJl
		}
		
		if (username.length() < 2 || username.length() > 20){
			response.sendRedirect("login.jsp?error=yes");
		}
		
		HttpURLConnection con = (HttpURLConnection)new URL("http://services.brics.dk/java4/cloud/createCustomer").openConnection();
		con.setDoInput(true);
		con.setDoOutput(true);
		con.setUseCaches(false);
		con.connect();
		
		//XML xml = XML.parseTemplate("<w:createCustomer"<w:shopKey>")	
				
				//.plug(test) inds¾tter v¾rdier ved [test] i XML parser 

		//xml.toDocument(con.getOutputStream(), "UTF-8")
		
		//XML resp = XML.parseDocument(con.getInputStream());
		
	}
}
