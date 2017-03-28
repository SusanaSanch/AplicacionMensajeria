

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class EscuchaInicio
 *
 */
@WebListener
public class EscuchaInicio implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public EscuchaInicio() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	HashMap<String, Usuario> mapa_usuarios = new HashMap<String, Usuario>();
    	mapa_usuarios.put("DGN", new Usuario("Daniel", "DGN", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("SSM", new Usuario("Susana", "SSM", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("CCS", new Usuario("Cristina", "CCS", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("DJO", new Usuario("Dante", "DJO", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("MSR", new Usuario("Manuel", "MSR", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("DDC", new Usuario("Duque", "DDC", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("IMA", new Usuario("Isabel", "IMA", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("AGF", new Usuario("Álvaro García", "AGF", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("AGR", new Usuario("Aitor", "AGR", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("AEC", new Usuario("Álvaro Esteve", "AEC", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("ICA", new Usuario("Iulian", "ICA", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("NBH", new Usuario("Nira", "NBH", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("ALB", new Usuario("Antonio", "ALB", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("CSS", new Usuario("Carlota", "CSS", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("ZMA", new Usuario("Zaineb", "ZMA", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("RMS", new Usuario("Rodrigo", "RMS", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("CHC", new Usuario("Cristian", "CHC", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put("JMP", new Usuario("Javi", "JMP", new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));

    	MapaUsuarios.setHm(mapa_usuarios);
    
    
    }
	
}
