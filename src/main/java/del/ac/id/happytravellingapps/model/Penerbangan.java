package del.ac.id.happytravellingapps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_penerbangan")
public class Penerbangan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pnb_id")
    private Long id;

    @Column(name = "pnb_asal")
    private String asal;

    @Column(name = "pnb_tujuan")
    private String tujuan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

}