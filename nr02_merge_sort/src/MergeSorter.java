public class MergeSorter {
    
    //idea! use recursion

    public void sortNumbers(int[] num){
        
        int n = 1;
        
        do {
            //set new section's length 
            n *= 2;

            //loop through all sections of length 'n'
            for (int i=0; i*n < num.length; i++) {
                
                //divide section into 2 midsection
                //using 'max' to consider 'out of the bounds' exceptions
                int idx1 = i*n;
                int max = Math.min(idx1 + n - 1, num.length - 1);
                int idx2 = Math.min(i*n + n/2, max);
                
                //compare elements from the first midsection to second midsection
                //swap elements if not ordered correctly
                do {
                    
                    if (num[idx1] > num[idx2]) {
                        //swap
                        int temp = num[idx1];
                        num[idx1] = num[idx2];
                        num[idx2] = temp;

                        //iterate both
                        idx1++;
                        idx2 = Math.min(idx2 + 1, max);
                    } else {
                        //iterate first
                        idx1++;
                    }

                } while (idx1 < idx2);

            }

        } while (n < num.length);
    }

}
