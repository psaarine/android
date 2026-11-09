package com.pyry.springApp;

import java.util.List;
import com.pyry.springApp.database.DatabaseInfo;
import com.pyry.springApp.database.QueryExecutor;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CustomerRepository extends QueryExecutor<Customer> implements ICustomerRepository {


	public CustomerRepository(DatabaseInfo info) {
		super(info);
	}
	protected Customer mapResultToItem(ResultSet result) {
		return null;
	}
	public List<Customer> getCustomerByCode(String code) throws SQLException {
	
		return super.executeQuery("select * from users;");
	}
}
