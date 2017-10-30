package communication.dao;

import java.util.List;

import communication.bean.User;

public interface UserDao {

	public User userLogin(String name,String password);//��½
	
	public boolean userRegister(String name,String password);//ע��
	
	public boolean userRemove(User user);//ע���û�
	
	public User findUserById(int id);//ͨ��id�����û�
	
	public List<User> findUserByName(String name);//ͨ�����ֲ����û�
	
}
