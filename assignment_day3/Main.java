public class Main
{
    
    public float calPercentage(int sub1, int sub2, int sub3, int sub4, int sub5){
        
        int total = sub1+sub2+sub3+sub4+sub5;
        int totalMarksOfSubjects = 100+100+100+100+100;
        
        System.out.println("Student total marks "+total+" Out of "+totalMarksOfSubjects);
        
        float percentage = (total*100)/totalMarksOfSubjects;
        return percentage;
    }
    
	public static void main(String[] args) {
		Main mn = new Main();
		float percent = mn.calPercentage(40, 98, 94, 70, 80);
		System.out.println("percentage == "+percent);
		
		if(percent < 35){
		    System.out.println("Student Failed... ");
		} else if(percent >=35 && percent < 60){
		    System.out.println("Student Passed with second class... ");
		} else if(percent >=60 && percent < 75){
		    System.out.println("Student Passed with first class... ");
		} else {
		    System.out.println("Student Passed with Distinction... ");
		}
		
	}
}