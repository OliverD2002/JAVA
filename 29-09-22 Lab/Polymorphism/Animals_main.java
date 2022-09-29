package labday;

public class Animals_main {
	public static void main(String[] args) {
		Animals a1 = new Cheetah();
		a1.Speech();
		a1.Habitat();
		a1.Food();
		if(a1 instanceof Cheetah) {
			((Cheetah)a1).Speed();
		}
		
		a1 = new Blue_Whale();
		a1.Speech();
		a1.Habitat();
		a1.Food();
		if(a1 instanceof Blue_Whale) {
			((Blue_Whale)a1).Size();
		}
	}
}
