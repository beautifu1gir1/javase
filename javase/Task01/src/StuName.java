public class StuName {

	// ʵ������
	// ѧ��������
	String name;

	// ѧ���Ա�
	String sex;

	// ��̬��ȫ�ֱ���
	static String schoolName;

	public static void main(String[] args) {

		// ʵ��������

		StuName stu1 = new StuName();

		stu1.name = "��";
		stu1.sex = "Ů";
		stu1.schoolName = "С̫��";
		
		System.out.println(stu1.name + stu1.sex);
		System.out.println("------>" + stu1.schoolName);

		StuName stu2 = new StuName();

		stu2.name = "��";
		stu2.sex = "��";

		System.out.println(stu2.name + stu2.sex);

		// ��̬�ķ�������ֱ�ӵ��ã����ô�������

		stu2.schoolName = "С�컨";
		System.out.println("------>" + stu1.schoolName);
		System.out.println("------>" + stu2.schoolName);

	}

}