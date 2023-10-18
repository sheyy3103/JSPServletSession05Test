package dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.CompanyDAO;
import db.DBUtility;
import enity.Company;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public List<Company> getAllCompanies() {
		// TODO Auto-generated method stub
		List<Company> list = new ArrayList<>();

		Connection conn;
		PreparedStatement ps;
		ResultSet rs;

		conn = DBUtility.openConnection();

		try {
			String sql = "select * from Companies";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Company c = new Company();
				c.setCompanyId(rs.getString(1));
				c.setCompanyName(rs.getString(2));
				c.setAddress(rs.getString(3));
				c.setDirector(rs.getString(4));
				c.setInaugurationDay(rs.getDate(5));
				c.setFieldOfActivity(rs.getString(6));
				c.setTotalEmployees(rs.getInt(7));

				list.add(c);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtility.closeConnection(conn);
		}
		return list;
	}

	@Override
	public boolean addCompany(Company c) {
		// TODO Auto-generated method stub
		boolean bool = false;

		Connection conn;
		PreparedStatement ps;

		conn = DBUtility.openConnection();
		try {
			String sql = "insert into companies(CompanyId,CompanyName,Address,Director,InaugurationDay,FieldOfActivity,TotalEmployees) values(?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCompanyId());
			ps.setString(2, c.getCompanyName());
			ps.setString(3, c.getAddress());
			ps.setString(4, c.getDirector());
			ps.setDate(5, new Date(c.getInaugurationDay().getTime()));
			ps.setString(6, c.getFieldOfActivity());
			ps.setInt(7, c.getTotalEmployees());

			int i = ps.executeUpdate();
			if (i > 0)
				bool = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtility.closeConnection(conn);
		}

		return bool;
	}

	@Override
	public boolean updateCompany(Company c) {
		// TODO Auto-generated method stub
		boolean bool = false;

		Connection conn;
		PreparedStatement ps;

		conn = DBUtility.openConnection();
		try {
			String sql = "update companies set CompanyName = ?, Address = ?, Director = ?, InaugurationDay = ?, FieldOfActivity = ?, TotalEmployees = ? where CompanyId = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, c.getCompanyName());
			ps.setString(2, c.getAddress());
			ps.setString(3, c.getDirector());
			ps.setDate(4, new Date(c.getInaugurationDay().getTime()));
			ps.setString(5, c.getFieldOfActivity());
			ps.setInt(6, c.getTotalEmployees());
			ps.setString(7, c.getCompanyId());

			int i = ps.executeUpdate();
			if (i > 0)
				bool = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtility.closeConnection(conn);
		}

		return bool;
	}

	@Override
	public Company getCompanyById(String companyId) {
		// TODO Auto-generated method stub
		Company c = new Company();
		
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;

		conn = DBUtility.openConnection();

		try {
			String sql = "select * from Companies where companyId = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, companyId);
			rs = ps.executeQuery();
			if (rs.next()) {
				c.setCompanyId(rs.getString(1));
				c.setCompanyName(rs.getString(2));
				c.setAddress(rs.getString(3));
				c.setDirector(rs.getString(4));
				c.setInaugurationDay(rs.getDate(5));
				c.setFieldOfActivity(rs.getString(6));
				c.setTotalEmployees(rs.getInt(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtility.closeConnection(conn);
		}
		return c;
	}

}
