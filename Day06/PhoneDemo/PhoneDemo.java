/*
��Java�ļ�����������Phone.class��PhoneDemo.class.
*/
class PhoneDemo{
	public static void main(String[] args){
		Phone phone = new Phone();
		
		phone.brand = "����";
		phone.price = 1900;
		phone.color = "��ɫ";
		
		System.out.println(phone.brand+phone.price+phone.color);
		
		phone.call("��Ů");
		phone.sendMessage();
		phone.playName();
	}
}

class Phone{
	String brand;
	int price;
	String color;
	
	/*
	�������ͱ�����������ͬ
	*/
	
	public void call(String name){
		System.out.println("��绰��"+name);
	}
	
	public void sendMessage(){
		System.out.println("Ⱥ������");
	}
	
	public void playName(){
		System.out.println("����Ϸ");
	}
}