package communication.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import communication.bean.Kind;
import communication.dao.KindDao;
import communication.util.Util;

public class KindDaoImpl implements KindDao {

	@Override
	public Kind findKindByName(String name) {
		Kind kind = new Kind();
		
		String sql = "select * from kind where name=?";
		
		try {
			PreparedStatement preparedStatement = new Util().getConnection().prepareStatement(sql);
			
			preparedStatement.setString(1, name);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				kind.setId(resultSet.getInt("id"));
				
				kind.setName(resultSet.getString("name"));
				
				kind.setNum(resultSet.getInt("num"));
			}
		} catch (Exception e) {
			
		}
		return kind;
	}

	@Override
	public boolean addKind(Kind kind) {
		int a = 0;
		
		String sql = "insert into kind(name,num) values(?,?)";
		
		try {
			PreparedStatement preparedStatement = new Util().getConnection().prepareStatement(sql);
			
			preparedStatement.setString(1, kind.getName());
			
			preparedStatement.setInt(2, kind.getNum());
			
			a = preparedStatement.executeUpdate();
		} catch (Exception e) {
			
		}
		if (a>0) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Kind findKindById(int id) {
Kind kind = new Kind();
		
		String sql = "select * from kind where id=?";
		
		try {
			PreparedStatement preparedStatement = new Util().getConnection().prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				kind.setId(resultSet.getInt("id"));
				
				kind.setName(resultSet.getString("name"));
				
				kind.setNum(resultSet.getInt("num"));
			}
		} catch (Exception e) {
			
		}
		return kind;
	}//����д������Щ��Ƥ�ӿڣ���ģ���Ȼд��3�죬Ч��������޵еͣ����˸�����ǧ��֮��һ��д����6���ӿ�
	//����Ч�ʻ��ǿ�������������鿿��ʳ����
	//���������ǿ�ʼд����Ľӿڣ������Ҫ����2��ɣ��������û�գ�д���ˣ��ȷżٻ�����д
	//д��������д���پ��Ƕ���
	//power lee

}
