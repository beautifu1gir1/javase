
public class Cat {

//	è������
	private String name;
	
//	è����ɫ
	private String color;
	
	private  void show() {
//		this��ʾ��ǰ����
		System.out.println(this.name + "\t" + this.color);
	}
	
//	��̬�����в���ʹ��this
	
//	private static void show1() {
//		System.out.println(this.name + "\t" + this.color);
//	}
	
	public static void main(String[] args) {

		Cat c1 = new Cat();
		
		c1.name = "��";
		c1.color = "��ɫ";
		c1.show();
		
		Cat c2 = new Cat();
		
		c2.name = "����";
		c2.color = "��ɫ";
		c2.show();
		
	}

}