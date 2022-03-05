
public class OddNumber2 {
	public static int main(String[] args)
	{
         int a[] = {7, 2, 3, 54, 1, 6, 7, 7};
         System.out.print("Before Sorting:");
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] + "\t");
         }
         System.out.print("\nAfter Sorting:");
         //sorting the elements
         for (int i = 0; i < a.length; i++) {
             for (int j = i; j < a.length; j++) {
                 if (a[i] > a[j]) {
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }

             }
         }

         //After sorting
         for (int i = 0; i < a.length; i++) {
             System.out.print(a[i] + "\t");
         }
         System.out.print("\nAfter removing duplicates:");
         int b = 0;
         a[b] = a[0];
         for (int i = 0; i < a.length; i++) {
             if (a[b] != a[i]) {
                 b++;
                 a[b] = a[i];
             }
         }
         for (int i = 0; i <= b; i++) {
             System.out.print(a[i] + "\t");
         }
         return -1;
     }

}
