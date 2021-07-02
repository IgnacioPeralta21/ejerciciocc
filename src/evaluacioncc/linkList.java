package evaluacioncc;

// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
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

    public void orderByEdad(linkList personas) // insert, in order
    {
        String nombre = personas.first.getNombre();
        int edad = personas.first.getEdad();

        Persona newLink = personas.first;    // make new link
        Persona previous = null;            // start at first
        Persona current = first;
        // until end of list,
        while (current != null && edad < current.getEdad()) {                             // or key > current,
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

        System.out.println(" Ordenadas por edad: ");
        System.out.println("");
        while (current != null) // until end of list,
        {
            current.mostrarDatos();// print data
            System.out.println("--------------------------------");
            current = current.next;  // move to next link
        }
        System.out.println("");
    }

}  // end insert()

// -------------------------------------------------------------
////////////////////////////////////////////////////////////////
class LinkListApp {

    public static void main(String[] args) {

        linkList Personas = new linkList();

        Personas.insertFirst("Ignacio", 23);
        Personas.insertFirst("Maria", 35);
        Personas.insertFirst("Jose", 14);
        Personas.insertFirst("Juan", 40);
        Personas.insertFirst("Sofia", 8);
        Personas.insertFirst("Camila", 23);

        Personas.displayList();              // display list

        Personas.orderByEdad(Personas); //ORDENA LA LISTA ANTERIOR
    }
}
////////////////////////////////////////////////////////////////
