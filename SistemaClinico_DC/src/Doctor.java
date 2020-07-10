
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Doctor extends Persona {
    protected int regDoctor;
    protected String especialidad;
    protected AreaMedica area;
    protected Secretaria secretaria;
    protected ArrayList<Cita> citasPendientes;
    
    public void recetar(){}
    public void agregarPlanNut(){}
    public void imprimirReceta(){}
    public void registrarSecretaria(Secretaria s){
    secretaria = s;
    }
}
