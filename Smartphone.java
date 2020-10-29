/**
 * Write a description of class smartphone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smartphone{
    private String marca;
    private int ram;
    private boolean estaCargado;

    /**
     * Constructor, inicializamos atributos.
     */
    public Smartphone(String laMarca, int laRam){
        marca = laMarca;
        ram = laRam;
        estaCargado = true;
    }

    public String getMarca(){
        return marca;
    }

    public int getram(){
        return ram;
    }

    public boolean getEstaCargado(){
        return estaCargado;
    }

    public void setMarca(String nuevaMarca){
        marca = nuevaMarca;
    }

    public void incrementarRam(int valorIncremento){
        ram += valorIncremento;
    }

    public void setEstadoCarga(){
        if(estaCargado == true){
            estaCargado = false;
        } else{
            estaCargado = true;
        };
    }

    public String estadoObjeto(){
        String estado;
        String carga;
        if(estaCargado == true){
            carga = "Si";
        } else{
            carga = "No";
        }
        estado = "Marca: " + marca + ", RAM: " + ram + ", cargado: " + carga;
        return estado; 
    }

    public void imprimeDetalles(){
        System.out.println(estadoObjeto());
    }

}
