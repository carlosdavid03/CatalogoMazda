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
public class formularioMatriculacionPrtugal extends FormularioMatriculacion{

    public formularioMatriculacionPrtugal(Formularioimpl FOMA) {
        super(FOMA);
    }

    @Override
    public void visualizar() {
        System.out.println("");
    }

    @Override
    public void generarDocumento() {
        
    }

    @Override
    public void administrarZona() {
       
    }

    @Override
    protected void controlarZona() {
        System.out.println("Zona Portugal");
        FOMA.administrarZonaIndicada();
        FOMA.dibujartexto();
        
    }
    
}
