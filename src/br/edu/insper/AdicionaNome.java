package br.edu.insper;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicionaNome
 */
@WebServlet("/AdicionaNome")
//public class AdicionaNome extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public AdicionaNome() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
public class AdicionaNome extends HttpServlet {
    protected void service(HttpServletRequest request,
                        HttpServletResponse response)
    throws IOException, ServletException {
    		String nome = request.getParameter("nome"); 
    		String email = request.getParameter("e-mail");
    		String curso = request.getParameter("curso");
    		PrintWriter out = response.getWriter();
    		out.println("<html>"); 
    		out.println("<body>"); 
    		out.println("Inscrição confirmada");
    		out.println("<br /> Dados inseridos:<br />");
    		out.println("<br />Nome: " + nome ); 
    		out.println("<br />	E-mail: "+ email);
    		out.println("<br />Curso: " + curso);
    		out.println("</body>"); 
    		out.println("</html>");
    } 
    
}

