package zepp;

import javax.persistence.*;

/**
 * Created by Zepp on 09.03.14.
 */
@Entity
@Table(name = "us")
public class Us {
    private String login;
    private String password;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public Us() {
    }

    public Us(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
