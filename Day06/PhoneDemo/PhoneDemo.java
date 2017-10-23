/*
该Java文件编译后会生成Phone.class和PhoneDemo.class.
*/
class PhoneDemo{
	public static void main(String[] args){
		Phone phone = new Phone();
		
		phone.brand = "魅族";
		phone.price = 1900;
		phone.color = "黑色";
		
		System.out.println(phone.brand+phone.price+phone.color);
		
		phone.call("美女");
		phone.sendMessage();
		phone.playName();
	}
}

class Phone{
	String brand;
	int price;
	String color;
	
	/*
	方法名和变量名可以相同
	*/
	
	public void call(String name){
		System.out.println("打电话给"+name);
	}
	
	public void sendMessage(){
		System.out.println("群发短信");
	}
	
	public void playName(){
		System.out.println("玩游戏");
	}
}