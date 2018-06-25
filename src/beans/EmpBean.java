package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Employee;

@ManagedBean
@RequestScoped
public class EmpBean
{
    public List<Employee> getEmpData()
    {
        List<Employee> emplist=new LinkedList<Employee>();
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection
            ("jdbc:odbc:AzimOracleDSN","azim","azim");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select empno,ename,sal,deptno from emp");
            while(rs.next())
            {
                Employee e=new Employee();
                e.setEmpno(rs.getInt(1));
                e.setEname(rs.getString(2));
                e.setSal(rs.getInt(3));
                e.setDeptno(rs.getInt(4));
                emplist.add(e);
            }
            rs.close();
            st.close();
            con.close();
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Invalid Driver..."+ex.getMessage());
        }
        catch(SQLException ex)
        {
            System.out.println("SQL Exception..."+ex.getMessage());
        }
        return emplist;
    }
}