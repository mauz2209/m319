import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class koernerHaufenMerken extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    zaehleHaufen();
    bringZurück();
}

int anzahlFelder = laenge();
int[] haufen = new int[anzahlFelder];

int zaehle(){
	int anzahl = 0;
	while(kornDa()){
		nimm();
		anzahl++;
	}
	return anzahl;
}

void walk(int max){
	for (int i = 0; i < max; i++){
   		if(vornFrei()){
   			vor();
   		}
   	}
}

void kehrt(){
	linksUm();
	linksUm();
}
void geben(int koerner){
	for (int i = 0; i < koerner; i++){
		gib();
	} 
} 

int laenge(){
	int anzahl = 1;
	while(vornFrei()){
		anzahl++;
		walk(1);
	}
	kehrt();
	walk(anzahl);
	kehrt();
	return anzahl;
}

void zaehleHaufen(){
	for(int i = 0; i < anzahlFelder; i++){
		haufen[i] = zaehle();
		walk(1);
	}
	kehrt();
	walk(anzahlFelder);
	kehrt();
}	

void bringZurück(){
	for(int i = 0; i < anzahlFelder; i++){
		if (haufen[i] == 0){
			walk(1);
		}
		else{
			geben(haufen[i]);
			walk(1);
		}
	}
}
}