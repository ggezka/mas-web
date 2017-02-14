package smkbangsri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import smkbangsri.entity.Buku;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@Entity
@Table(name = "anggota")
public class Anggota {
	private long id;
	private String nama;
	private String alamat;
	private String noTelpon;
	private Buku buku;
	
	@ApiModelProperty("Anggota ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ApiModelProperty(value = "Anggota Nama", required = true)
	@Column(nullable=false)
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	@ApiModelProperty(value = "Anggota Alamat", required = true)
	@Lob
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	@ApiModelProperty(value = "Anggota NoTelpon", required = true)
	public String getNoTelpon() {
		return noTelpon;
	}
	public void setNoTelpon(String noTelpon) {
		this.noTelpon = noTelpon;
	}
	
	@ApiModelProperty(value = "Buku Of Anggota")
	@ManyToOne
	@JoinColumn(name= "buku_id")
	public Buku getBuku() {
		return buku;
	}
	public void setBuku(Buku buku) {
		this.buku = buku;
	}
	
}