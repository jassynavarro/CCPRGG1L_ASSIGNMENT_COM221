public class Exercise {
    public static void main(String[] args) throws Exception {
  
        int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
  
        // PATTERN 1
        System.out.println("1. SUM OF PATTERN 1");
        
        int total = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 0) {
                total += mdArray[i][j];
                }
            }
        } System.out.println("SUM OF PATTERN 1: " + total);



        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        
        int total2 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 0) {
                total2 += mdArray[j][i];
                }
            }
        } System.out.println("SUM OF PATTERN 2: " + total2);


        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");
        
        int total3 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 0 || j == 0) {
                total3 += mdArray[i][j];
                }
            }
        } System.out.println("SUM OF PATTERN 3: " + total3);

        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");
        
        int total4 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 0 && j == 0) || (i == 3 && j == 3 ) || (i == 0 && j == 3) || (i == 3 && j == 0)) {
                total4 += mdArray[i][j];
                }
            }
        } System.out.println("SUM OF PATTERN 4: " + total4);

        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");
      
        int total5 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 1 && j == 1) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 2)) {
                total5 += mdArray[i][j];
                }
            }
        } System.out.println("SUM OF PATTERN 5: " + total5);

        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");

        int total6 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 0 && j == 0) || (i == 3 && j == 3 ) || (i == 0 && j == 3) || (i == 3 && j == 0) || (i == 1 && j == 1) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 2 && j == 2)) {
                total6 += mdArray[i][j];
                }   
            }
        } System.out.println("SUM OF PATTERN 6: " + total6);
    }
}
