public class Match{

	private String state = "fine";

	public static void main(String [] args){
		//create an array of Match reference varibales
		Match [] m = new Match[60];

		int rand = (int) (Math.random()*60);

		for(int i = 0;i < m.length; i++){
			m[i] = new Match();
		}

		//lets burn some sticks
		while(rand > 0){
			m[rand].choosen();
			rand--;
		}

		//percentage of burnt sticks
		int count = 0;
		for(int i = 0; i < m.length; i++){
			if(m[i].state == "charred"){
				count++;
			}
			System.out.println(m[i].state);
		}

		double percentage = (count/60)*100;
		System.out.println(count);
	}

	void choosen(){
		state = "charred";
	}
}