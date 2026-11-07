package com.pyry.springApp.database;

public interface IResultMapper <out T>{

	T map(ResultSet result);
}


