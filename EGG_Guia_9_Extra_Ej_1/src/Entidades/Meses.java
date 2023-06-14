
package Entidades;

public class Meses {
    
    //private String[] mes = new String [12];
    //private String[] mes = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String[] mes;
    public int num;
    private String mesSecreto;
    

    public Meses(String[] mes) {
        this.mes = mes;
    }
    

    public Meses() {
        
        String mes[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        mesSecreto = mes[(int) (Math.random()*12)];
        System.out.println(mesSecreto);
    }
    
    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    

    
    
    
}
