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
    
    //OPERACIONES   
    ArrayList<Estado> cerraduraEpsilon(Estado e){        
        Stack<Estado> s = new Stack();
        ArrayList<Estado>  R= new ArrayList<Estado>();
        Estado p;
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
            if(t.getSimbolo()== c){
                R.addAll(t.getEdosDestino());   //Repeticiones de mismos estados
            }
        }    
        return R;
    }
    
    ArrayList<Estado> mover( ArrayList<Estado> E, char c){
        ArrayList<Estado> R = new ArrayList<Estado>();
        for(Estado e:E){
            R.addAll(mover(e, c));//Podrian existir repeticiones de mismos estados
        }    
        return R;
    }    
    
    ArrayList<Estado> irA(ArrayList<Estado> E, char c){
         ArrayList<Estado> R = new ArrayList<Estado>();         
         R = cerraduraEpsilon(mover(E,c));
         return R;        
    }
    
    //Metodos
    ArrayList<Subconjunto> construirSubconjuntos(){
        ArrayList<Subconjunto> R = new ArrayList<Subconjunto>();
        Subconjunto S = new Subconjunto();
        
        S.setEstados(cerraduraEpsilon(EdoInicial));
        S.setId(0);
        S.setMarca(false);
        
        R.add(S);
//        Boolean completado = false;
//        while(!completado){
            for(Subconjunto Sn: R){                
                if(Sn.getMarca() == false){
                    for(char c: Alfabeto){
                        S.setEstados(irA(Sn.getEstados(), c));
                        
                        if(!R.contains(S.getEstados())){
                            S.setId(S.getId()+1);//Incrementa el ID
                            S.setMarca(false);
                            R.add(S);
                        }
                    }
                    Sn.setMarca(true);//Se marca que ya se analizo.
                }            
            }            
//            completado = revisa si hay algun R con marca false
//        }        
        return R;        
    }
    
    AFD convertirAFN(){
        ArrayList<Subconjunto> R = construirSubconjuntos();
        Estado E = EdoInicial;
        
//        E.setIdentificador(R[0].getId());
//        E.setEdoInicial(true);
//        
//        AFD afd = new AFD(E, Alfabeto);
//        
//        for(Subconjunto Si: R){
//            E = new Estado();
//            E.
//        }
        
        
        
        
        
        
        
        return afd;
    }
    
    Boolean analizarCadena(String s){
        ArrayList<Estado> E = new ArrayList<Estado>();  
        E = cerraduraEpsilon(EdoInicial);
        
        //FALTA
        
        return true;
    }
    
    
    
}


