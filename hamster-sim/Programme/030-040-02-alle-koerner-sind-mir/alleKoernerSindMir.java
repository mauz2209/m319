import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class alleKoernerSindMir extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	checkRows(10, 10);
}
void rechtsUm(){
	linksUm();
   	linksUm();
    linksUm();
}
    
void walk(int max){
	for (int i = 0; i < max; i++){
   		if(vornFrei()){
   			vor();
   		}
   	}
}
void nimmAlle(){
	while(kornDa()){
		nimm();
	}
}

void nextRow(){
	rechtsUm();
	walk(1);
	rechtsUm();
	walk(10);
	kehrt();
}

void kehrt(){
	linksUm();
	linksUm();
}

void checkRows(int höhe, int breite){
	for (int i = 0; i < höhe; i++){
		for (int a = 1; a < breite; a++){
			nimmAlle();
			walk(1);
		}
		nimmAlle();
		nextRow();
	}
}}