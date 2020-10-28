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
public class AFD {
    
    private Estado EdoInicial;
    private char[] Alfabeto;
    ArrayList<Estado> Estados;
    
    
    
    int número = 123;
    String Prueba = "Puto el que lo lea";
    String Prueba2 = "Yamete Kudasaii";
    String Prueba3="senko y joel se besaban atras de la cafe";
    String Prueba4="EL aciini solo va al gym para ver vatos encuerados. >:v";
    
    AFD(){}
    AFD(Estado inicial, char[] alfabeto){
        this.EdoInicial = inicial;
        this.Alfabeto = alfabeto;
    }

    public Estado getEdoInicial() {
        return EdoInicial;
    }

    public void setEdoInicial(Estado EdoInicial) {
        this.EdoInicial = EdoInicial;
    }

    public char[] getAlfabeto() {
        return Alfabeto;
    }

    public void setAlfabeto(char[] Alfabeto) {
        this.Alfabeto = Alfabeto;
    }

    public ArrayList<Estado> getEstados() {
        return Estados;
    }

    public void setEstados(ArrayList<Estado> Estados) {
        this.Estados = Estados;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public String getPrueba() {
        return Prueba;
    }

    public void setPrueba(String Prueba) {
        this.Prueba = Prueba;
    }

    public String getPrueba2() {
        return Prueba2;
    }

    public void setPrueba2(String Prueba2) {
        this.Prueba2 = Prueba2;
    }

    public String getPrueba3() {
        return Prueba3;
    }

    public void setPrueba3(String Prueba3) {
        this.Prueba3 = Prueba3;
    }

    public String getPrueba4() {
        return Prueba4;
    }

    public void setPrueba4(String Prueba4) {
        this.Prueba4 = Prueba4;
    }
    
}
