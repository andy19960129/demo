package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.example.demo.pojo.User;

@Repository
public class UserDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate jdbcNameTemplate;
	
	public User findByUsername(String username) {
		String sql = "select * from BUser where username = ?";
		
		List<User> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), new Object[] { username });
		if(result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}
	
	public User getByUsernameAndPassword(String username, String password) {
		String sql = "select * from BUser where username = ? and password = ?";
		
		List<User> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), new Object[] { username, password });
		if(result != null && result.size() > 0) {
			return result.get(0);
		}
		return null;
	}
	
	public void save(User user) {
		String sql = "INSERT INTO BUser "
				+ " (id,password,username,phone_number,registration_time,last_login_time) "
				+ " VALUE (:id,:password,:username,:phone_number,'','') ";
		
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(user);
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		jdbcNameTemplate.update(sql, paramSource, keyHolder);
	}
	
}
