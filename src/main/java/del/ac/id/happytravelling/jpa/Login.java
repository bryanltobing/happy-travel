package del.ac.id.happytravelling.jpa;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_login")
public class Login {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="roleid")
    private int roleid;
    @Column(name="lastlogin")
    private Date lastlogin;
    @Column(name="isactive")
    private boolean isactive;

    public Login() {}
    public Login(String username, int roleid, Date lastlogin, boolean isactive) {
        this.username = username;
        this.roleid = roleid;
        this.lastlogin = lastlogin;
        this.isactive = isactive;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }
    public void  setIsactive(boolean isactive) {
        this.isactive = isactive;
    }
    public String getUsername() {
        return this.username;
    }
    public int getRoleid(){
        return this.roleid;
    }
    public Date getLastlogin() {
        return this.lastlogin;
    }
    public boolean getIsActive() {
        return this.isactive;
    }
}
