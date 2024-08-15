class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int[gain.length+1];
        altitude[0]=0;

        for (int i=0; i<gain.length-1; i++){
            altitude[i+1] = altitude[i] + gain[i];
        }
        int highAl = altitude[0];
        for (int i=0; i<altitude.length-1; i++){
            if (highAl < altitude[i+1]) highAl = altitude[i+1];
        }
        return highAl;
    }
}