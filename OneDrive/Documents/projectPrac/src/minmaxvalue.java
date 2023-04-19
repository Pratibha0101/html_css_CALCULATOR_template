public class minmaxvalue {
    public static void main(String[] args) {
       int a[] = new int[]{23, 43, 1, 25, 45, 67};
       int min = a[0];
       int max = a[0];
       for(int i = 0; i< a.length; i++) {
          if(a[i] > max)max = a[i];
          else if (a[i] < min)min = a[i];
       }
       System.out.println("Largest Number is : " + max);
       System.out.println("Smallest Number is : " + min);
    }
 }