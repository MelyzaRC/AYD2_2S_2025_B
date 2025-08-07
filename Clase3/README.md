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

## :books: Clase 3

<div id='content'/>
	
## :clipboard: Contenido:

1. [Ejemplo Patrón ADAPTER](#id1)  
2. [Ejemplo Patrón STATE](#id2)



<div id='id1'/>
	
## :pushpin: Ejemplo Patrón Adapter  [:arrow_up:](#content)

> El patrón Adapter es un patrón estructural de diseño que permite que dos interfaces incompatibles trabajen juntas. Actúa como un puente entre una clase existente y una interfaz esperada por el cliente. Su objetivo principal es reutilizar código existente sin modificarlo, adaptándolo a nuevos requisitos. Es útil cuando se quiere integrar una clase que no implementa la interfaz requerida, transformando su interfaz mediante una clase adaptadora. Existen dos formas comunes de implementarlo: por herencia (adaptador de clase) o por composición (adaptador de objeto). El patrón Adapter promueve la flexibilidad y facilita la integración con bibliotecas o sistemas externos.

<img src="https://refactoring.guru/images/patterns/content/adapter/adapter-es.png?id=5b877b3bdab93ef57848e3d6426064f1" alt="drawing" width="800" style="margin-bottom:25px">


:open_file_folder:  ```adapter``` :page_facing_up: ```ModernPlayer.java```

```
package adapter;

public class ModernPlayer implements AudioPlayer {
    public void play(String filename) {
        System.out.println("Reproduciendo audio moderno: " + filename);
    }
}
```

:open_file_folder:  ```adapter``` :page_facing_up: ```LegacyPlayer.java```

```
package adapter;

public class LegacyPlayer {
    public void reproducirArchivo(String archivo) {
        System.out.println("Reproduciendo audio desde LegacyPlayer: " + archivo);
    }
}
```

:open_file_folder:  ```adapter``` :page_facing_up: ```AudioPlayer.java```

```
package adapter;

public interface AudioPlayer {
    void play(String filename);
}
```

:open_file_folder:  ```adapter``` :page_facing_up: ```LegacyAdapter.java```

```
package adapter;

public class LegacyAdapter implements AudioPlayer {
    private LegacyPlayer legacyPlayer;

    public LegacyAdapter(LegacyPlayer legacyPlayer) {
        this.legacyPlayer = legacyPlayer;
    }

    @Override
    public void play(String filename) {
        legacyPlayer.reproducirArchivo(filename);
    }
}
```

:open_file_folder:  ```adapter``` :page_facing_up: ```adapter.java```

```
package adapter;

public class adapter {
	public static void main(String[] args) {
        AudioPlayer moderno = new ModernPlayer();
        moderno.play("cancion_moderno.mp3");

        LegacyPlayer legacy = new LegacyPlayer();
        AudioPlayer adaptado = new LegacyAdapter(legacy);
        adaptado.play("cancion_legacy.mp3");
    }
}

```




<div id='id2'/>
	
## :pushpin: Ejemplo Patrón State [:arrow_up:](#content)

> El patrón State es un patrón de comportamiento que permite que un objeto cambie su comportamiento cuando cambia su estado interno, como si cambiara su clase. Encapsula los estados posibles de un objeto en clases separadas y delega a estas clases el comportamiento según el estado actual. Así, se evita el uso de múltiples condicionales (if o switch) y se promueve un diseño más limpio y extensible. Es útil, por ejemplo, en máquinas de estados, ciclos de vida de objetos, o sistemas con reglas según contexto. Este patrón facilita agregar nuevos estados sin modificar el código existente, promoviendo el principio de abierto/cerrado.

<img src="https://refactoring.guru/images/patterns/content/state/state-es.png?id=03f2a3a86f4b58cc21b4c8c152d6c0ec" alt="drawing" width="800" style="margin-bottom:25px">


:open_file_folder:  ```state``` :page_facing_up: ```Estado.java```

```
package state;

public interface Estado {
	void reproducir();
    void pausar();
    void detener();
}

```

:open_file_folder:  ```state``` :page_facing_up: ```EstadoDetenido.java```

```
package state;

class EstadoDetenido implements Estado {
    @Override
    public void reproducir() {
        System.out.println("Iniciando reproducción...");
    }

    @Override
    public void pausar() {
        System.out.println("No se puede pausar, la música está detenida.");
    }

    @Override
    public void detener() {
        System.out.println("La música ya está detenida.");
    }
}
```

:open_file_folder:  ```state``` :page_facing_up: ```EstadoPausado.java```

```
package state;

class EstadoPausado implements Estado {
    @Override
    public void reproducir() {
        System.out.println("Reanudando música...");
    }

    @Override
    public void pausar() {
        System.out.println("La música ya está pausada.");
    }

    @Override
    public void detener() {
        System.out.println("Música detenida desde pausa.");
    }
}
```

:open_file_folder:  ```state``` :page_facing_up: ```EstadoReproduciendo.java```

```
package state;

class EstadoReproduciendo implements Estado {
    @Override
    public void reproducir() {
        System.out.println("Ya se está reproduciendo la música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void detener() {
        System.out.println("Música detenida.");
    }
}
```

:open_file_folder:  ```state``` :page_facing_up: ```state.java```

```
package state;

public class state {
	public static void main(String[] args) {
		ReproductorMusica reproductor = new ReproductorMusica();

		reproductor.reproducir();
		reproductor.pausar();
		reproductor.reproducir();
		reproductor.detener();
		
	}
}
```

