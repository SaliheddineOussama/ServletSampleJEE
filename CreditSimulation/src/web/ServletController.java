package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImpl;
@WebServlet(name="cs",urlPatterns={"/Controller","*.do"})
public class ServletController extends HttpServlet {
	private CreditMetierImpl metier;
	
	@Override
	public void init() throws ServletException {
		metier = new CreditMetierImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Read Data from request 
		double montant = Double.parseDouble(request.getParameter("montant"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		
		// Get result from the business Layer
		double mensualite = metier.calculMensualiteCredit(montant, taux, duree);
		
		// Store result to the model
		CreditModel model = new CreditModel();
		
		model.setMontant(montant);
		model.setDuree(duree);
		model.setTaux(taux);
		model.setMensualite(mensualite);
		
		// Store Model to the request Object
		request.setAttribute("modelCalcul", model);
		
		// Forward to the JSP which get the model and render it to html
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("modelCalcul", new CreditModel());
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	}

}
