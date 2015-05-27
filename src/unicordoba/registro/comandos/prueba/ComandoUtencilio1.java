/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicordoba.registro.comandos.prueba;

import unicordoba.registro.comandos.ICommand;
import unicordoba.registro.principal.Principal;
import unicordoba.registro.ventana.prueba.VentanaUtencilio1;

/**
 *
 * @author JesusDaniel
 */
public class ComandoUtencilio1 implements ICommand {
    @Override
    public void execute() {
        VentanaUtencilio1 op = new  VentanaUtencilio1();
        Principal.getSingleton().AddVentana(op);
    }
    
}
