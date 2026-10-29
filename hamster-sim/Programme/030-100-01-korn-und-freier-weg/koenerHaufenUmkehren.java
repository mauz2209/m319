import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class koenerHaufenUmkehren extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	go();
}

boolean finish = false;

boolean kornVorn(){
	boolean da = false;
	walk(1);
	if(kornDa()){
		da = true;
	}
	kehrt();
	walk(1); 
	kehrt();
	return da;
}

boolean gut(){
	boolean gut = false;
	rechtsUm();
	if(vornFrei() && kornVorn()){
		gut = true;
	}
	linksUm();
	
	return gut;
}

void nächsteLinie(){
	rechtsUm();
	walk(2);
	linksUm();
	walkUntilWall();
	if (zaehle() == 2){
		finish = true;
		return;
	}
	kehrt();
	walkUntilWall();
	kehrt();
}

void go(){
	while (finish == false){
		if(gut()){
			nächsteLinie();
			continue;
		}
		walk(1);
	}
}

void walk(int max){
	for (int i = 0; i < max; i++){
   		if(vornFrei()){
   			vor();
   		}
   	}
}
   	
void walkUntilWall(){
	while(vornFrei()){
		vor();
	}
}
void kehrt(){
	linksUm();
	linksUm();
}

void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();
}

int zaehle(){
	int anzahl = 0;
	while(kornDa()){
		nimm();
		anzahl++;
	}
	return anzahl;
}}