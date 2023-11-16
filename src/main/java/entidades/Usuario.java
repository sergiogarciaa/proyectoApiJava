package entidades;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuarios", schema = "gbp_operacional3")
public class Usuario {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private long idUsuario;

	@Column(name = "dni_usuario", nullable = false)
	private String dniUsuario;

	@Column(name = "nombre_usuario")
	private String nombreUsuario;

	@Column(name = "apellidos_usuario")
	private String apellidosUsuario;

	@Column(name = "tlf_usuario")
	private String tlfUsuario;

	@Column(name = "email_usuario")
	private String emailUsuario;

	@Column(name = "clave_usuario")
	private String claveUsuario;

	@Column(name = "estaBloqueado_usuario")
	private boolean estaBloqueadoUsuario;

	@Column(name = "fch_fin_bloqueo")
	private Calendar fchFinBloqueo;

	@Column(name = "fch_alta_usuario")
	private Calendar fchAltaUsuario;

	@Column(name = "fch_baja_usuario")
	private Calendar fchBajaUsuario;

	/*
	 * @Column(name="id_acceso") private long idAcceso;
	 */

	// CONSTRUCTORES

public Usuario(String dni_usuario, String nombre_usuario, String apellidos_usuario, String tlf_usuario,
			String email_usuario, String clave_usuario) {
		super();
		this.dniUsuario = dni_usuario;
		this.nombreUsuario = nombre_usuario;
		this.apellidosUsuario = apellidos_usuario;
		this.tlfUsuario = tlf_usuario;
		this.emailUsuario = email_usuario;
		this.claveUsuario = clave_usuario;
	}

	public Usuario() {
		super();
	}

	public Usuario(String dniUsuario, String nombreUsuario, String apellidosUsuario, String tlfUsuario,
			String emailUsuario, String claveUsuario, boolean estaBloqueadoUsuario,
			Calendar fchAltaUsuario) {
		super();
		this.dniUsuario = dniUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidosUsuario = apellidosUsuario;
		this.tlfUsuario = tlfUsuario;
		this.emailUsuario = emailUsuario;
		this.claveUsuario = claveUsuario;
		this.estaBloqueadoUsuario = estaBloqueadoUsuario;
		this.fchAltaUsuario = fchAltaUsuario;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidosUsuario() {
		return apellidosUsuario;
	}

	public void setApellidosUsuario(String apellidosUsuario) {
		this.apellidosUsuario = apellidosUsuario;
	}

	public String getTlfUsuario() {
		return tlfUsuario;
	}

	public void setTlfUsuario(String tlfUsuario) {
		this.tlfUsuario = tlfUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public boolean isEstaBloqueadoUsuario() {
		return estaBloqueadoUsuario;
	}

	public void setEstaBloqueadoUsuario(boolean estaBloqueadoUsuario) {
		this.estaBloqueadoUsuario = estaBloqueadoUsuario;
	}

	public Calendar getFchFinBloqueo() {
		return fchFinBloqueo;
	}

	public void setFchFinBloqueo(Calendar fchFinBloqueo) {
		this.fchFinBloqueo = fchFinBloqueo;
	}

	public Calendar getFchAltaUsuario() {
		return fchAltaUsuario;
	}

	public void setFchAltaUsuario(Calendar fchAltaUsuario) {
		this.fchAltaUsuario = fchAltaUsuario;
	}

	public Calendar getFchBajaUsuario() {
		return fchBajaUsuario;
	}

	public void setFchBajaUsuario(Calendar fchBajaUsuario) {
		this.fchBajaUsuario = fchBajaUsuario;
	}

	
	
	

}