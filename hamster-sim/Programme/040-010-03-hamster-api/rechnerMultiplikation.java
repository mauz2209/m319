import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class rechnerMultiplikation implements de.hamster.model.HamsterProgram {public void main() {
    otto.init(1, 1, 1, 0);
    schreibAnzahl();
}
Hamster otto = new Hamster();

void schreibAnzahl(){
	otto.schreib(String.valueOf(zaehle()));
}

int zaehle(){
	int anzahl = 0;
	while(otto.kornDa()){
		otto.nimm();
		anzahl++;
	}
	return anzahl;
}}