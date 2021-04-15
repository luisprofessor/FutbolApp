/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolapp;

import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Luis
 */
public class Equipo {
    private TreeMap<Jugador,String> miembros=new TreeMap<>();
    
    //Recibe un juegador y la posición en la que juega
    //Los jugadores deben quedar ordenados por dni de menor a mayor.
    public void agregarJugador(Jugador jugador,String posición){
    
    }
    
    //Visualizar por consola los datos de todos los jugadores y posiciones
    //en las que juegan.
    public void mostrarDatos(){
    
    }
    
    //Dada una posicion, obtener todos los jugadores que juegan en esa posicion
    public Set<Jugador> obtenerJugadoresPorPosicion(String posicion){
    
    return null;
    }
    
    //Borrar de la lista el jugador que tenga el dni recibido
    public void borraJugador(long dni){
    
        
    }
    
    //obtener los datos de los jugadores y sus posiciones que
    //sean mayores a la edad pasada por parámetro.
    public TreeMap<Jugador,String> mayoresDe(int edad){
    
        return null;
    }
    
}
