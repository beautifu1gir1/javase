/*
 * ��������������1.��װ��	2.�̳���		3.��̬��		4.������
 * 
 * ��װ�ԣ������е���������˽��private�������Ͳ���ֱ�ӷ������е�˽�ж���
 * �����е�˽�е����Խ��з���������(set/get|������������ĸ��д)
 * ͨ�����������ж����ݵķ��ʣ�ͨ���������Ƕ������ߣ����ݽ��а�ȫ���ơ�
 */
public class Teacher {

//	��ʦ����
//	private ������˽�еģ���֤���ݵİ�ȫ��
	private String name;
	
//	��ʦ����
	private int age;
	
//	ѧУ����
	static String sName;

//	��java����ͨ��set��get�������������ݷ��ʣ�������ݷ��ʵİ�ȫ��,�����ķ������η�������Ϊpublic ���� ��

//	����ֵ
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		
		if (this.age>0 && this.age <=150) {
			return this.age;
		} else {
			return 0;
		}
		
	}

	public void setAge(int age) {
		
		if (age>0 && age <=150) {
//			this��ʾ���ǵ�ǰ����,˭�������������this����˭
			this.age = age;
			
		} else {
			System.out.println("��������ݲ��Ϸ�");
		}
		
	}

	
	
}
