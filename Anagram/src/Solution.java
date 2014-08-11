import java.io.*;

class Solution {
    
	String w1, w2;
	
	public Solution(String s1, String s2){
		w1 = s1;
		w2 = s2;
	}
	
	
    public static void main(String args[] ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] t;
        
        t = reader.readLine().split(" ");
        
        Solution ss = new Solution(t[0],t[1]);
        Solution so = new Solution(t[2],t[3]);
        
        // Couple 1
        System.out.println(ss.w1); 
        System.out.println(ss.w2);
        // Couple 2
        System.out.println(so.w1); 
        System.out.println(so.w2);
        
        
        int[] t0, t1, t2, t3;
        // Anagram testing 2 first words
        t0 = ss.stringToTab(ss.w1);
        t1 = ss.stringToTab(ss.w2);
        ss.printTab(t0);
        ss.printTab(t1);

        // Anagram testing 2 next words
        t2 = so.stringToTab(so.w1);
        t3 = so.stringToTab(so.w2);
        so.printTab(t2);
        so.printTab(t3);
        
    }
    
    // Put a string into a char tab
    public int[] stringToTab(String s1){
    	int[] res = new int[52];
    	int ascii;
    	int i;
    	
    	// Initialisation
    	for(i=0; i<52; i++)
    		res[i] = 0;
    	// Initialisation end
    	
    	// ASCII code for 'a' is 97
    	for(i=0; i<s1.length(); i++){
    		ascii = s1.charAt(i)-'A';
    		// Remove the 6 characters between upper and lower case
    		if(ascii >25)
    			ascii-=6;
    		res[ascii]++;
    	}	
    	return res;
    }
    
    // Display function
    public void printTab(int[] t){
    	int i;
    	
    	// ASCII characters
    	for(i=0; i<26; i++)
    		System.out.print((char) (i+'A')+" ");
    	for(i=0; i<26; i++)
    		System.out.print((char) (i+'a')+" ");
    	
    	// Jump a line
    	System.out.println();
    	
    	// Number of occurrences
    	for(i=0; i<52; i++)
    		System.out.print(t[i]+" ");
    	
    	// Jump 2 lines
    	System.out.print("\n\n");
    	
    }
    
}
