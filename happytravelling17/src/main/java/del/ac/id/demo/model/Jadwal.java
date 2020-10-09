package del.ac.id.demo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "t_jadwal")
public class Jadwal {
    @Id
    private String id = UUID.randomUUID().toString();

    @Column(name = "asal")
    private String kotaasal;

    @Column(name = "tujuan")
    private String kotatujuan;

    @Column(name = "harga")
    private Long harga;

    @Column(name = "waktu")
    @Temporal(TemporalType.DATE)
    private Date tanggal;

    @Column(name = "kuota")
    private Integer kuota;

    public Jadwal() {}
    public Jadwal(String kotaasal, String kotatujuan, Long harga, Date tanggal, Integer kuota) {
        this.kotaasal = kotaasal;
        this.kotatujuan = kotatujuan;
        this.harga = harga;
        this.tanggal = tanggal;
        this.kuota = kuota;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKotaasal() {
		return kotaasal;
	}
	public void setKotaasal(String kotaasal) {
		this.kotaasal = kotaasal;
	}
	public String getKotatujuan() {
		return kotatujuan;
	}
	public void setKotatujuan(String kotatujuan) {
		this.kotatujuan = kotatujuan;
	}
	public Long getHarga() {
		return harga;
	}
	public void setHarga(Long harga) {
		this.harga = harga;
	}
	public Date getTanggal() {
		return tanggal;
	}
	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}
	public Integer getKuota() {
		return kuota;
	}
	public void setKuota(Integer kuota) {
		this.kuota = kuota;
	}
    
    
}
