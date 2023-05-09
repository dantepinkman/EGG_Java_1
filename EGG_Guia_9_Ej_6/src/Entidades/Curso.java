
package Entidades;

public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasProSemana;
    private String turno;
    private int precioPorhora;
    private String[] alumnos = new String [5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasProSemana, String turno, int precioPorhora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasProSemana = cantidadDiasProSemana;
        this.turno = turno;
        this.precioPorhora = precioPorhora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasProSemana() {
        return cantidadDiasProSemana;
    }

    public void setCantidadDiasProSemana(int cantidadDiasProSemana) {
        this.cantidadDiasProSemana = cantidadDiasProSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorhora() {
        return precioPorhora;
    }

    public void setPrecioPorhora(int precioPorhora) {
        this.precioPorhora = precioPorhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
    
}
