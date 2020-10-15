class Avenger {
	
	public void getDetails(String[] name, int[] age, int[] power, String[] weapon, String[] planet) {
    	for(int i=0; i<4; i++) {
    		String msg = "Avenger " +name[i]+ " has age " +age[i]+ ", has power " +power[i]+ ", has weapon " +weapon[i]+ " and resides in planet " +planet[i];
    		displayDetails(msg);
    	}
    }
    
    public void displayDetails(String msg) {
    	System.out.println(msg);
    }

    public static void main(String[] args) {
    	Avenger avg = new Avenger();
        String[] name = {"Thor", "CA", "SpiderMan", "Hulk"}; 
        int[] age = {200, 300, 400, 500};
        int[] power = {2000, 3000, 4000, 5000};
        String[] weapon = {"weapon1", "weapon2", "weapon3", "weapon4"};
        String[] planet = {"planet1", "planet2", "planet3", "planet4"};
        
        avg.getDetails(name, age, power, weapon, planet);
    }
}