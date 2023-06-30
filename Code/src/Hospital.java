public class Hospital{
	
	LinkedQueue<String> HeartEmg = new LinkedQueue<String>();
	LinkedQueue<String> AccidentEmg = new LinkedQueue<String>();
	LinkedQueue<String> Heart = new LinkedQueue<String>();
	LinkedQueue<String> Accident = new LinkedQueue<String>();
	LinkedQueue<String> General = new LinkedQueue<String>();

	public void add(String name, int priority){
		if(priority == 1){
			HeartEmg.enqueue(name);
		}else{
			if(priority == 2){
				AccidentEmg.enqueue(name);
			}else{
				if(priority == 3){
					Heart.enqueue(name);
				}else{
					if(priority == 4){
						Accident.enqueue(name);
					}else{
					General.enqueue(name);
				}//if-else
				}//if-else
			}//if-else
		}//if-else
	}//add
	
	public void meetUpWithDoctor(){
			if(!HeartEmg.isEmpty()){
				System.out.println(HeartEmg.dequeue());
			}else{
				if(!AccidentEmg.isEmpty()){
					System.out.println(AccidentEmg.dequeue());
				}else{
					if(!Heart.isEmpty()){
					System.out.println(Heart.dequeue());
					}else{
						if(!Accident.isEmpty()){
							System.out.println(Accident.dequeue());
							}else{
					System.out.println(General.dequeue());
							}//if-else
					}//if-else
			}//if-else
		}//if-else

	}//meetUpWithDoctor
	
	public boolean isEmpty(){
		return (HeartEmg.isEmpty() && AccidentEmg.isEmpty() && Heart.isEmpty() && Accident.isEmpty() && General.isEmpty());
	}//is
}