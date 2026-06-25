# Food Store - Sistema de Gestión de Pedidos

## Trabajo Práctico Integrador

**Materia:** Programación II

**Carrera:** Tecnicatura Universitaria en Programación a Distancia

**Universidad:** Universidad Tecnológica Nacional (UTN)

**Alumno:** Leandro Daniel Schaberger

**Año:** 2026

---

## Descripción

Food Store es una aplicación de consola desarrollada en Java que permite gestionar categorías, productos, usuarios y pedidos.

El proyecto fue desarrollado aplicando los principios de Programación Orientada a Objetos (POO), siguiendo el diagrama UML proporcionado por la cátedra y utilizando una arquitectura organizada por capas.

Toda la información se almacena en memoria mediante colecciones dinámicas (`ArrayList`), ya que el proyecto no utiliza bases de datos.

---

## Funcionalidades

### Gestión de Categorías

- Crear categorías.
- Listar categorías.
- Modificar categorías.
- Eliminar categorías (baja lógica).

### Gestión de Productos

- Crear productos.
- Listar productos.
- Modificar productos.
- Eliminar productos (baja lógica).

### Gestión de Usuarios

- Crear usuarios.
- Listar usuarios.
- Modificar usuarios.
- Eliminar usuarios (baja lógica).

### Gestión de Pedidos

- Crear pedidos.
- Agregar productos.
- Eliminar productos.
- Modificar estado.
- Modificar forma de pago.
- Eliminar pedidos (baja lógica).

---

## Características implementadas

- Programación Orientada a Objetos.
- Herencia.
- Clase abstracta (`Base`).
- Interfaces (`Calculable`).
- Enumeraciones (`Estado`, `FormaPago` y `Rol`).
- Manejo de excepciones personalizadas.
- Validaciones de reglas de negocio.
- Arquitectura por capas.
- Baja lógica de entidades.
- Colecciones dinámicas (`ArrayList`).

---

## Estructura del proyecto

```text
src/

├── Main.java
│
├── entities/
│   ├── Base.java
│   ├── Categoria.java
│   ├── Producto.java
│   ├── Usuario.java
│   ├── Pedido.java
│   └── DetallePedido.java
│
├── enums/
│   ├── Estado.java
│   ├── FormaPago.java
│   └── Rol.java
│
├── exceptions/
│   ├── DatoInvalidoException.java
│   ├── EntidadNoEncontradaException.java
│   └── MailDuplicadoException.java
│
├── interfaces/
│   └── Calculable.java
│
├── menu/
│   ├── MenuPrincipal.java
│   ├── MenuCategorias.java
│   ├── MenuProductos.java
│   ├── MenuUsuarios.java
│   └── MenuPedidos.java
│
└── services/
    ├── CategoriaService.java
    ├── ProductoService.java
    ├── UsuarioService.java
    └── PedidoService.java
```

---

## Reglas de negocio implementadas

- No se permiten categorías con nombres duplicados.
- No se permiten categorías con nombres vacíos.
- No se permiten productos con precio negativo.
- No se permiten productos con stock negativo.
- Todo producto debe pertenecer a una categoría válida.
- No se permiten usuarios con correos electrónicos duplicados.
- Todo pedido debe estar asociado a un usuario válido.
- La cantidad de productos agregados a un pedido debe ser mayor que cero.
- Las eliminaciones se realizan mediante baja lógica.

---

## Tecnologías utilizadas

- Java
- Apache NetBeans
- Git
- GitHub
- Markdown

---

## Ejecución del proyecto

1. Clonar o descargar el repositorio.
2. Abrir el proyecto en Apache NetBeans.
3. Compilar el proyecto.
4. Ejecutar la clase `Main.java`.
5. Utilizar el menú principal para acceder a cada módulo del sistema.

---

## Documentación

El proyecto incluye:

- README.
- Informe técnico en PDF (dentro de carpeta principal).
- Video demostrativo.
https://www.youtube.com/watch?v=1pHz62Sx5iI

---

## Autor

**Leandro Daniel Schaberger**

Tecnicatura Universitaria en Programación a Distancia

Universidad Tecnológica Nacional

