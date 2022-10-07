package lab_06_10;

public class Mobile_main {
	public static void main(String[] args) {
		Mobile m = new Apple();
		m.ram_rom();
		m.battery();
		m.processor();
		if(m instanceof Apple) {
			((Apple)m).camera();
		}
		System.out.println();
		
		m = new Samsung();
		m.ram_rom();
		m.battery();
		m.processor();
		if(m instanceof Samsung) {
			((Samsung)m).Spen();
		}
		System.out.println();
		
		m = new Asus();
		m.ram_rom();
		m.battery();
		m.processor();
		if(m instanceof Asus) {
			((Asus)m).Gaming();
		}
		System.out.println();
		
		m.Face_Unlock();
	}
}
