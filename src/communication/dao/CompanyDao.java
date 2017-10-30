package communication.dao;

import communication.bean.Company;

public interface CompanyDao {

	public boolean addCompany(Company company);//���
	
	public boolean deleteCompany(Company company);//ɾ��
	
	public Company findCompanyById(int id);//ͨ��id����
	
	public Company findCompanyByName(String name);//ͨ�����ֲ���
	
	public boolean updateCompany(Company company);//������Ϣ
}
