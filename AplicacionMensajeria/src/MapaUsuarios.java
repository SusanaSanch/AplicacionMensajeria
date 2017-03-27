import java.util.HashMap;

public class MapaUsuarios {
	
	private static HashMap<Integer, Usuario> hm = new HashMap<Integer, Usuario>();

	public static HashMap<Integer, Usuario> getHm() {
		return hm;
	}

	public static void setHm(HashMap<Integer, Usuario> hm) {
		MapaUsuarios.hm = hm;
	}

	public MapaUsuarios ()
	{
		MapaUsuarios.hm = new HashMap<Integer, Usuario>();
	}
}
