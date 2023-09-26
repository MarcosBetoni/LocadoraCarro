/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Interface.MenuPrincipal;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
            
            MenuPrincipal tela = new MenuPrincipal();

            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setSize(1177,807);
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
            tela.setLocation(0, 0);
            
           
    }
}
