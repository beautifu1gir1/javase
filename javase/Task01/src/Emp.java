
public class Emp {
	
//	Ա������		ʵ������
	String name;
	
//	Ա������
	int age;
	
//	��˾����		��̬����
	static String cName;

	public static void main(String[] args) {

//		��������ʵ��������
//		Emp�Ǵ��������ģ��
		Emp e1 = new Emp();
		e1.name = "Ա��1";
		e1.age = 21;
		e1.cName = "������";
		
		System.out.println("Ա��������Ϊ��" + e1.name + "������Ϊ��" + e1.age + "����˾���ƣ�" + e1.cName);
		
		Emp e2 = new Emp();
		e2.name = "Ա��2";
		e2.age = 24;
		e2.cName = "���ӳ�";
		
		System.out.println("Ա��������Ϊ��" + e2.name + "������Ϊ��" + e2.age + "����˾���ƣ�" + e2.cName);
		
//		���þ�̬�����������      ����.��̬������
//		��̬�������Ƕ������ͬ���ԣ���ͬӵ�е�
		Emp.cName = "������˾";
		
//		e1��ֵ��ֵ��e2�� e2��ջ�ڴ�ָ��e1�Ķ��ڴ�,ʵ���ǵ�ַ�ĸ�ֵ
		e2 = e1;
		
		System.out.println("Ա��������Ϊ��" + e2.name + "������Ϊ��" + e2.age + "����˾���ƣ�" + e2.cName);
		
	}

}