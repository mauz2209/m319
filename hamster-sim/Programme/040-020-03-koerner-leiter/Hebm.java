import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class Hebm extends Hamster {
   class Hebm extends Hamster { 
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

} 
}
