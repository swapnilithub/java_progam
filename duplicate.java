public class duplicate {
        public static void main(String argu[]) {
       
         String str = "w3schools";
         int cnt = 0;
         char[] inp = str.toCharArray();
         System.out.println("Duplicate Characters are:"); //written by me
         for (int i = 0; i < str.length(); i++) {
          for (int j = i + 1; j < str.length(); j++) {
           if (inp[i] == inp[j]) {
            System.out.println(inp[j]);
            cnt++;
            break;
           }
          }
         }
        }
       }
