import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class stufenHamster extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	climb(length());
}
int length(){
	int length = 0;
	while(vornFrei()){
		if(kornDa()){
			length += count();
		}
		vor();
	}
	return length;
}

void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();
}

int count(){
	int count = 0;
	while(kornDa()){
		nimm();
		count++;
	}
	return count;
}

void climb(int steps){
	int maxLength = 6;
	if(steps <= maxLength){
		for(int i = 0; i < steps; i++){
			linksUm();
			vor();
			rechtsUm();
			vor();
		}
	}
}}