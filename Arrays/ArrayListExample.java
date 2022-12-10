import java.util.ArrayList;

public class ArrayListExample {
    /*
    * Creating an ArrayList.
        Adding a new ArrayList item using add().
        Accessing the size of an ArrayList using size().
        Finding an item by index using get().
        Changing the value of an ArrayList item using set().
        Removing an item with a specific value using remove().
        Retrieving the index of an item with a specific value using indexOf().
    * */
    public static void main(String[] args) {

        // Sherlock
        ArrayList<String> sherlocksToDos = new ArrayList<String>();

        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");



        // Poirot
        ArrayList<String> poirotsToDos = new ArrayList<String>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        // Set each to-do below:
        sherlocksToDos.set(1,"listen to Dr. Watson for amusement");
        poirotsToDos.set(3, "listen to Captain Hastings for amusement");

        // Remove each to-do below:
        sherlocksToDos.remove("visit the crime scene");
        poirotsToDos.remove(0);
        sherlocksToDos.remove("play violin");


        System.out.println("Sherlock's to-do list:");
        System.out.println(sherlocksToDos.toString() + "\n");
        System.out.println("Poirot's to-do list:");
        System.out.println(poirotsToDos.toString());

//        Getting an Item's Index

        /*What if we had a really large list and wanted to know the position of a certain
        element in it? For instance, what if we had an ArrayList detectives with the names
        of fictional detectives in chronological order, and we wanted
        to know what position of an item was.*/


        // Calculate to-dos until case is solved:
        int a = sherlocksToDos.indexOf("solve the case");

        // Change the value printed:
        System.out.println("PRINT THE ANSWER HERE");
        System.out.println(a);
    }
}
