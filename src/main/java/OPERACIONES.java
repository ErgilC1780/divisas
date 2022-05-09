
public class OPERACIONES {
private double valor, resultado;
private int divisa, divisafinal;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

   

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
  // cpnstrucot
    public OPERACIONES() {
    }
// metodos 
    
    public double convertir(){
        
        if (divisa==0 && divisafinal==1) { //GTQ0 A DL1
            resultado = valor * 7.67;
        } else if (divisafinal == 0 && divisa ==1){ //dls a gt
            resultado = valor * 0.13;
        } else if (divisa == 0 && divisafinal == 0) {
            resultado = valor;
        }  else if (divisa == 1 && divisafinal == 1) {
            resultado = valor;
        }
            
        if (divisa==2 && divisafinal==3) { //eur2 a peso mx3
            resultado = valor *21.50;
        } else if (divisa == 3 && divisafinal == 2){ //peso a eu
            resultado = valor * 0.047;
        }  else if (divisa == 2 && divisafinal == 2) {
            resultado = valor;
        }
        if (divisa==0 && divisafinal == 2){ //gtq a euros
            resultado = valor * 0.12;
        } else if (divisa == 0 && divisafinal == 3) { //gtq a psmx
            resultado = valor * 2.67;
        }  else if (divisa == 3 && divisafinal == 3) {
            resultado = valor;
        }
        if (divisa == 1 && divisafinal == 2) { //dls a eur
            resultado = valor * 0.95;
        } else if (divisa == 2 && divisafinal == 1) { //eur a dls
            resultado = valor * 1.05;}
        else if (divisa == 3 && divisafinal == 0) { // psmx a gtq
            resultado = valor * 0.38;}
        
        
        return resultado;
    }
    
    
    
}
