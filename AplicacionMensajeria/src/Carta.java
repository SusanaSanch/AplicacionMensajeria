
public class Carta {

	private int id_remitente;
	private int id_destinatario;
	private String mensaje;
	public int getId_remitente() {
		return id_remitente;
	}
	public void setId_remitente(int id_remitente) {
		this.id_remitente = id_remitente;
	}
	public int getId_destinatario() {
		return id_destinatario;
	}
	public void setId_destinatario(int id_destinatario) {
		this.id_destinatario = id_destinatario;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Carta(int id_remitente, int id_destinatario, String mensaje) {
		super();
		this.id_remitente = id_remitente;
		this.id_destinatario = id_destinatario;
		this.mensaje = mensaje;
	}
	
	
}
