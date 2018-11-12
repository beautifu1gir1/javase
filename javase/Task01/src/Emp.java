
public class Emp {
	
//	员工姓名		实例变量
	String name;
	
//	员工年龄
	int age;
	
//	公司名称		静态变量
	static String cName;

	public static void main(String[] args) {

//		创建对象，实例化对象
//		Emp是创建对象的模板
		Emp e1 = new Emp();
		e1.name = "员工1";
		e1.age = 21;
		e1.cName = "化工厂";
		
		System.out.println("员工的姓名为：" + e1.name + "，年龄为：" + e1.age + "，公司名称：" + e1.cName);
		
		Emp e2 = new Emp();
		e2.name = "员工2";
		e2.age = 24;
		e2.cName = "电子厂";
		
		System.out.println("员工的姓名为：" + e2.name + "，年龄为：" + e2.age + "，公司名称：" + e2.cName);
		
//		设置静态变量，最好用      类名.静态变量名
//		静态变量，是对象的相同属性，共同拥有的
		Emp.cName = "软件公司";
		
//		e1的值赋值给e2， e2的栈内存指向e1的堆内存,实际是地址的赋值
		e2 = e1;
		
		System.out.println("员工的姓名为：" + e2.name + "，年龄为：" + e2.age + "，公司名称：" + e2.cName);
		
	}

}
