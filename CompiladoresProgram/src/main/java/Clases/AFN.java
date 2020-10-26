/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.Stack;

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
    
    //constantes'ϵ'ñ
    static final char epsilon='ϵ';
    
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
    
    
    ArrayList<Estado> cerraduraEpsilon(Estado e){
        Estado p;
        Stack<Estado> s = new Stack();
        ArrayList<Estado>  R= new ArrayList<Estado>();
        s.push(e);
        while( !s.empty() ){
            p= s.pop();
            R.add(p);
            for(Transicion trans: p.Transiciones){
                if( trans.getSimbolo() == epsilon  ){
                   if(! R.contains(p)  )
                       s.push(p);
                }
            }
        
        }
        
        
    
    
        return R;
    }
    
    
    ArrayList <Estado> cerraduraEpsilon(ArrayList<Estado> c){
        ArrayList<Estado > R = new ArrayList<Estado>();
        for(Estado e:c){
            R.addAll( cerraduraEpsilon(e) );
        }
        return R;
    }
    
    
    
    ArrayList<Estado> mover( Estado e, char c){
            ArrayList<Estado> R = new ArrayList<Estado>();
            for(Transicion t: e.Transiciones){
                if(t.getSimbolo()==c){
                    R.addAll(   t.getEdosDestino()    );   //revisar esta parte
                }
            }
    
        return R;
    }
                
    
}


