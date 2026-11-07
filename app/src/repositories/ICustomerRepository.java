package com.pyry.springApp;

import java.util.List;

public interface ICustomerRepository {

	List<Customer> getCustomerByCode(String code);
}
