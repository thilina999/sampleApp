package beans;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="loginBean")
public class LoginBean {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String checkLogin(){
        if(username.trim().equals("admin")&&password.trim().equals("pass"))
        {
        	System.out.println("logged in");clear();
            //return "success";
        	return "index.xhtml";
        }
        else
        {
        	System.out.println("invalid login");clear();
            return "failure";
        }
        
    }
	public void clear(){
		setUsername(null);
		setPassword(null);
	}
}
