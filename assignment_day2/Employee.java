public class Employee
{
    String name = "Ashish";
    int age = 10;
    String city = "Mumbai";
    
    public void display(){
        System.out.println("Employee name is "+name);
        System.out.println("Employee age is "+age);
        System.out.println("Employee city is "+city);
    }
    
    
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
	}
}