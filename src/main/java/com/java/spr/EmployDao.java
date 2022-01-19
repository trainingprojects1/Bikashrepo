package com.java.spr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployDao {
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
public String addEmploy(Employ employ) {
	String cmd="Insert into Employ(empno,name,gender,dept,design,basic)"+ "values(?,?,?,?,?,?)";
	jdbcTemplate.update(cmd,new Object[] {
			employ.getEmpno(),employ.getName(),employ.getGender().toString(),employ.getDept(),employ.getDesign(),employ.getBasic()});
	
return "Record Inserted";	
}
public String updateEmploy(Employ employ) {
	String cmd="Update Employ set name=?, gender=?,dept=?,design=?,basic=? Where empno=?";
	jdbcTemplate.update(cmd, new Object[] {
			employ.getName(),
			employ.getGender().toString(),
			employ.getDept(),
			employ.getDesign(),
			employ.getBasic(),
			employ.getEmpno()
	});
	return "Record Updated....";
}
public String delteEmploy(int empno) {
	String cmd="Delete From Employ where empno=?";
	jdbcTemplate.update(cmd, new Object[] {empno});
	return "Record Deleted..";
}
public Employ[] showEmploy() {
	String cmd="select*from Employ";
	List<Employ>employlist=jdbcTemplate.query(cmd, new RowMapper<Employ>() {

		@Override
		public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employ employ= new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setBasic(rs.getInt("basic"));
			employ.setDept(rs.getNString("dept"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			return employ;
		}});
	return employlist.toArray(new Employ[employlist.size()]);
}
public Employ searchEmploy(int empno) {
	String cmd="select*from Employ where empno=?";
	List<Employ> employLi= jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employ>() {
		@Override
		public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employ employ= new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setBasic(rs.getInt("basic"));
			employ.setDept(rs.getNString("dept"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
	 		return employ;
		
		}});
	if (employLi.size()==1) {
		return employLi.get(0);
	} 
	return null;
}

}
