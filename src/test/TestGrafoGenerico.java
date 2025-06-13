package test;

import modelo.*;

public class TestGrafoGenerico {
    public static void main(String[] args) {
        Grafo<Persona> grafo = new Grafo<>();

        Persona ana = new Persona("Ana");
        Persona bruno = new Persona("Bruno");
        Persona carla = new Persona("Carla");
        Persona daniel = new Persona("Daniel");
        Persona emilia = new Persona("Emilia");
        Persona francisco = new Persona("Francisco");
        Persona gabriela = new Persona("Gabriela");

        grafo.agregarNodo(ana);
        grafo.agregarNodo(bruno);
        grafo.agregarNodo(carla);
        grafo.agregarNodo(daniel);
        grafo.agregarNodo(emilia);
        grafo.agregarNodo(francisco);
        grafo.agregarNodo(gabriela);

        grafo.agregarArista(ana, bruno);
        grafo.agregarArista(bruno, carla);
        grafo.agregarArista(carla, daniel);
        grafo.agregarArista(daniel, ana);
        grafo.agregarArista(ana, emilia);
        grafo.agregarArista(emilia, francisco);
        grafo.agregarArista(francisco, gabriela);

        grafo.mostrarMatrizAdyacencia();
        grafo.mostrarListaAdyacencia();
        grafo.bfs(ana);
        grafo.dfs(ana);
    }
}