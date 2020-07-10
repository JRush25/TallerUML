
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Cita implements Pago {
    protected LocalDateTime fecha;
    protected boolean pagada;
    protected String registradoPor;
    protected Doctor doctor;
    protected Paciente paciente;
    protected Secretaria maneja;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
