# Modulo2
**Descripción**
  Este proyecto consiste en el diseño e implementación de una interfaz gráfica en Java
  Swing siguiendo un wireframe y un árbol de contenedores previamente planificados.
  El objetivo principal es practicar el uso de diferentes layouts (BorderLayout,
  FlowLayout, GridLayout, GridBagLayout) y organizar una ventana principal con un
  JDialog modal de confirmación.

**Estructura general de la ventana**
  Se compone de 5 zonas principales organizadas con BorderLayout:
    - NORTH: panel con título e icono
    - WEST: cinco botones de menú en columna
    - CENTER: formulario de datos con etiquetass y campos usando GridBagLayout
    - EAST: panel lateral con JTabbedPane
    - SOUTH: botonera alineada a la derecha

**Árbol de contenedores**
JFrame (BorderLayout)
 ├─ NORTH: superior (FlowLayout)
 │    └─ JLabel (icono + texto)
 │
 ├─ WEST: nav (GridLayout 5x1)
 │    ├─ JButton "Dashboard"
 │    ├─ JButton "Usuarios"
 │    ├─ JButton "Informes"
 │    ├─ JButton "Ajustes"
 │    └─ JButton "Ayuda"
 │
 ├─ CENTER: form (GridBagLayout)
 │    ├─ JLabel + JTextField "Nombre"
 │    ├─ JLabel + JTextField "Email"
 │    ├─ JLabel + JComboBox "Rol"
 │    ├─ JLabel + JCheckBox "Activo"
 │    └─ JLabel + JTextArea "Notas" (dentro de JScrollPane)
 │
 ├─ EAST: preview (BorderLayout)
 │    └─ JTabbedPane
 │         ├─ Tab "Resumen" → JTextArea (read-only)
 │         └─ Tab "Logs"    → JTextArea / JList
 │
 └─ SOUTH: botonera (FlowLayout RIGHT)
      ├─ JButton "Cancelar"
      ├─ JButton "Limpiar"
      └─ JButton "Guardar" (default button)

**Diálogo modal**
  Se incluye un JDialog modal de confirmación que se muestra al pulsar el botón
  Guardar.
  Este diálogo contiene:
    - Un JLabel: ¿Guardar cambios?
    - Dos botones: "Aceptar" y "Cancelar"
