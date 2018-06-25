package beans;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "applicationView")
public class ApplicationView {
	private String name;
	private String email;
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	private int phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String display(){
		String msg =  "Name is : "+this.name+ " Email is : "+this.email+" Age is : "+this.age+ " PhoneNumber is : "+this.phone ;
		System.out.println(msg);
		return msg;
		}
}
