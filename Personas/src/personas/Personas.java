/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import Clases.clspersonas;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author agos1
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        clspersonas persona1 = new clspersonas();
        persona1.setNombre("Carlos Bentou");
        persona1.setBorn_year(1970);
        persona1.setEmpleado(true);
        persona1.setEstadocivil(true);//si es true esta casado
        persona1.setID("10914");
        persona1.setNumeroHijos(2);
        persona1.setProfesion("ingeniero civil");
        persona1.setPaisNacimiento("brasil");
        
        clspersonas persona2 = new clspersonas("Juan Garcia", 1978, "entrenador", false, 0, true, "989775", "Colombia");
        clspersonas persona3 = new clspersonas("Manuela Sanchez", 1998, "estudiante", false, 1, false, "1025134", "peru");
        
        
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        
        
        int edadpersona1 = year - persona1.getBorn_year();
        int edadpersona2 = year - persona2.getBorn_year();
        int edadpersona3 = year - persona3.getBorn_year();
        
        
        if (edadpersona1 > 40){
            System.out.println(persona1.getNombre()+" esta autorizada para vacunarse contra el COVID"+ " su edad actual es "+ edadpersona1+ " años");
        }
        else {
            if (edadpersona1 < 40)
            System.out.println(persona1.getNombre()+ " no esta autorizada para vacunarse contra el COVID"+ " su edad actual es "+ edadpersona1+ " años");
        }

        if (edadpersona2 > 40){
            System.out.println(persona2.getNombre()+" esta autorizada para vacunarse contra el COVID"+ " su edad actual es "+ edadpersona2+ " años");
        }
        else {
            if (edadpersona2 < 40)
            System.out.println(persona2.getNombre()+ " no esta autorizada para vacunarse contra el COVID"+ " su edad actual es "+ edadpersona2+ " años");
        }
        
        if (edadpersona3 > 40){
            System.out.println(persona3.getNombre()+" esta autorizada para vacunarse contra el COVID"+ " su edad actual es "+ edadpersona3+ " años");
        }
        else {
            if (edadpersona3 < 40)
            System.out.println(persona3.getNombre()+ " no esta autorizada para vacunarse contra el COVID"+ " su edad actual es "+ edadpersona3+ " años");
        }
        
        persona1.caminar();
        persona2.ejercitarse();
        persona3.trabajar();
        persona1.comer();
        persona2.asearse();
        persona3.viajar();
        
        
    }
    
}
