package cn.laoliu_08;

public class Student {
	private String name;
	private int chinese;
	private int math;
	private int english;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getNum(){
		return this.chinese+this.english+this.math;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", chinese=" + chinese + ", math="
				+ math + ", english=" + english + "]";
	}
	
}