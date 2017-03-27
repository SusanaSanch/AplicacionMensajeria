

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
    	HashMap<Integer, Usuario> mapa_usuarios = new HashMap<Integer, Usuario>();
    	mapa_usuarios.put(675491591, new Usuario("Daniel", 675491591, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(629008383, new Usuario("Susana", 629008383, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(636330405, new Usuario("Cristina", 636330405, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(603858113, new Usuario("Dante", 603858113, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(685799293, new Usuario("Manuel", 685799293, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(663278994, new Usuario("Duque", 663278994, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(695480008, new Usuario("Isabel", 695480008, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(626723358, new Usuario("Álvaro García", 626723358, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(648536056, new Usuario("Aitor", 648536056, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(638072224, new Usuario("Álvaro Esteve", 638072224, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(671418130, new Usuario("Iulian", 671418130, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(626237277, new Usuario("Nira", 626237277, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(615315404, new Usuario("Antonio", 615315404, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(630115802, new Usuario("Carlota", 630115802, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(625164730, new Usuario("Zaineb", 625164730, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(657943713, new Usuario("Rodrigo", 657943713, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(617184400, new Usuario("Cristian", 617184400, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));
    	mapa_usuarios.put(600057665, new Usuario("Javi", 600057665, new ArrayList<Mensaje>(), new ArrayList<Mensaje>()));

    	MapaUsuarios.setHm(mapa_usuarios);
    
    }
	
}
