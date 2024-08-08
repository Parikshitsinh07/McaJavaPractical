public class MyClass<T extends Comparable<T>> {

    // Generic method to find the maximum value in an array
    public T findMaximum(T[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }

        T max = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i]; 
            }
        }

        return max;
    }

    public static void main(String[] args) {
       
        Integer[] intArray = {5, 10, 7, 3, 8};
        MyClass<Integer> intObject = new MyClass<>();
        Integer maxInteger = intObject.findMaximum(intArray);
        System.out.println("Maximum Integer Value: " + maxInteger);

   
        Character[] charArray = {'a', 'z', 'c', 'f', 'k'};
        MyClass<Character> charObject = new MyClass<>();
        Character maxCharacter = charObject.findMaximum(charArray);
        System.out.println("Maximum Character Value: " + maxCharacter);
		

        Double[] doubleArray = {2.5, 8.1, 5.3, 10.7, 4.2};
        MyClass<Double> doubleObject = new MyClass<>();
        Double maxDouble = doubleObject.findMaximum(doubleArray);
        System.out.println("Maximum Double Value: " + maxDouble);

     
        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        MyClass<String> stringObject = new MyClass<>();
        String maxString = stringObject.findMaximum(stringArray);
        System.out.println("Maximum String Value: " + maxString);
    }
}
