package org.example;

import javax.swing.*;
import java.util.Random;



public class Proyecto {
    private static final String[] FirstName = {"Carlos", "Kevin", "Luis", "John", "Vinicius", "Lionel", "Wilson", "Juan", "Saul", "Daniel"};
    private static final String[] LastName = {"Smith", "Moreno", "James", "Messi", "Da Silva", "Arguedas", "Quesada", "Rodriguez", "Layun"};

    public static void main(String[] args) {
        Player[] allPlayers = new Player[30];
        Equipo[] teams = new Equipo[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            teams[i] = new Equipo();
        }

        for (int i = 0; i < 21; i++) {
            Player player = new Player("Player " + i, Posicion.values()[i % 4]);
            allPlayers[i] = player;
            teams[i % 3].agregarPlayer(player);
        }

        for (int i = 21; i < 30; i++) {
            String fullName = FirstName[random.nextInt(FirstName.length)] + " " + LastName[random.nextInt(LastName.length)];
            Player player = new Player(fullName, Posicion.values()[i % 4]);
            allPlayers[i] = player;
        }

        for (int i = 0; i < allPlayers.length; i++) {
            Player player = allPlayers[i];
            if (player != null) {
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------" +
                        "\n-------------------------------------------------------------------------------------------------------------------------------------------" +
                        "\nPlayer ID: " + player.getId() + ", Nombre Completo: " + player.getFullName() + ", Posicion: " + player.getPosicion() + ", Equipo: " + (player.getEquipo() != null ? player.getEquipo() : Estado.Libre) + ", Estado: " + player.getEstado() + ", Goles Anotados: " + player.getGolesAnotados() + ", Acciones Totales: " + player.getTotalAcciones() + ".");
            }
        }

        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "---- MENU DE GESTION DE 3 Equipos ---\n" +
                            "1- Gestion de Jugadores.\n" +
                            "2- Gestion de Equipos.\n" +
                            "3- Simulacion de partidos.\n" +
                            "4- Reportes.\n" +
                            "5- Salir del sistema.\n"
            ));

            switch (opt) {
                case 1:
                    // gestión de jugadores.
                    break;
                case 2:
                    int opt1;
                    do {
                        opt1 = Integer.parseInt(JOptionPane.showInputDialog(
                                "---- MENU DE GESTION DE EQUIPOS ---\n" +
                                        "1- Mostrar Equipos.\n" +
                                        "2- Agregar Equipos.\n" +
                                        "3- Agregar Jugador. \n" +
                                        "4- Eliminar Jugador.\n" +
                                        "5- Salir del sistema.\n"
                        ));
                        switch (opt1) {
                            case 1:
                                // Mostrar Equipos
                                break;
                            case 2:
                                // Agregar Equipo
                                break;
                            case 3:
                                // Agregar Jugador
                                break;
                            case 4:
                                // Eliminar Jugador
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opcion: " + opt1 + " no disponible.");
                        }

                    } while (opt1 != 5);
                    break;
                case 3:
                    // simulación de partidos.
                    break;
                case 4:
                    // generar reportes.
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion: " + opt + " no esta disponible.");
            }
        } while (opt != 5);
    }
}


