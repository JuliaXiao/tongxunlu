package communication.serverDao;

import communication.bean.User;

public interface UserServerDao {
	public User login(User user);
	
	public boolean resgister(User user);//û���ˣ��Ȳ�д��������
	
	public boolean remove(User user);
}
