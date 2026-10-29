import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class mulden extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
	checkDepths();
	dropDeepest();
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


int largest = 0;
int fieldLength = 1;

void checkDepth(){
	int length = 0;
	while(vornFrei()){
		walk(1);
		length++;
	}
	if (length > largest){
		largest = length;
	}
	kehrt();
	walk(length);
	rechtsUm();
	walk(1);
}

boolean isMulde(){
	boolean free;
	rechtsUm();
	if (vornFrei()){
		free = true;
	}
	else{
		free = false;
		linksUm();
	}
	return free;
}

void checkDepths(){
	while(vornFrei()){
		if(isMulde()){
			checkDepth();
		}
		else{
			walk(1);
		}
		fieldLength++;
	}
	kehrt();
}

void rightPlace(){
	int length = 0;
	while(vornFrei()){
		walk(1);
		length++;
	}
	if (length == largest){
		gib();
	}
	kehrt();
	walk(length);
	rechtsUm();
	walk(1);
}
void dropDeepest(){
	walk(fieldLength);
	kehrt();
	while(vornFrei()){
		if (isMulde()){
			rightPlace();
		}
		else{
			walk(1);
		}
	}
}}