import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class groessterHaufen extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    checkForBiggest();
}
int checkForBiggest(){
	int posGrösste = 0;
	int pos = 0;
	while (vornFrei()){
		vor();
		pos++;
		if(kornDa()){
			int anzahl = zaehle();
			int grössere = compare(anzahl, posGrösste);
			if (grössere == anzahl){
				posGrösste = grössere;
			}
			continue;
		}
	}
	return posGrösste;
}

int zaehle(){
	int anzahl = 0;
	while(kornDa()){
		nimm();
		anzahl++;
	}
	gibAnzahl(anzahl);
	return anzahl;
}

int compare(int first, int second){
	if (first > second){
		return first;
	}
	return second;
}

void gibAnzahl(int anzahl){
	for (int i = 0; i < anzahl; i++){
		gib();
	}
}}