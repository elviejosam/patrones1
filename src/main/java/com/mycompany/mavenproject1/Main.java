/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author samue
 */
public class Main {

    public static void main(String[] args) {
        
        Metodos m = new Metodos();
        m.crearBody("<hola mundo>");
        m.escribir("HTML",m.crearPagina(m.crearBody(m.recibir("1"))));
        
    }
}