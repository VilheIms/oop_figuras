package uzdevums5;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis(Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	
	public String izvaditAplaInfo() {
		return "Rādiuss: "+radiuss;
	}
	
	//izveidot metodi riņka līnijas aprēķināšanai
	public double izvaditRinkaLiniju() {
		double C = 2*Math.PI*radiuss;
		return Math.round(C*100.0)/100.0;
	}
	//riņķa laukuma apŗēķināšanai
	public double izvaditRinkaLaukumu() {
		double s = Math.PI*Math.pow(radiuss, 2);
		return Math.round(s*100.0)/100.0;
	}
}
