
public class Test02 {

/*
 * 静态变量和静态方法都属于整个类，所以我们把静态变量叫做类变量
 * 										把静态方法叫做类方法
 * 对静态方法和静态变量的访问机制
 * 类名.静态变量名(方法名)
 */
	public static void main(String[] args) {

//		Teacher t1 = new Teacher();
//		t1.name = "诸葛";
//		t1.age = 45;
//		
//		Teacher.sName = "南科技";
//		
//		System.out.println("老师：" + t1.name + ",年龄为：" + t1.age + "，所在学校：" + Teacher.sName);
		
//		去访问Teacher类
		
		Teacher t3 = new Teacher();
		t3.setName("周瑜");
		t3.setAge(48);
		
		Teacher.sName = "南科技";
		
		System.out.println("老师：" + t3.getName() + ",年龄为：" + t3.getAge() + "，所在学校：" + Teacher.sName);
		
		
	}

}
