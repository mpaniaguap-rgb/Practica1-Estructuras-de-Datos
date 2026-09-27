# Práctica 1 - Implementación de Estructuras de Datos

## Descripción

Esta práctica consiste en desarrollar un sistema sencillo para la gestión de tickets en línea.

El sistema permite trabajar con dos tipos de usuarios:

- Usuario: puede crear tickets y buscar tickets resueltos.
- Administrador: puede ver el ticket que está al frente de la cola y resolverlo.

Para organizar los tickets se utilizan estructuras de datos. Los tickets pendientes se almacenan en una cola y los tickets que ya fueron resueltos se almacenan en una lista enlazada simple.

## Objetivo de la práctica

El objetivo es aplicar estructuras de datos y los algoritmos necesarios para resolver el problema planteado, utilizando Java.

También se busca comprender el funcionamiento de las estructuras utilizadas y aplicar buenas prácticas de programación.

## Estructuras de datos utilizadas

### Cola dinámica

La cola se utiliza para almacenar los tickets que están pendientes de solución.

Entre las operaciones utilizadas están:

- `insertar(): agrega un ticket a la cola.
- `eliminar(): elimina el ticket que está al frente.
- `verFrente(): permite consultar el ticket que está al frente.
- `estaVacia(): verifica si la cola está vacía.

### Lista enlazada simple

La lista enlazada simple se utiliza para almacenar los tickets que ya fueron resueltos.

Cada nodo contiene un ticket y una referencia al siguiente nodo.

Entre las operaciones utilizadas están:

- `insertarInicio(): agrega un ticket a la lista.
- `buscar(): busca un ticket por su ID.
- `mostrarLista(): muestra los tickets resueltos.
- `estaVacia(): verifica si la lista está vacía.

## Clases utilizadas

### Ticket.java

Representa cada ticket creado por un usuario.

Contiene:

- ID
- Descripción
- Nombre completo del usuario
- Fecha de creación
- Fecha de resolución

El ID se genera de manera consecutiva y la fecha de resolución comienza con el valor null.

### ColaDinamica.java

Se encarga de almacenar los tickets que están pendientes de solución.

### ListaEnlazadaSimple.java

Se encarga de almacenar los tickets que ya fueron resueltos mediante una lista enlazada simple.

### SistemaTickets.java

Se encarga de conectar las estructuras de datos y manejar las operaciones principales del sistema.

Permite:

- Crear tickets.
- Agregar tickets a la cola.
- Ver el ticket que está al frente.
- Resolver tickets.
- Pasar los tickets resueltos a la lista.
- Buscar tickets por su ID.

### Main.java

Contiene el método main() y permite utilizar el sistema mediante una interfaz de línea de comandos.

Incluye:

- Menú de usuario.
- Menú de administrador.
- Opción para salir.
Administrador resuelve el ticket
        ↓
Lista enlazada de tickets resueltos
