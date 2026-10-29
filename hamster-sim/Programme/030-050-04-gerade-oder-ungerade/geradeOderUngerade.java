import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class geradeOderUngerade extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    walkInDirection();
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

void kehrt(){
	linksUm();
	linksUm();
}

void gibAlle(){
	while (maulLeer() != true){
		gib();
	}
} 

boolean checkIfEven(){
	boolean even = false;
	int count = 0;
	while (kornDa()){
		nimm();
		count++;
	}
	if (count % 2 == 0){
		even = true;
	}
	return even;
}	

void walkInDirection(){
	if (checkIfEven()){
		kehrt();
		while(vornFrei()){
			walk(1);
		}
		gibAlle();
	}
	else{
		while(vornFrei()){
			walk(1);
		}
		gibAlle();
	}
}		}