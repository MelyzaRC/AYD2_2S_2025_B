><img src="https://upload.wikimedia.org/wikipedia/commons/4/4a/Usac_logo.png" alt="drawing" width="150" style="margin-bottom:25px">
>
>Universidad San Carlos de Guatemala
>
>Facultad de Ingeniería 
>
>Escuela de Ciencias y Sistemas 
>
>Segundo Semestre, 2025
>
>Laboratorio de Análisis y Diseño de Sistemas 2
>
>Sección B

## :books: Clase 2

## :clipboard: Contenido:

1.  [Ejemplo SOLID](#id1)  
2. [Ejemplo SINGLETON](#id2)  



<div id='id1'/>
	
## :pushpin: Ejemplo SOLID 

> SOLID es un acrónimo de cinco principios de diseño orientado a objetos: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation y Dependency Inversion, promoviendo código mantenible y escalable.

<img src="https://cto.education/wp-content/uploads/2024/04/solid.png" alt="drawing" width="800" style="margin-bottom:25px">


## :round_pushpin: **S – Single Responsibility Principle (SRP)**
  
> Cada clase o módulo debe tener una única responsabilidad. Esto significa que debe estar enfocada en una sola funcionalidad, evitando mezclar tareas. Si una clase tiene múltiples motivos para cambiar, es una señal de violación del SRP. Este principio mejora la mantenibilidad, reduce el acoplamiento y facilita las pruebas unitarias.

:open_file_folder:  ```s``` :page_facing_up: ```Pago.java```

```
package s;

public class Pago {
    private double monto;

    public Pago(double monto) {
    	System.out.println("Creación de pago");
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
    
    public void setMonto(double monto_) {
    	monto = monto_;
    }
}
```

:open_file_folder:  ```s``` :page_facing_up: ```ProcesadorPago.java```

```
package s;

public class ProcesadorPagos {
    public void procesar(Pago pago) {
        System.out.println("Procesando pago de Q." + pago.getMonto());
    }
}
```

:open_file_folder:  ```s``` :page_facing_up: ```GeneradorReporte.java```

```
package s;

public class GeneradorReporte {
    public void generarReporte(Pago pago) {
        System.out.println("Reporte generado para pago de Q." + pago.getMonto());
    }
}
```


:open_file_folder:  ```s``` :page_facing_up: ```s.java```

```
package s;

public class s {

	
	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("S - Single Responsability");
		System.out.println("___________________________________\n");

		Pago pago = new Pago(100);

		ProcesadorPagos procesadorPagos = new ProcesadorPagos();
		procesadorPagos.procesar(pago);

		GeneradorReporte generadorReporte = new GeneradorReporte();
		generadorReporte.generarReporte(pago);
	}
}

```


## :round_pushpin: **O – Open/Closed Principle (OCP)** 

> Las entidades de software deben estar abiertas para extensión, pero cerradas para modificación. Esto implica que el comportamiento de un sistema puede ampliarse sin cambiar su código existente, generalmente usando herencia o interfaces. Con OCP, se minimizan los riesgos de introducir errores al modificar código estable y probado previamente.

:open_file_folder:  ```o``` :page_with_curl: ```MetodoPago.java```

```
package o;

public interface MetodoPago {

	void pagar(double monto);
	
}

```

:open_file_folder:  ```o``` :page_facing_up: ```PagoTarjeta.java```

```
package o;

public class PagoTarjeta implements MetodoPago {

	@Override
	public void pagar(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Pagando Q." + monto + " con el método de pago TARJETA.");
	}

}

```

:open_file_folder:  ```o``` :page_facing_up: ```PagoTransferencia.java```

```
package o;

public class PagoTransferencia implements MetodoPago {

	@Override
	public void pagar(double monto) {
		// TODO Auto-generated method stub
		System.out.println("Pagando Q." + monto + " con el método de pago TRANSFERENCIA.");
	}

}
```


:open_file_folder:  ```o``` :page_facing_up: ```o.java```

```
package o;

import s.Pago;

public class o {

	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("O – Open/Closed Principle ");
		System.out.println("___________________________________\n");

		Pago pago = new Pago(100);

		MetodoPago pagoTarjeta = new PagoTarjeta();
		pagoTarjeta.pagar(pago.getMonto());

		MetodoPago pagoTransferencia = new PagoTransferencia();
		pagoTransferencia.pagar(pago.getMonto());

	}

}

```


## :round_pushpin: **L – Liskov Substitution Principle (LSP)** 

> Los objetos de una clase derivada deben poder sustituir a los de su clase base sin alterar el funcionamiento esperado del programa. Si una subclase rompe el contrato de la clase padre, viola LSP. Cumplirlo asegura jerarquías coherentes, facilita la reutilización y evita comportamientos inesperados en el polimorfismo.

:open_file_folder:  ```l``` :page_with_curl: ```ProcesadorLiskov.java```

```
package l;

import o.MetodoPago;

public class ProcesadorLiskov {
	 public void procesar(MetodoPago metodo, double monto) {
	        metodo.pagar(monto);
	    }
}


```

:open_file_folder:  ```l``` :page_facing_up: ```PagoEfectivo.java```

```
package l;

import o.MetodoPago;

public class PagoEfectivo implements MetodoPago{

	public void pagar(double monto) {
        System.out.println("Pagando Q." + monto + " con el método de pago EFECTIVO.");
    }
	
}


```



:open_file_folder:  ```l``` :page_facing_up: ```l.java```

```
package l;

import o.PagoTarjeta;
import o.PagoTransferencia;
import o.MetodoPago;

public class l {
	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("L – Liskov Substitution Principle");
		System.out.println("___________________________________\n");

		double monto = 100;
		MetodoPago pagoEfectivo = new PagoEfectivo();
		MetodoPago pagoTransferencia = new PagoTransferencia();
		MetodoPago pagoTarjeta = new PagoTarjeta(); 
		
		ProcesadorLiskov procesadorLiskov = new ProcesadorLiskov();
		procesadorLiskov.procesar(pagoEfectivo, monto);
		procesadorLiskov.procesar(pagoTransferencia, monto);
		procesadorLiskov.procesar(pagoTarjeta, monto);

	}
}

```


## :round_pushpin: **I – Interface Segregation Principle (ISP)**

> Los clientes no deben verse forzados a depender de interfaces que no usan. Es mejor tener interfaces específicas y pequeñas que una interfaz grande y general. Cumplir ISP reduce la complejidad, evita implementaciones vacías o inútiles y promueve sistemas más flexibles, fáciles de probar y con menor acoplamiento.

:open_file_folder:  ```i``` :page_with_curl: ```IExportable.java```

```
package i;

public interface IExportable {
	
	void exportarPDF();
	
}

```

:open_file_folder:  ```i``` :page_facing_up: ```IImprimible.java```

```
package i;

public interface IImprimible {

	void imprimir();
	
}

```

:open_file_folder:  ```i``` :page_facing_up: ```ReportePDF.java```

```
package i;

public class ReportePDF implements IExportable {

	@Override
	public void exportarPDF() {
		// TODO Auto-generated method stub
		System.out.println("Exportando reporte en PDF...");
	}

}


```

:open_file_folder:  ```i``` :page_facing_up: ```i.java```

```
package i;

public class i {
	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("I – Interface Segregation Principle ");
		System.out.println("___________________________________\n");

		ReportePDF reportePDF = new ReportePDF(); 
		reportePDF.exportarPDF();

	}
}
```

## :round_pushpin: **D – Dependency Inversion Principle (DIP)** 

> Los módulos de alto nivel no deben depender de módulos de bajo nivel; ambos deben depender de abstracciones. Además, las abstracciones no deben depender de detalles, sino los detalles de las abstracciones. DIP fomenta código desacoplado, facilita cambios y pruebas unitarias, promoviendo arquitecturas robustas y fácilmente extensibles.

:open_file_folder:  ```d``` :page_facing_up: ```ServicioPago.java```

```
package d;

import o.MetodoPago;

public class ServicioPago {
    private MetodoPago metodoPago;

    public ServicioPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.pagar(monto);
    }
}

```

:open_file_folder:  ```d``` :page_facing_up: ```d.java```

```
package d;

import o.MetodoPago;
import o.PagoTarjeta;

public class d {

	public static void main(String[] args) {

		System.out.println("___________________________________\n");
		System.out.println("D – Dependency Inversion Principle");
		System.out.println("___________________________________\n");


		MetodoPago metodo = new PagoTarjeta(); 
        ServicioPago servicio = new ServicioPago(metodo);
        servicio.realizarPago(150.0);
	}

}

```


<div id='id2'/>
	
## :pushpin: Ejemplo Patrón de diseño SINGLETON

> El patrón Singleton garantiza que una clase tenga una única instancia en toda la aplicación y proporciona un punto global de acceso a ella. Controla su propia creación, evitando múltiples instancias, lo que es útil para recursos compartidos como configuraciones, conexiones o logs, asegurando consistencia y un uso eficiente de memoria.

<img src="https://refactoring.guru/images/patterns/content/singleton/singleton.png?id=108a0b9b5ea5c4426e0afa4504491d6f" alt="drawing" width="800" style="margin-bottom:25px">

:open_file_folder:  ```singleton``` :page_facing_up: ```Configuracion.java```

```
package singleton;

public class Configuracion {

    private static Configuracion instancia;
    private int numero; 

    private Configuracion() {
        System.out.println("Configuración inicializada");
    }

    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion(); 
        }
        return instancia;
    }

    public void mostrarConfiguracion() {
        System.out.println("Mostrando configuración...");
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }
}


```


:open_file_folder:  ```singleton``` :page_facing_up: ```singleton.java```

```
package singleton;

public class singleton {
	public static void main(String[] args) {
		
        Configuracion config1 = Configuracion.getInstancia();
        config1.setNumero(1000);
        config1.mostrarConfiguracion();

        Configuracion config2 = Configuracion.getInstancia();
        System.out.println(config2.getNumero());
        System.out.println(config1 == config2); 
    }
}

```
