public class Question2
{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		for(int i=0; i<arr.length; i++){
		    int num = arr[i];
		    if(!(num%2 == 0)){
		        System.out.println("Array ashish" +i+ " "+arr[i]);
		    }
		}
	}
}