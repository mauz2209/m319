import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class kornSlalom extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
walk(1);
checkIfCorn();
checkIfCorn();
checkIfCorn();
checkIfCorn();

}
void rechtsUm(){
	linksUm();
   	linksUm();
    linksUm();
}
    
void walk(int max){
	for (int i = 0; i < max; i = i + 1){
   		vor();
    }
}

void linksUmgehen(){
	linksUm();
	walk(1);
	rechtsUm();
	walk(2);
	rechtsUm();
	walk(1);
	linksUm();
}

void rechtsUmgehen(){
	rechtsUm();
	walk(1);
	linksUm();
	walk(2);
	linksUm();
	walk(1);
	rechtsUm();
}    

void checkIfCorn(){
	if (kornDa()){
		linksUmgehen();
	}
	else{
		rechtsUmgehen();
	}
}}