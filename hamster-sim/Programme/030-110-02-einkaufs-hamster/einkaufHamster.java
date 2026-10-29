import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class einkaufHamster extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    takeAllCorns();
}

void takeAllCorns(){
	kehrt();
	while(vornFrei()){
		walkBlindToKorn();
	}
}

void walkBlindToKorn(){
	if(direction('W') == 'W'){
		walk(1);
		return;
	}
	if(direction('N') == 'N'){
		rechtsUm();
		walk(1);
		return;
	}
	if(direction('S') == 'S'){
		linksUm();
		walk(1);
		return;
	}
	if(direction('N') == 'N'){
	
	}
}

char direction(char directions){
	char direction = 'N';	
	switch(directions){
		case 'W':
			walk(1);
			if(kornDa()){
				direction = directions;
			}
			back(1);
			break;
		
		case 'N':
			rechtsUm();
			walk(1);
			if(kornDa()){
				direction = directions;
			}
			back(1);
			linksUm();
			break;
		
		case 'S':
			linksUm();
			walk(1);
			if(kornDa()){
				direction = directions;
			}
			back(1);
			rechtsUm();
			break;
			
	}	
	return direction;
}

int fieldsAtHome(){
	int fields = 0;
	for(int i = 0; i < 4; i++){
		fields += distance();
		rechtsUm();
	}
	return fields;
}

void kehrt(){
	linksUm();
	linksUm();
}

void walk(int distance){
	for(int i = 0; i < distance; i++){
		if(vornFrei()){
			vor();
		}
	}
	kehrt();
}

void back(int distance){
	kehrt();
	for(int i = 0; i < distance; i++){
		if(vornFrei()){
			vor();
		}
	}
}

void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();
}
int distance(){
	int distance = 0;
	while(vornFrei()){
		vor();
		distance++;
	}
	return distance;
}}