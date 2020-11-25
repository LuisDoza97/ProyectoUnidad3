/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class ListaDoblementeEnlazada {
    
    private NodoListaDoble inicio,fin;
    public ListaDoblementeEnlazada(){
        inicio=fin=null; 
    }
    // Metodo para saber si la lista esta Vacia
    public boolean estaVacia(){
        return inicio==null;
    }
    // Metodo para agregar nodos al principio
    public void agregarAlPrincipio (){
        int dato;
        int res=0;
        
         
        if(estaVacia()){
             dato=Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Ingresa el dato del Nodo", 
                    JOptionPane.INFORMATION_MESSAGE)); 
            inicio=fin=new NodoListaDoble(dato); // Mando a Crear el primer nodo de la lista Caso de que se encuentre Vacia la Lista, y apunto los dos nodos de cabera inico y fin en el mismo nodo
             }else{ // En caso de que se agregue el primer nodo a la listas
           while(res==1){
            dato=Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Ingresa el dato del Nodo", 
                    JOptionPane.INFORMATION_MESSAGE));    
            inicio= new NodoListaDoble (dato, inicio, null); // se crea otro nodo en la lista 
            inicio.siguiente.anterior=inicio;
            res=Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "¿Desea Agregar más nodos a la lista? 1.Si 2.No ", " Agregando un Nodo más al Inicio", 
                    JOptionPane.INFORMATION_MESSAGE));
            
        } // // Fin del ciclo whileFin del Ciclo while 
    
         }
    }
     // Metodo para agregar nodos al principio
    
    
}
