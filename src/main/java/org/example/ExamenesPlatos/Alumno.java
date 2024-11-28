package org.example.ExamenesPlatos;

import java.util.ArrayList;

public class Alumno {

    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas = new ArrayList<Nota>();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public double promedioNotas() {
        double total = 0;

        for (Nota nota : notas) {

            total += nota.getNotaExamen();
        }

        return total/this.notas.size();

    }

}
