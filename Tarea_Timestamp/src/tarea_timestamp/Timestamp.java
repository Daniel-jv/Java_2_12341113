package tarea_timestamp;

public class Timestamp {
    
    private String año;
    private String mes;
    private String dia;
    private String hora;
    private String minuto;
    private String segundo;

    @Override
    public String toString() {
        return año + "-" + mes + "-" + dia + "  " + hora + ":" + minuto + ":" + segundo;
    }
    
    public String toStringDate() {
        return año + "-" + mes + "-" + dia;
    }
    
    public String toStringEmpty() {
        return "- VACIO  -";
    }

    public Timestamp() { }
    
    public Timestamp(String año, String mes, String dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    
    public Timestamp(String año, String mes, String dia, String hora, String minuto, String segundo) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }
    
}
