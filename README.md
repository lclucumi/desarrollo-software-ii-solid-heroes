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

Durante la demostración reconoceremos en código:

| Principio | Pregunta que nos ayuda a hacer |
|---|---|
| **S · Single Responsibility** | ¿Estamos concentrando responsabilidades que cambian por razones diferentes? |
| **O · Open/Closed** | ¿Cada nueva variante obliga a modificar nuevamente la misma lógica? |
| **L · Liskov Substitution** | ¿Podemos sustituir una implementación y seguir confiando en el contrato? |
| **I · Interface Segregation** | ¿Estamos obligando a alguien a depender de operaciones que no necesita? |
| **D · Dependency Inversion** | ¿Dependemos de una implementación concreta o de la capacidad que realmente necesitamos? |

Además, utilizaremos el mismo código para practicar un flujo de trabajo con:

**Git · branches · commits · Pull Requests · Code Review**

---

## 🦸 Nuestro punto de partida

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

Pero durante la clase nos haremos una pregunta importante:

> **¿Qué ocurre cuando aparecen más héroes, más habilidades y nuevos requisitos?**

A partir de allí iremos evolucionando el diseño.

---

## 🧩 Evolución de las habilidades

Poco a poco llegaremos a una estructura en la que las habilidades pueden representarse mediante un contrato común:

```text
              Ability
                 ↑
        ┌────────┼───────────┐
        │        │           │
  FlyAbility  SuperStrength  Invisibility
```

La idea será que `SuperHero` no necesite conocer cómo funciona internamente cada habilidad.

Por ejemplo:

```text
Superman
   │
   ├── FlyAbility
   └── SuperStrength
```

Así podremos preguntarnos:

> **¿Qué necesita conocer realmente `SuperHero` y qué detalles podrían quedar separados?**

---

## 🛡️ Finalmente construiremos los Avengers

También analizaremos cómo representar un equipo de héroes sin dejarlo atado a integrantes específicos.

Llegaremos conceptualmente a algo como:

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

### Respuesta

**Avengers no necesita conocer héroes concretos.**

Lo que realmente necesita es trabajar con **miembros capaces de cumplir el contrato `Avenger`**.

Por eso buscamos una relación como:

```text
Avengers
   │
   ↓
Avenger
   ↑
   ├── IronMan
   ├── Hulk
   └── Thor
```

De esta forma, `Avengers` depende de la **capacidad que necesita** y no queda directamente acoplado a una implementación concreta.

Esta idea nos ayudará a reconocer en código el principio de **Dependency Inversion (D)**.

---

## 💻 ¿Cómo ejecutaremos el proyecto?

Durante la clase trabajaremos en **Visual Studio Code**.

No necesitaremos ejecutar comandos de compilación manualmente.

### Paso 1 · Abrir el proyecto

Abran la carpeta del proyecto en Visual Studio Code:

```text
File → Open Folder
```

y seleccionen la carpeta del repositorio.

---

### Paso 2 · Abrir `Main.java`

En el panel **Explorer**, abran:

```text
src
└── Main.java
```

`Main.java` será nuestro punto de entrada para ejecutar los ejemplos.

---

### Paso 3 · Ejecutar

Sobre `Main.java`, utilicen la opción:

```text
Run
```

que aparece en Visual Studio Code.

También puede aparecer como:

```text
Run Java
```

o mediante el botón ▶️ de ejecución.

> **Si la opción `Run` no aparece o el programa no ejecuta, avisen antes de modificar la configuración del equipo.**

Durante la clase iremos ejecutando varias veces para comprobar cómo cambia el comportamiento a medida que evoluciona el diseño.

---

## 🌿 Después gestionaremos el cambio con Git

Una vez tengamos un cambio de código, veremos cómo gestionarlo sin trabajar directamente sobre `main`.

Nuestro flujo será:

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

---

## 🌱 Branch

Crearemos una rama específica para nuestro cambio:

```bash
git switch -c refactor/hero-abilities
```

La idea es trabajar de forma aislada sin modificar directamente `main`.

---

## 🔎 Status

Revisaremos el estado de nuestro trabajo:

```bash
git status
```

Este comando nos permite observar, entre otras cosas:

- en qué rama estamos;
- qué archivos modificamos;
- qué archivos todavía no están preparados;
- qué cambios están listos para el próximo commit.

---

## 📦 Staging area

Prepararemos los cambios que queremos registrar:

```bash
git add .
```

Con esto agregamos los cambios al **staging area**.

Podemos pensar el staging area como:

> **la zona donde preparamos qué cambios queremos incluir en el próximo commit.**

---

## 📝 Commit

Crearemos un registro del cambio:

```bash
git commit -m "refactor hero abilities"
```

Un commit debería representar un cambio coherente y tener un mensaje que ayude a entender qué ocurrió.

Por ejemplo:

```text
❌ cambios
❌ fix
❌ ahora sí

✅ refactor hero abilities
```

---

## ☁️ Push

Publicaremos nuestra rama en GitHub:

```bash
git push -u origin refactor/hero-abilities
```

Aquí:

- `push` envía nuestros commits al repositorio remoto;
- `origin` es el nombre habitual del repositorio remoto;
- `-u` vincula nuestra rama local con la rama remota.

Después del primer `push`, normalmente podremos utilizar simplemente:

```bash
git push
```

para enviar nuevos commits de esa misma rama.

---

## 🔀 Pull Request

Una vez publicada la rama, utilizaremos GitHub para crear un **Pull Request**.

Conceptualmente:

```text
refactor/hero-abilities
          │
          ↓
    Pull Request
          │
          ↓
        main
```

Un Pull Request no significa:

> “mi código ya debe integrarse”.

Significa:

> **“Propongo este cambio para que pueda ser revisado antes de integrarlo.”**

---

## 👀 Code Review

Revisaremos el cambio antes de integrarlo.

Durante un Code Review podemos preguntarnos:

- ¿el cambio resuelve el problema?
- ¿las responsabilidades son claras?
- ¿aumentamos innecesariamente el acoplamiento?
- ¿la abstracción tiene sentido?
- ¿hay casos que no consideramos?
- ¿el código puede entenderse fácilmente?

Un comentario útil no sería:

> ❌ “Esto está mal.”

Podría ser:

> ✅ “Esta clase todavía depende directamente de una implementación concreta. ¿Podríamos depender del contrato correspondiente? ¿Qué beneficio tendría en este caso?”

La intención del Code Review es **discutir técnicamente el cambio**, no evaluar a la persona que lo escribió.

---

## 🔄 El flujo completo

Al finalizar habremos recorrido:

```text
Código
  ↓
Branch
  ↓
Cambios
  ↓
Staging area
  ↓
Commit
  ↓
Push
  ↓
Pull Request
  ↓
Code Review
  ↓
Ajustes
  ↓
Merge
```

---

## 💡 Idea central

<div align="center">

### Que el código funcione es necesario, pero no siempre es suficiente.

También queremos que sea:

**comprensible · mantenible · extensible · testeable**

<br>

Y cuando trabajamos en equipo, también necesitamos:

**registrar · comunicar · revisar · integrar**

</div>

---

<div align="center">

### 🧠 La pregunta que guiará nuestra práctica

## ¿Qué cambio es difícil en este código y por qué?

---

**Universidad del Valle · Desarrollo de Software II · 2026-2**  
Material académico preparado por **Luz Carime Lucumí Hernández**

</div>
