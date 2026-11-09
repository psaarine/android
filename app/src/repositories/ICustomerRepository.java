package com.pyry.springApp;

import java.util.List;
import java.sql.SQLException;

public interface ICustomerRepository {

	List<Customer> getCustomerByCode(String code) throws SQLException;
}
