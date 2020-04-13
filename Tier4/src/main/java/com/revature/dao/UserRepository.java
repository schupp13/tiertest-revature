package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.config.ConnectionUtil;

import com.revature.model.User;

public class UserRepository implements CrudRepository<User> {

	@Override
	public User save(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<User> findAll() {
		// TODO Auto-generated method stub
		
		try(Connection conn = ConnectionUtil.connect()){
			String sql = "select * from app_user";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Set<User> list = new HashSet<>();
			
			while(rs.next()) {
			
				list.add(new User(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getString(4),rs.getString(5), rs.getInt(6)));
			}
			
			return list;
		}catch(SQLException e){
		e.printStackTrace();
		}
		return null;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
