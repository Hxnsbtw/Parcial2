public class Planeta {

    String Nombre;
    int Cantidad_Satelites;
    double masa;
    double volumen;
    int diametro;
    int distancia_sol;
    boolean observable;
    
    public Planeta(String nombre, int cantidad_Satelites, double masa, double volumen, int diametro, int distancia_sol,
            boolean observable, double densidadPlaneta) {
        Nombre = nombre;
        Cantidad_Satelites = cantidad_Satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.observable = observable;
        
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCantidad_Satelites() {
        return Cantidad_Satelites;
    }
    public void setCantidad_Satelites(int cantidad_Satelites) {
        Cantidad_Satelites = cantidad_Satelites;
    }
    public double getMasa() {
        return masa;
    }
    public void setMasa(double masa) {
        this.masa = masa;
    }
    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public int getDiametro() {
        return diametro;
    }
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    public int getDistancia_sol() {
        return distancia_sol;
    }
    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }
    public boolean isObservable() {
        return observable;
    }
    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    double calcularDensidad (double densidadPlaneta){
        return masa/volumen;
    }

    void imprimir (){

        System.out.println("Nombre: " +Nombre);
        System.out.println("Cantida de satelites: " +Cantidad_Satelites);
        System.out.println("Masa: " +masa);
        System.out.println("Volumen: " +volumen);
        System.out.println("Diametro: " +diametro);
        System.out.println("Distancias del sol: " +distancia_sol);
        System.out.println("Observable: " +observable);

    }

    public static void main (String[] args){
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12 , 12742, 150000000, true, 0);
        p1.imprimir();
        p1.calcularDensidad(0)
    }
    


}