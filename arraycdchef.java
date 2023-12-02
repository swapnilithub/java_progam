
    import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class arraycdchef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for (int i=0;i<T ;i++ ){ 
	int done = in.nextInt();
	int[] arr = new int[done];
	for(int k=0;k<done;k++){
		      arr[k]=in.nextInt();
		  }
		  boolean isNonDecreasing = true;
            for (int j = 1; j < done; j++) {
                if (arr[j] < arr[j - 1]) {
                    isNonDecreasing = false;
                    break;
                }
            }

            if (isNonDecreasing) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            
		  
		}
		}	        
	}
}


