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
public abstract class FormularioMatriculacion {
   
    Formularioimpl FOMA;
    public FormularioMatriculacion(Formularioimpl FOMA) {
        this.FOMA = FOMA;
    }
    

    public abstract void visualizar();
    public abstract void generarDocumento();
    public abstract void administrarZona();
    protected abstract void controlarZona();
}
