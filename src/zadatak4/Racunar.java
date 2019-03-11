package zadatak4;

public class Racunar {
	
	protected int kolicinaRAM;
	protected int kapacitetHD;
	protected int brzinaProcesora;
	protected double dijagonalaMonitora;
	protected double nabavnaCijena;
	
	public Racunar(int kolicinaRAM, int kapacitetHD, int brzinaProcesora, double dijagonalaMonitora, double nabavnaCijena) {
		this.brzinaProcesora=brzinaProcesora;
		this.dijagonalaMonitora=dijagonalaMonitora;
		this.kapacitetHD=kapacitetHD;
		this.kolicinaRAM=kolicinaRAM;
		this.nabavnaCijena=nabavnaCijena;
	}
	
	public double izracunajCijenu() {
		return (nabavnaCijena/100)*110;
	}

	@Override
	public String toString() {
		return "Racunar [kolicinaRAM=" + kolicinaRAM + "GB, kapacitetHD=" + kapacitetHD + "GB, brzinaProcesora="
				+ brzinaProcesora + "GHz, dijagonalaMonitora=" + dijagonalaMonitora + "inch, nabavnaCijena=" + nabavnaCijena
				+ "$, Cijena=" + izracunajCijenu() + "$ ]";
	}
	

}
