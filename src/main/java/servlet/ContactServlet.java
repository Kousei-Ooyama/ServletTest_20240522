package servlet;

import java.io.IOException;
import java.util.Arrays;

import bean.ContactCastomer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet/contactServlet")
public class ContactServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException{
		response.setContentType("text/html charset=utf-8");
		
		request.setCharacterEncoding("utf-8");
		
		ContactCastomer cc= new ContactCastomer();
		cc.setName(request.getParameter("name"));
		cc.setCompany(request.getParameter("company"));
		cc.setAddress(request.getParameter("address"));
		cc.setInquiry(request.getParameter("inquiry"));
		String[] array= request.getParameterValues("merumaga_type");
		cc.setMerumaga_type(Arrays.asList(array));
		cc.setDocument_request(request.getParameter("document_request"));
		
		if(cc.getDocument_request().equals("Yes")) {
			response.sendRedirect("../jsp/contact_anser_yes.jsp");
		}else {
			request.setAttribute("contactCastomer", cc);
			request.getRequestDispatcher("../jsp/contact_anser_no.jsp").forward(request,response);
		}
		
	}
}
