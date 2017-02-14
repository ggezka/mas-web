package smkbangsri.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Entity
@Table(name = "buku")
public class Buku {
	private long id;
	private String judul;
	private String pengarang;
	private String tahunterbit;
	
	@ApiModelProperty("Buku ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // auto incremennt 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ApiModelProperty(value = "Buku Judul", required = true)
	@Column(nullable = false)
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	
	@ApiModelProperty(value = "Buku Pengarang", required = true)
	public String getPengarang() {
		return pengarang;
	}
	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}
	
	
	@Column(name = "tahun") 
	public String getTahunterbit() {
		return tahunterbit;
	}
	public void setTahunterbit(String tahunterbit) {
		this.tahunterbit = tahunterbit;
	}
	
	
	
}