import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class baueKoernerHaufen extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    bauHaufen(2);
    bauHaufen(5);
    bauHaufen(3);
    bauHaufen(6);
    bauHaufen(4);
}
void bauHaufen(int koerner){
	for(int i = 0; i < koerner; i++){
		gib();
	}
	vor();
}}