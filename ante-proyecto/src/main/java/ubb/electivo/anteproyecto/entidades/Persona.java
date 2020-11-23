package ubb.electivo.anteproyecto.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona", schema = "usuario")

public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre_persona")
	private String nombrePersona;
	@Column(name = "email")
	private String email;
	@Column(name = "activo")
	private Integer activo;

	@ManyToOne
	private Direccion direccion;
	
	public Persona() {}
	
	public Persona(Long id, String nombrePersona, String email, Integer activo, Direccion direccionId) {
		super();
		this.id = id;
		this.nombrePersona = nombrePersona;
		this.email = email;
		this.activo = activo;
		this.direccion = direccionId;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombrePersona=" + nombrePersona + ", email=" + email + ", activo=" + activo
				+ ", direccionId=" + direccion + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccionId) {
		this.direccion = direccionId;
	}
	
	
	
}
