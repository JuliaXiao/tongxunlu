package communication.dao;

import java.util.List;

import communication.bean.Card;

public interface CardDao {

	public Card findCardById(int id);
	
	public List<Card> findCardByName(String name);
	
	public List<Card> findCardByCompanyName(String companyName);
	
	public List<Card> findCardByKindName(String kindName);
	//........................................����
	public boolean update(Card card);
	//����........arg0Ϊ��Ҫ���ĵ�������arg1Ϊ��ӦҪ�ĵ�ֵ
	public boolean delete(Card card);
	//ɾ��...........................................
	public boolean add(Card card);
	//���...........................................
	
}
