package Demo4;
public class Demo4_1 {
	public static void main(String args[])
	{
		Student stu=new Student();
		stu.setName("name");
		stu.age=20;
		stu.specialty="神谕";
		stu.show(stu);
	}
}
class Student {
	private String name;
	public int age;
	public String specialty;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public  void show(Student stu)
	{
		System.out.println("姓名："+stu.name);
		System.out.println("年龄："+stu.age);
		System.out.println("专业："+stu.specialty);
	}
}
