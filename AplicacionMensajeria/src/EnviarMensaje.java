

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class EnviarMensaje
 */
@WebServlet("/EnviarMensaje")
public class EnviarMensaje extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnviarMensaje() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Gson gson = new Gson();
		 ArrayList<Mensaje> listaMen= new ArrayList<Mensaje>();
		 
		 
		 String json = gson.toJson(new Carta (675491591, 629008383, "Hola"), Carta.class);
	
		 Carta cartita = gson.fromJson(json, Carta.class); 
		 
		 Usuario usrRem = MapaUsuarios.getHm().get(cartita.getId_remitente());
		 
		 Usuario usrDest= MapaUsuarios.getHm().get(cartita.getId_destinatario());
		
		 Mensaje msg = new Mensaje(0,"hola" , null,usrRem , usrDest, false);
		 listaMen.add(msg);
		 
		 usrRem.setLista_enviados(listaMen);;
		 usrDest.setLista_recibidos(listaMen);
		 
		 
	}

}
