import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class lokaleUndGlobaleVariabeln extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    zaehleHaufen();
    walk(anzahl);
    
}

/*es funktioniert nicht wegen sogenannten scopes"{}".
wenn eine Variabel in einem Scope definiert wird lebt sie nur dort.
Dass heisst wenn man anzahl im Scope von zaehleHaufen() definiert lebt sie nur dort.
Wenn man aber trotzdem auf die Variabel zugreifen will muss die Methode eine Methode
mit Rückgabewert sein.*/

int gesamtKoerner = 0;

void zaehleHaufen() {
    int anzahl = 0;

    while (kornDa()) {
        nimm();
        anzahl = anzahl + 1;
    }
}

void walk(int max){
	for (int i = 0; i < max; i++){
   		if(vornFrei()){
   			vor();
   		}
   	}
}
}