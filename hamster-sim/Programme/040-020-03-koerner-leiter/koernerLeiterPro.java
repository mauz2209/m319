import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class koernerLeiterPro implements de.hamster.model.HamsterProgram {public void main() {
    Hamster otto1 = new Hamster(1, 13, 1, 0, Hamster.RED);
    Hamster otto2 = new Hamster(4, 10, 1, 0, Hamster.GREEN);
    Hamster otto3 = new Hamster(7, 7, 1, 0, Hamster.GREEN);
    Hamster otto4 = new Hamster(10, 4, 1, 0, Hamster.GREEN);
    Hamster otto5 = new Hamster(12, 2, 1, 0, Hamster.GREEN);
}

}