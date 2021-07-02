package evaluacioncc;

// linkList.java
// demonstrates linked list
// to run this program: C>java LinkListApp
////////////////////////////////////////////////////////////////
class linkList
   {
   private Persona first;            // ref to first link on list

// -------------------------------------------------------------
   public linkList()              // constructor
      {
      first = null;               // no links on list yet
      }
// -------------------------------------------------------------
   public boolean isEmpty()       // true if list is empty
      {
      return (first==null);
      }
// -------------------------------------------------------------
                                  // insert at start of list
   public void insertFirst(String nombre, int edad)
      {                           // make new link
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
   public void displayList()
      {
      System.out.print("List (first-->last): ");
      Persona current = first;       // start at beginning of list
      while(current != null)      // until end of list,
         {
         current.displayList();   // print data
         current = current.next;  // move to next link
         }
      System.out.println("");
      }
// -------------------------------------------------------------
   }  // end class LinkList
////////////////////////////////////////////////////////////////
class LinkListApp
   {
   public static void main(String[] args)
      {
      
      linkList Personas = new linkList();
      
      Personas.insertFirst("Ignacio", 23);
      Personas.insertFirst("Maria", 35);
      Personas.insertFirst("Jose", 14);
      Personas.insertFirst("Juan", 40);
      Personas.insertFirst("Sofia", 8);

      Personas.displayList();              // display list
      
      

    }
}
////////////////////////////////////////////////////////////////
