/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author jose
 */
public class NodoListaDoble {
    public int dato;
    public NodoListaDoble siguiente; // Puntero de enlace al nodo del lado derecho
    public NodoListaDoble anterior; // Puntero de enlace al nodo del lado izquierdo
    
    // Constrictor para cuando no hay nodos 
    public NodoListaDoble(int d){
        this(d, null,null);
    }
    // Constructor para cuando ya hay nodos
    public NodoListaDoble (int d, NodoListaDoble s, NodoListaDoble a){
        dato=d;
        siguiente= s;
        anterior = a;
    }
    
    
}
