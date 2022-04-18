package com.Dao;

import java.util.List;

import com.LoginBean.Bean;

public interface Dao {

	public void insert(Bean bean);
	
	public List<Bean> fetch();
	
	public void delete(Bean bean);
	
	public void update(Bean bean);
}
