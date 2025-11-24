# PROYECTO — Teoría de la Complejidad
Asignatura: Estructura de Datos  
Práctica: 4.1  
Tema: Complejidad algorítmica y eficiencia  
Integrantes:
- Joshue Avecillas
- Diego Samaniego

---

# SECCIÓN 1 — INVESTIGACIÓN TEÓRICA

## 1. ¿Qué es la Teoría de la Complejidad?
La teoría de la complejidad es la rama de la informática que estudia cómo el rendimiento de un algoritmo cambia de acuerdo al tamaño de entrada del problema.  
Su objetivo es medir cuántos recursos (principalmente tiempo y espacio) necesita un algoritmo a medida que la entrada crece, permitiendo comparar soluciones sin depender del hardware o del lenguaje de programación.

---

## 2. Eficiencia de algoritmos

### Coste temporal
Es la cantidad de tiempo que un algoritmo requiere para ejecutarse. No se mide en segundos, sino en número aproximado de operaciones, lo que lo hace independiente del computador.

### Coste espacial
Es la cantidad de memoria que necesita para ejecutarse, considerando:
- Variables
- Estructuras temporales
- Llamadas recursivas

Un buen algoritmo busca optimizar ambos costes.

---

## 3. Factores de tiempo de ejecución

### Factores propios
Dependen únicamente del algoritmo:
- Cantidad de ciclos y estructuras de control
- Lógica del análisis
- Uso de recursión o iteración

### Factores circunstanciales
Dependen del entorno:
- Hardware
- Lenguaje de programación
- Sistema operativo
- Optimizaciones de compilación

### Análisis teórico
Evalúa matemáticamente el algoritmo sin ejecutarlo.  
Usa la notación asintótica para medir la complejidad.

### Análisis experimental
Se realiza probando el código con diferentes tamaños de entrada y midiendo tiempos reales.

---

## 4. Notación Big O

### ¿Qué es Big O?
Big O describe una cota superior del coste temporal de un algoritmo en el peor de los casos.  
Permite comparar algoritmos sin ejecutarlos.

### Tipos de notaciones

- **Mejor caso**  
  Situación en que el algoritmo tarda lo mínimo posible.

- **Peor caso**  
  Escenario en que realiza la mayor cantidad de trabajo.

- **Caso promedio**  
  Promedio estadístico de ejecuciones.

### Big O, Ω y Θ
- **O() — Big O:** cota superior (peor caso)
- **Ω() — Omega:** cota inferior (mejor caso)
- **Θ() — Theta:** representa una cota ajustada cuando mejor y peor caso coinciden

Ejemplos típicos:

| Complejidad | Nombre |
|---|---|
| O(1) | Constante |
| O(n) | Lineal |
| O(log n) | Logarítmica |
| O(n²) | Cuadrática |
| O(n log n) | N log N |

---

# SECCIÓN 2 — EJEMPLOS DE COMPLEJIDAD EN JAVA

A continuación se presentan las clases desarrolladas y su análisis según el formato solicitado.

---

## ⭐ Complejidad O(1) – Constante

### Archivo
`ComplejidadConstante.java`

### Definición
Es aquella en la que el tiempo de ejecución no depende del tamaño de la entrada. Siempre realiza la misma cantidad de operaciones.

### Código
```java
public void ejemplo(int[] datos) {
    if (datos != null && datos.length > 0) {
        int primero = datos[0];
        System.out.println("Primer elemento: " + primero);
    }
}
```

### ¿Por qué es O(1)?
- Realiza una sola operación independiente de `n`
- Siempre ejecuta la misma cantidad de instrucciones

---

## ⭐ Complejidad O(n) – Lineal

### Archivo
`ComplejidadLineal.java`

### Definición
El tiempo de ejecución crece de forma proporcional al tamaño de entrada.

### Código
```java
public void ejemplo(int[] datos) {
    long suma = 0;
    for (int i = 0; i < datos.length; i++) {
        suma += datos[i];
    }
    System.out.println("Suma: " + suma);
}
```

### ¿Por qué es O(n)?
- Ejecuta una instrucción por cada elemento del arreglo
- Si la entrada duplica su tamaño, el tiempo también se duplica

---

## ⭐ Complejidad O(n²) – Cuadrática

### Archivo
`ComplejidadCuadratica.java`

### Definición
Ocurre cuando existen dos bucles anidados que procesan los mismos datos.

### Código
```java
public void ejemplo(int[] datos) {
    int n = datos.length;
    int cuentas = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (datos[i] + datos[j] == 0) {
                cuentas++;
            }
        }
    }
    System.out.println("Pares con suma 0: " + cuentas);
}
```

### ¿Por qué es O(n²)?
- Por cada elemento del arreglo se recorre nuevamente el resto
- El número de operaciones crece como `n × n`

---

## ⭐ Complejidad O(log n) – Logarítmica

### Archivo
`ComplejidadLogaritmica.java`

### Definición
Cada iteración reduce el problema a la mitad. Ejemplo típico: búsqueda binaria.

### Código
```java
public int busquedaBinaria(int[] datos, int clave) {
    int lo = 0, hi = datos.length - 1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (datos[mid] == clave) return mid;
        if (datos[mid] < clave) lo = mid + 1;
        else hi = mid - 1;
    }
    return -1;
}
```

### ¿Por qué es O(log n)?
- Cada iteración divide el espacio de búsqueda en dos
- El número de pasos crece logarítmicamente

---

## ⭐ Complejidad O(n log n)

### Archivo
`ComplejidadNLogN.java`

### Definición
El algoritmo combina una operación lineal con otra logarítmica.  
Ejemplo típico: algoritmos eficientes de ordenamiento.

### Código
```java
public void ejemplo(int n) {
    for (int i = 0; i < n; i++) {
        int j = 1;
        while (j < n) {
            j *= 2;
        }
    }
}
```

### ¿Por qué es O(n log n)?
- El ciclo externo ejecuta `n` veces
- El interno ejecuta `log n` veces
- Total ≈ `n × log n`

---

# SECCIÓN 3 — CONCLUSIONES

- Las complejidades cuadráticas O(n²) y superiores se vuelven muy costosas cuando el tamaño aumenta.
- Big O es una herramienta universal para comparar algoritmos sin necesidad de ejecutarlos.
- La búsqueda binaria demostró ser muy eficiente al crecer la entrada.
- Los experimentos muestran que la velocidad real coincide con la teoría asintótica.
- Esta práctica permitió comprender cómo el crecimiento de datos afecta directamente la eficiencia.

---

# ESTRUCTURA DEL PROYECTO

```
/src
   /complejidades
      ComplejidadConstante.java
      ComplejidadLineal.java
      ComplejidadCuadratica.java
      ComplejidadLogaritmica.java
      ComplejidadNLogN.java
/assets
Main.java
README.md
```

---

# RESULTADOS OBTENIDOS

- Se reforzó el entendimiento de teoría de complejidad y su aplicación práctica.
- Se comprobó experimentalmente el comportamiento de distintas notaciones de complejidad.
- Se logró implementar una aplicación funcional y documentada en Java.

---

# Docente
Ing. Pablo Torres
