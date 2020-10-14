import java.util.Calendar;
public class Employee
{
    public void display(String name, int dob, int mob, int yob, int salary){
        System.out.println("Employee Name is "+name);
        System.out.println("Employee DOB is "+dob+ "/" +mob+ "/" +yob);
        int age = (Calendar.getInstance().get(Calendar.YEAR))-yob;
        System.out.println("Employee Age is "+age);
        int annualSal = salary*12;
        System.out.println("Employee Monthly salary is "+salary);
        System.out.println("Employee Annual salary is "+annualSal);
        System.out.println("Employee Annual tax amount is "+calTAx(annualSal));
    }
    
    public float calTAx(int annualSal){
        if(annualSal >= 500000){
            return (annualSal/100)*20;
        }
        if(annualSal >= 400000 && annualSal < 500000){
            return (annualSal/100)*15;
        }
        if(annualSal >= 300000 && annualSal < 400000){
            return (annualSal/100)*10;
        }
        if(annualSal >= 200000 && annualSal < 300000){
            return (annualSal/100)*5;
        }
        return 0;
    }
    
	public static void main(String[] args) {
		Employee emp = new Employee();
		String empName = "Ashish";
        int dob = 13;
        int mob = 7;
        int yob = 1993;
        int empSal = 30000;
        emp.display(empName, dob, mob, yob, empSal);
	}
}