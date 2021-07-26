/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author agos1
 */
public class clspersonas {
    private String nombre;
    private int born_year;
    private String profesion;
    private boolean empleado;
    private int NumeroHijos;
    private boolean estadocivil;
    private String ID;
    private String PaisNacimiento;
    private String genero;
    

    public clspersonas() {
    }

    public clspersonas(String nombre, int born_year, String profesion, boolean empleado, int NumeroHijos, boolean estadocivil, String ID, String PaisNacimiento) {
        this.nombre = nombre;
        this.born_year = born_year;
        this.profesion = profesion;
        this.empleado = empleado;
        this.NumeroHijos = NumeroHijos;
        this.estadocivil = estadocivil;
        this.ID = ID;
        this.PaisNacimiento = PaisNacimiento;
    }

    public void caminar(){
        System.out.println(this.nombre + " esta caminando");
    }
    
    public void comer(){
        System.out.println(this.nombre + " esta comiendo");
    }
    
    public void trabajar(){
        System.out.println(this.nombre + " esta trabajando");
    }
    
    public void viajar(){
        System.out.println(this.nombre + " esta viajando");
    }
    public void estudiar(){
        System.out.println(this.nombre + " esta estudiando");
    }
    
    public void asearse(){
        System.out.println(this.nombre + " esta bañandose");
    }
    
    public void ejercitarse(){
        System.out.println(this.nombre + " esta haciendo ejercicio");
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the empleado
     */
    public boolean isEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(boolean empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the NumeroHijos
     */
    public int getNumeroHijos() {
        return NumeroHijos;
    }

    /**
     * @param NumeroHijos the NumeroHijos to set
     */
    public void setNumeroHijos(int NumeroHijos) {
        this.NumeroHijos = NumeroHijos;
    }

    /**
     * @return the estadocivil
     */
    public boolean isEstadocivil() {
        return estadocivil;
    }

    /**
     * @param estadocivil the estadocivil to set
     */
    public void setEstadocivil(boolean estadocivil) {
        this.estadocivil = estadocivil;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the PaisNacimiento
     */
    public String getPaisNacimiento() {
        return PaisNacimiento;
    }

    /**
     * @param PaisNacimiento the PaisNacimiento to set
     */
    public void setPaisNacimiento(String PaisNacimiento) {
        this.PaisNacimiento = PaisNacimiento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
