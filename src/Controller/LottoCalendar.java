/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jlopez
 */
public class LottoCalendar {
    
    private Date fechaInicioSorteo;
    private long fechaActual;
    private final long horaSorteoMilis = 68100000;

    public LottoCalendar(Date fechaInicioSorteo, long fechaActual) {
        this.fechaInicioSorteo = fechaInicioSorteo;
        this.fechaActual = fechaActual;
    }

    public Date getFechaInicioSorteo() {
        return fechaInicioSorteo;
    }

    public void setFechaInicioSorteo(Date fechaInicioSorteo) {
        this.fechaInicioSorteo = fechaInicioSorteo;
    }

    public long getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(long fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    public long getNuevaFechaSorteo(){
        long nuevaFecha = fechaInicioSorteo.getTime() + horaSorteoMilis + (Calendar.getInstance().getTimeInMillis() - fechaActual);
        return nuevaFecha;
    }
}
