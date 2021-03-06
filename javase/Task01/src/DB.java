/*
 * 构造函数
 * 1.构造函数的名称要和类名保持一致
 * 2.不能有任何返回值的类型	(在方法前不能有int，String......)
 * 3.可以有访问修饰符	(可以在方法前有public，private)
 * 
 * 
 * 构造方法一和构造方法二		是相同的方法名---->有不同的实现结果
 * 多个构造函数形成重载
 */
public class DB {

	String name;
	int age;

	
//	构造方法一：
	public DB(){
		System.out.println("这是一个没有参数的构造方法");
	}
	
	
//	构造方法二
	public DB(String name,int age){
		
//		this不能够在静态方法中使用
//		构造函数作用：给类中的属性进行初始化赋值
		this.name = name;
		this.age = age;
		
		System.out.println("这是一个有参数的构造方法"+ "\t" + this.name +"\t" + this.age);
		
	}
	
//	有返回值类型的方法，不叫构造方法或者构造函数
//	实例方法，不是构造方法
	int DB(){
		
		return 0;
	}
	
	public static void main(String[] args) {
/*
 * 一个类中如果没有提供任何的构造函数，Java编译器会隐式自动提供一个没有参数的构造函数给创建对象使用
 * 如果一个类中提供了构造函数，创建对象必须依赖这个构造函数
 * 
 * 如果一个类有多个构造函数，那么就给创建对象提供了多个访问机制
 */
		
//		调用构造函数DB() 	构造函数是被隐式的调用
//		DB db = new DB();
		
		DB db2 = new DB("余淮",18);
		
	}
	
}
