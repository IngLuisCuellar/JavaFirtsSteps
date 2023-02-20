//Ejercicio práctico de Alura

/*A Juan le gustaría crear un programa sobre 
 * Impuesto sobre la Renta (IR), para ello, 
 * verificó las reglas de impuestos.
 * Encontró en el sitio web de impuestos que:

De 1900.0 a 2800.0, el IR es de 7.5% 
y puede deducir de la declaración el monto de 142.
De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636. */
public class TasaConIfs {
	public static void main(String[] args) {

        double salario = 3300.0;
        double impuestoRenta = 0;
        String tasa = "";
        int deduccion = 0;
        
        boolean condicion1 = salario >= 1900.0 && salario <= 2800.0;
        boolean condicion2 = salario >= 2800.01 && salario <= 3751.0;
        boolean condicion3 = salario >= 3751.01 && salario <= 4664.00;
        
        // ifs aqui
        
        if(condicion1 = true) {
        	deduccion = 142;
        	tasa = "7.5%";
        	impuestoRenta = (salario * 0.075);	
        }
        if(condicion2 = true) {
        	deduccion = 350;
        	tasa = "15%";
        	impuestoRenta = (salario * 0.15);
        }	
        if(condicion3 = true) {
        	deduccion = 636;
        	tasa = "22.5%";
        	impuestoRenta = (salario * 0.225);
        }
        
    	System.out.println("Su Impuesto sobre la Renta(IR) es del " + tasa + ", el cual sería de " + impuestoRenta + 
    			" teniendo en cuenta que su salario es de " + salario + " y puede tener una deducción del monto de "
    			+ deduccion + ".");
        

    }

}
