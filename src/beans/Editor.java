package beans;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "editor")
public class Editor {
	private String value = "This editor is provided by PrimeFaces";
	private Date date1;
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}
	
	public void ourmethod(){
	   //	FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, date1.toString(),  null);
       // FacesContext.getCurrentInstance().addMessage(null, message);
        
        System.out.println("You Selected "+date1);
	}
	
	
}

