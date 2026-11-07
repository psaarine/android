package com.pyry.springApp;

import java.util.List;
import com.pyry.springApp.database.DatabaseInfo;
import com.pyry.springApp.database.IQueryExecutor;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository implements ICustomerRepository {

	private final IQueryExecutor exec;

	public CustomerRepository(IQueryExecutor exec)  {
		this.exec = exec;
	}
	public List<Customer> getCustomerByCode(String code) {
	
		exec.executeQuery();
		return null;
	}
}
