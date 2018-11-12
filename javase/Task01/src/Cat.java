
public class Cat {

//	猫的名字
	private String name;
	
//	猫的颜色
	private String color;
	
	private  void show() {
//		this表示当前对象
		System.out.println(this.name + "\t" + this.color);
	}
	
//	静态方法中不能使用this
	
//	private static void show1() {
//		System.out.println(this.name + "\t" + this.color);
//	}
	
	public static void main(String[] args) {

		Cat c1 = new Cat();
		
		c1.name = "大憨";
		c1.color = "灰色";
		c1.show();
		
		Cat c2 = new Cat();
		
		c2.name = "大橘";
		c2.color = "橘色";
		c2.show();
		
	}

}
