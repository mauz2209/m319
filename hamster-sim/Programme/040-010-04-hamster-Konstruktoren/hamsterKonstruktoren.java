import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class hamsterKonstruktoren implements de.hamster.model.HamsterProgram {public void main() {
    Hamster otto1 = new Hamster();
    otto1.init(1, 1, 1, 0);
    Hamster fritz = new Hamster();
    fritz.init(2, 1, 1, 0);
    Hamster otto2 = new Hamster(fritz); 
    Hamster otto3 = new Hamster(3, 1, 1, 0);
    Hamster otto4 = new Hamster(4, 1, 1, 0, Hamster.BLUE);
}
}