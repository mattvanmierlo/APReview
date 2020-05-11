import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Car myCar = new Car("Toyota", "Corolla");
        Car familyCar = new Car("Toyota", "Corolla");

        // Conditional Statements and Booleans

            // Print "Let's go on an adventure!" if myCar is on
            // Otherwise print "Please turn on the car first

            // Print "Let's race!" only if the two cars are on and they
            // are the same car (using comparison methods)

        // Loops and Iteration

        // Initializing the fibArray to the appropriate size
        // Arrays (NOT ARRAYLISTS) you MUST specify the size
        int[] fibArray = new int[10];

        // Fibonacci Sequence
        int first = 1;
        fibArray[0] = first;
        int second = 1;
        fibArray[1] = second;
//        System.out.println(first);
//        System.out.println(second);
        for(int i = 0; i < 8; i++){
            int next = first + second;
            fibArray[i + 2] = next;
            first = second;
            second = next;
            //System.out.println(next);
        }

        // Arrays and ArrayLists

        // ForEach Loop
        // Each iteration will have a specific item from the collection
        // stored in a local variable
        for(int num : fibArray){
            // If you DID NOT need to know the index values
            System.out.println(num);
        }

        for(int i = 0; i < fibArray.length; i++){
            System.out.println(fibArray[i]);
        }

        ArrayList<Car> myGarage = new ArrayList<>();
        String genericMake = "Make _ ";
        String genericModel = "Model _ ";

        for(int i = 0; i < 25; i++){
            Car carToAdd = new Car(genericMake + i, genericModel + i);
            myGarage.add(carToAdd); // Adds to the end of the ArrayList
            // myGarage.add(0, carToAdd); // Inserts into a specific location in the ArrayList
        }

        // Looking for a specific car
        // "Make _ 12"

        // Looking for a VERY specific car
        Car targetCar = new Car("Make _ 4", "Model _ 12");


        for(Car aCar : myGarage){

            if(aCar.getMake().equals("Make _ 12")){
                System.out.println("Found the car!");
            }

            if(aCar.equals(targetCar)){
                System.out.println("We found the VERY specific car!");
            }

        }

        for(int i = 0; i < myGarage.size(); i++){

            Car aCar = myGarage.get(i);

            if(aCar.getMake().equals("Make _ 12")){
                System.out.println("Found the car!");
            }

            if(aCar.equals(targetCar)){
                System.out.println("We found the VERY specific car!");
            }
        }

        // Other ArrayList methods
        myGarage.remove(0);
        /**
         * | 1 | 2 | 3 | 4 | 5|
         * | 2 | 3 | 4 | 5|
         */

        myGarage.set(0, new Car("Toyota", "Corolla"));
        // Keeps the size of the ArrayList the same
        // Changing what is stored at index 0

        // Indexed Loop
        // Garage Class Example (if there's time...)

        // Strings

        String name = "Mr. V";
        System.out.println(name.length());
        String subStringExample = name.substring(0,3); // Stores "Mr."
        // Returns the index of where the substring starts in the string
        // if it is found
        // Else it will return something negative
        if(name.indexOf("Mr.") >= 0){
            // Does my String contain another string
        }

    }
}
