package Revision.DesignATicTacToe.Models;

public class Symbol {
    Character character;
    public Symbol(){

    }
    public Symbol(Character character){
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
