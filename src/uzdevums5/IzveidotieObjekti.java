package uzdevums5;

import java.util.ArrayList;

public class IzveidotieObjekti {
	static String izvadit(ArrayList<Centrs> centruSaraksts) {
		String str = "";
		for (int i = 0; i <centruSaraksts.size(); i++) {
		str += str = i+". objekts "+centruSaraksts.get(i).izvaditKoordinatas()+"\n";
		}
		return str;
	}
	static String izvaditC(ArrayList<Cetrsturis> centruSaraksts) {
		String str = "";
		for (int i = 0; i <centruSaraksts.size(); i++) {
		str += str = i+". objekts "+centruSaraksts.get(i).izvaditCetrsturaInfo()+"\n"+centruSaraksts.get(i).punkts.izvaditKoordinatas();
		}
		return str;
	}
	static String izvaditA(ArrayList<Aplis> centruSaraksts) {
		String str = "";
		for (int i = 0; i <centruSaraksts.size(); i++) {
		str += str = i+". objekts "+centruSaraksts.get(i).izvaditAplaInfo()+"\n"+centruSaraksts.get(i).punkts.izvaditKoordinatas();;
		}
		return str;
	}
	static String izvaditT(ArrayList<Trijsturis> centruSaraksts) {
		String str = "";
		for (int i = 0; i <centruSaraksts.size(); i++) {
		str += str = i+". objekts "+centruSaraksts.get(i).izvaditTrijsturaInfo()+"\n"+centruSaraksts.get(i).punkts.izvaditKoordinatas();;
		}
		return str;
	}
}
