package Assigment.com.creatio.crm.language.basics;



public class array {
    public static void main(String[] args) {
        int[] a = {12, 34, 11,  36, 87,98,83}; // Initialize array

        for (int i = 0; i < a.length - 1; i++){ // Loop until second last element
        	for(int j = 0;j<a.length - 1; j++) {
            if (a[i] > a[i + 1] || a[i+1] > a[i+2] || a[i+2]>a[i+3] || a[i+3]>a[i+4] || a[i+4]>a[i+5]) { // Compare current and next element
                a[j] = a[i];
                i=i++;
            }
                System.out.println("Element in the array: " + a[j]); // Print the stored value
                j++; // Increment j after storing the element
            }
        }
    }
}