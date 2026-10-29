import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class hamsterObjekte implements de.hamster.model.HamsterProgram {public void main() {
    Hamster otto1 = new Hamster();
    otto1.init(1, 1, 1, 0);
    Hamster otto2 = new Hamster();
    otto2.init(2, 1, 1, 0);
    Hamster otto3 = new Hamster();
    otto3.init(3, 1, 1, 0);
    Hamster otto4 = new Hamster();
    otto4.init(4, 1, 1, 0);
    Hamster otto5 = new Hamster();
    otto5.init(5, 1, 1, 0);
    Hamster otto6 = new Hamster();
    otto6.init(6, 1, 1, 0);
    Hamster otto7 = new Hamster();
    otto7.init(7, 1, 1, 0);
}

}