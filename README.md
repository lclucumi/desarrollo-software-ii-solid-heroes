<div align="center">

# 🎓 Universidad del Valle

### Desarrollo de Software II · Grupo 51

# 🦸 SOLID Heroes

**Demostración práctica de los principios SOLID con Java**

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![SOLID](https://img.shields.io/badge/Diseño-SOLID-7C3AED?style=flat-square)
![Git](https://img.shields.io/badge/Git-Control%20de%20versiones-F05032?style=flat-square&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-PR%20%2B%20Review-24292F?style=flat-square&logo=github&logoColor=white)

**Docente:** Luz Carime Lucumí Hernández  
**Asignatura:** Desarrollo de Software II  
**Universidad del Valle · 2026-2**

</div>

---

## 🧭 ¿Qué haremos con este repositorio?

Este repositorio acompaña la demostración práctica de la **Clase 4 · Git profesional, Pull Requests y Code Review**.

Partiremos de un programa Java muy pequeño basado en **superhéroes** 🦸 y lo iremos modificando juntos para observar cómo aparecen problemas de diseño y cómo los principios **SOLID** pueden ayudarnos a tomar mejores decisiones.

La idea central de la práctica es:

> **No aplicar SOLID por obligación.**
>
> Primero identificamos un problema de diseño y después analizamos qué principio puede ayudarnos.

---

## 🎯 Objetivos

Al finalizar la demostración podremos reconocer en código:

| Principio | Pregunta que nos ayuda a hacer |
|---|---|
| **S · Single Responsibility** | ¿Estamos concentrando responsabilidades que cambian por razones diferentes? |
| **O · Open/Closed** | ¿Cada nueva variante obliga a modificar nuevamente la misma lógica? |
| **L · Liskov Substitution** | ¿Podemos sustituir una implementación y seguir confiando en el contrato? |
| **I · Interface Segregation** | ¿Estamos obligando a alguien a depender de operaciones que no necesita? |
| **D · Dependency Inversion** | ¿Dependemos de una implementación concreta o de la capacidad que realmente necesitamos? |

---

## 🦸 Nuestro ejemplo

Comenzaremos con una representación muy sencilla:

```text
SuperHero
   │
   ├── nombre
   ├── volar
   ├── trepar muros
   └── usar superfuerza
```

El código funciona.

Pero durante la clase nos preguntaremos:

> **¿Qué ocurre cuando aparecen más héroes, más habilidades y nuevos requisitos?**

A partir de allí iremos evolucionando el diseño.

---

## 🧩 Evolución durante la clase

El proyecto crecerá progresivamente.

```text
SuperHero
    │
    └── Ability
          │
          ├── FlyAbility
          ├── SuperStrength
          └── Invisibility
```

También utilizaremos pequeños ejemplos para analizar **L** e **I**.

Finalmente construiremos:

```text
                 Avenger
                    ↑
          ┌─────────┼─────────┐
          │         │         │
       IronMan     Hulk      Thor
          \         |         /
           \        |        /
               Avengers
```

La pregunta será:

> **¿Avengers necesita conocer específicamente a Iron Man, Hulk o Thor, o simplemente necesita miembros capaces de luchar?**

---

## 💻 Tecnologías

Para esta práctica utilizaremos únicamente:

- **Java**
- **Visual Studio Code**
- **Git**
- **GitHub**

No utilizaremos frameworks, bases de datos ni servicios externos.

---

## ▶️ Ejecutar el proyecto

Una vez descargado el repositorio, abrir una terminal en la raíz del proyecto.

### 1 · Verificar Java

```bash
java --version
javac --version
```

### 2 · Compilar

En macOS/Linux:

```bash
javac src/*.java
```

En Windows PowerShell:

```powershell
javac src\*.java
```

### 3 · Ejecutar

```bash
java -cp src Main
```

---

## 🌿 Git durante la demostración

Después de realizar nuestro cambio de diseño, utilizaremos el mismo proyecto para recorrer un flujo de trabajo con Git:

```text
main
  │
  └── refactor/hero-abilities
              │
              ↓
           cambios
              ↓
            commit
              ↓
             push
              ↓
        Pull Request
              ↓
         Code Review
              ↓
            merge
```

La rama utilizada durante la demostración será:

```text
refactor/hero-abilities
```

---

## 🔧 Comandos que utilizaremos

Crear y cambiar a la rama:

```bash
git switch -c refactor/hero-abilities
```

Revisar el estado:

```bash
git status
```

Preparar los cambios:

```bash
git add .
```

Crear el commit:

```bash
git commit -m "refactor hero abilities"
```

Publicar la rama:

```bash
git push -u origin refactor/hero-abilities
```

Después continuaremos el flujo mediante **Pull Request y Code Review en GitHub**.

---

## 💡 Idea central

<div align="center">

### Que el código funcione es necesario, pero no siempre es suficiente.

Un buen diseño también busca que el software sea:

**comprensible · mantenible · extensible · testeable**

</div>

<div align="center">

### 🧠 La pregunta que guiará toda la clase

## ¿Qué cambio es difícil en este código y por qué?

---

**Universidad del Valle · Desarrollo de Software II · 2026-2**  
Material académico preparado por **Luz Carime Lucumí Hernández**

</div>
