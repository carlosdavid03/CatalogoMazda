package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Fuller 101
 */
public class PatronBright {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FormularioMatriculacion FM = new FormularioMatriculacionEspaña(new FormHtmlImpl());
        FM.controlarZona();
        
        FormularioMatriculacion FM1 = new FormularioMatriculacionEspaña(new FormAppleImpl());
        FM1.controlarZona();
        
        FormularioMatriculacion FM2 = new formularioMatriculacionPrtugal(new FormHtmlImpl());
        FM2.controlarZona();
        
        FormularioMatriculacion FM3 = new formularioMatriculacionPrtugal(new FormAppleImpl());
        FM3.controlarZona();
        
    }
    
}
