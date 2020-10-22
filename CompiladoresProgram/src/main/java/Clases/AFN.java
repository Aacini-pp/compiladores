/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;

/**
 *
 * @author J.PEREZ
 */
public class AFN {
    
    //ATRIBUTOS
    private Estado EdoInicial;
    private char [] Alfabeto;
    private ArrayList<Estado> EdosAceptacion;     
    private ArrayList<Estado> EstadosAFN;
    private int IdAFN;
    
    
    //METODOS
    public AFN crearBasico(char c){
        AFN afn = new AFN();
        return afn;
    }
    
    public AFN unirAFN(AFN afn2){
        
        AFN afn = new AFN();
        return afn;
    }
    
    public AFN concatenarAFN(AFN afn2){
    
        AFN afn = new AFN();
        return afn;
    }
    
    public void cerrTrans(){
    }
    
    public void cerrKleen(){
    }
    
    public void opc(){
    }
    
    //OPERACIONES
    public void cerrEpsilon(){
    }
    
    
    
    
    
    
}
