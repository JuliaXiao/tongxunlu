
//���ļ�����Ŀ�޹أ�ֻ����������һЩ���������
public class demo {

	public static void main(String[] args) {
		int c=0;
		int d=0;
		for (int i = 0; i < 100000; i++) {
			System.out.println("�����ѡ���ǣ�");

			int a = (int) (Math.random() * 10);

			if (a % 2 == 0) {
				System.out.println("ȥ��");
				c++;
			} else {
				System.out.println("��ȥ");
				d++;
			}
			System.out.println(a);
		}
		System.out.println(c+"/"+d);
	}
}
