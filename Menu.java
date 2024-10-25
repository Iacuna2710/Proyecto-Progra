package org.example;

import javax.swing.*;

public class Menu {

    private static Equipo team1;
    private static Equipo team2;
    private static Equipo team3;


    public String mostrarEquipos() {

    }

    public static void agregarEquipo() {
        if (Equipo.cantidadEquipos == 3) {
            JOptionPane.showMessageDialog(null, "Este sistema solo puede gestionar 3 equipos");
            return;
        }
        String nameTeam = JOptionPane.showInputDialog(
                "Ingrese el nombre del equipo #" + (Equipo.cantidadEquipos + 1));
        switch (Equipo.cantidadEquipos) {
            case 0:
                team1 = new Equipo(nameTeam);
                break;
            case 1:
                team2 = new Equipo(nameTeam);
                break;
            case 2:
                team3 = new Equipo(nameTeam);
                break;
        }
        JOptionPane.showMessageDialog(null, "El nombre del Equipo #" + Equipo.cantidadEquipos + " agregados con exito, Nombre: " + nameTeam);
    }
}
