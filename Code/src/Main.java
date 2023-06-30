public class Main {
	public static void main(String[] args){

			Hospital hs = new Hospital();
			
			hs.add("Ali", 1);
			hs.add("Bilal", 2);
			hs.add("Chand", 3);
			hs.add("Danish", 4);
			hs.add("Fahad", 1);
			hs.add("Gohar", 2);
			hs.add("Hamaad", 5);
			hs.add("Ilyas", 2);
			
			hs.add("Aliyaan", 5);
			hs.add("Bazid", 2);
			hs.add("Daniyal", 4);
			hs.add("Ehsaan", 3);
			hs.add("Faiz", 1);
			hs.add("Gulzar", 2);
			hs.add("Hanzla", 3);
			hs.add("Ishraaq", 2);
			while(!hs.isEmpty()){
				hs.meetUpWithDoctor();
			}
	}

}
