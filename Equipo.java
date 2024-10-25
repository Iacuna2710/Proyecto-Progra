package org.example;

public class Equipo {
    private int IdEquipo;
    private String nameTeam;
    private Player[] players;
    private int numPlayers;
    public static int cantidadEquipos = 0;

    public Equipo(String nameTeam) {
//        this.NumeroEquipo = NumeroEquipo;
        this.nameTeam = "Equipo " + IdEquipo;
        this.players = new Player[7];
        this.numPlayers = 0;
    }

    public Equipo() {
        this.players = new Player[7];
        this.numPlayers = 0;
    }

    public void agregarPlayer(Player player) {
        if (numPlayers <= 7) {
            this.players[numPlayers++] = player;
        }
    }


    public Player[] getPlayers() {
        return players;
    }
}