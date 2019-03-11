package zadatak4;

public class Laptop extends Racunar{
	
	private double trajanjeBaterije;
	
	public Laptop(int kolicinaRAM, int kapacitetHD, int brzinaProcesora, double dijagonalaMonitora, double trajanjeBaterije, double nabavnaCijena) {
		super(kolicinaRAM, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);
		this.trajanjeBaterije=trajanjeBaterije;
	}

	@Override
	public double izracunajCijenu() {
		return (nabavnaCijena/100)*115;
	}

	@Override
	public String toString() {
		return "Laptop [kolicinaRAM=" + kolicinaRAM + "GB, kapacitetHD=" + kapacitetHD + "GB, brzinaProcesora="
				+ brzinaProcesora + "GHz, dijagonalaMonitora=" + dijagonalaMonitora + "inch, trajanjeBaterije=" + trajanjeBaterije + "h, nabavnaCijena=" + nabavnaCijena
				+ "$, Cijena=" + izracunajCijenu() + "$ ]";
	}
	

}
