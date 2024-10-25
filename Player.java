package org.example;
public class Player {
    private static int nextId = 0;
    private int id;
    private String fullName;
    private Posicion posicion;
    private Estado equipo;
    private Estado Estado;
    private int GolesAnotados;
    private int TotalAcciones;




    public Player(String fullName, Posicion posicion) {
        this.id = nextId++;
        this.fullName = fullName;
        this.posicion = posicion;
        this.equipo = equipo;
        this.Estado = Estado ;
        this.GolesAnotados = 0;
        this.TotalAcciones = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public org.example.Estado getEquipo() {
        return equipo;
    }

    public Estado getEstado() {
        return Estado;
    }

    public int getGolesAnotados() {
        return GolesAnotados;
    }
    public int getTotalAcciones() {
        return TotalAcciones;
    }


}

