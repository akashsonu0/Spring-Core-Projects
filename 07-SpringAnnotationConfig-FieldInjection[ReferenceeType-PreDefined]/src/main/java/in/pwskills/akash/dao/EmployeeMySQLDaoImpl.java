package in.pwskills.akash.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mysqlDao")
public class EmployeeMySQLDaoImpl implements IEmployeeDao {
		
	@Autowired
	private DataSource ds;
	
	@Override
	public void getConnection() {
		try {
			Connection connection = ds.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student where sid =1");
			if(resultSet.next()) {
				System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4));
			}else {
				System.out.println("Record not found for the is");
			  }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


		
	

