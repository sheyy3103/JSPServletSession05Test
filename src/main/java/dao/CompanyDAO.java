package dao;

import java.util.List;

import enity.Company;

public interface CompanyDAO {
	List<Company> getAllCompanies();
	boolean addCompany(Company c);
	boolean updateCompany(Company c);
	Company getCompanyById(String companyId);
}
