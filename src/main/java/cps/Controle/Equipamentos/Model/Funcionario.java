package cps.Controle.Equipamentos.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Funcionario")
public class Funcionario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name="Nome")
	private String Nome;
	
	@Column(name="Sobrenome")
	private String Sobrenome;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Area")
	private String Area;
	
	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	
}
