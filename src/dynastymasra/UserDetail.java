/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dynastymasra;
/**
 *
 * @author Dynastymasra
 */
public class UserDetail {
    private String id;
    private String username;
    private String name;
    private String deposit;

    public String getDeposit() {
        return deposit;
    }
    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
