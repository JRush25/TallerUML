/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Receta {
    protected LocalDateTime fecha;
    protected PlanNutricional planNut;
    protected ArrayList<Medicamento> medicamentos;
    
    public Receta(){
        medicamentos = new ArrayList();
        planNut = new PlanNutricional();
    }
}
