// * @author nacho
package evaluacioncc;

// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////

/**
 * RICARDO CARRASCO S.
 *
 *
 */

class linkList {

    private Persona first;            // ref to first link on list

// -------------------------------------------------------------
    public linkList() // constructor
    {
        first = null;               // no links on list yet
    }

// -------------------------------------------------------------
    public boolean isEmpty() // true if list is empty
    {
        return (first == null);
    }
// -------------------------------------------------------------
    // insert at start of list

    public void insertFirst(String nombre, int edad) {                           // make new link
        Persona newLink = new Persona(nombre, edad);
        newLink.next = first;       // newLink --> old first
        first = newLink;            // first --> newLink
    }
// -------------------------------------------------------------
    //public Persona deleteFirst()      // delete first item
    //    {                           // (assumes list not empty)
    //   Persona temp = first;          // save reference to link
    //   first = first.next;         // delete it: first-->old next
    //   return temp;                // return deleted link
    //   }
// -------------------------------------------------------------

    public void displayList() {
        System.out.println("List (first-->last): ");
        System.out.println("");
        Persona current = first;       // start at beginning of list
        while (current != null) // until end of list,
        {
            current.mostrarDatos();// print data
            System.out.println("--------------------------------");
            current = current.next;  // move to next link
        }
        System.out.println("");
    }

    public void ordenarLista(String nombre, int edad) { // SE MODIFICA EL INSERTFIRST() PARA QUE AHORA EN VEZ DE INSERTAR
                                                        //POR INGRESO, SE ORDENA POR LA EDAD DE MENOR A MAYOR

        Persona newLink = new Persona(nombre,edad);    // make new link
        Persona previous = null;            // start at first
        Persona current = first;
        // until end of list,
        while (current != null && edad > current.getEdad()) {                             // or key > current,
            previous = current;
            current = current.next;       // go to next item
        }
        if (previous == null) // at beginning of list
        {
            first = newLink;              // first --> newLink
        } else // not at beginning
        {
            previous.next = newLink;      // old prev --> newLink
        }
        newLink.next = current;          // newLink --> old currnt

    }
}

// -------------------------------------------------------------
////////////////////////////////////////////////////////////////
class LinkListApp {

    public static void main(String[] args) {

        linkList Personas = new linkList();

        Personas.ordenarLista("Ignacio", 23);
        Personas.ordenarLista("Maria", 35);
        Personas.ordenarLista("Jose", 14);
        Personas.ordenarLista("Juan", 40);
        Personas.ordenarLista("Sofia", 8);
        Personas.ordenarLista("Camila", 23);

        Personas.displayList();              // display list

       
    }
}
////////////////////////////////////////////////////////////////
