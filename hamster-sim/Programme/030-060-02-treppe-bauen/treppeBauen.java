import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class treppeBauen extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    treppe();
}

void walk(int max){
	for (int i = 0; i < max; i++){
   		if(vornFrei()){
   			vor();
   		}
   	}
}

void geben(int koerner){
	for (int i = 0; i < koerner; i++){
		gib();
	} 
} 

void treppe(){
	geben(1);
	for (int i = 2; vornFrei(); i++){
		walk(1);
		geben(i);
	}
}}