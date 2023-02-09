package tamilnadu.actors;

public class ActorSivakumar implements Actor {
	static String address = "Coimbatore";

	public static void main(String[] args) {
	ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
	Actor ac = new ActorSivakumar();
	as.act();
	as.dance();
	as.sing();
	as.speaking();
	System.out.println(address);
	ac.act();
	ac.dance();
	ac.sing();
	System.out.println(ac.address);

	}
	ActorSivakumar(int a,String str){
		
	}
	public ActorSivakumar() {
		
	}
	public void act() {
		System.out.println("acting is a good art");
	}
	public void dance() {
		System.out.println("i'm a good dancer");
	}
	public void sing() {
		System.out.println("i'm a bathroom singer");
	}
	void speaking() {
		System.out.println("i'm Speaking now");
	}

}
