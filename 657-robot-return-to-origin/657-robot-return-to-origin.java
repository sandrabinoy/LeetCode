class Solution {
    public boolean judgeCircle(String moves) {
        
        int UD = 0;
        int LR = 0;
        for (int i = 0; i < moves.length(); i++) {
            
            switch (moves.charAt(i)) {
                case 'U':
                    UD++;
                    break;
                case 'D':
                    UD--;
                    break;
                case 'R':
                    LR++;
                    break;
                default:
                    LR--;
                    break;
            }
            
        }
        
        return UD==0 && LR==0;
        
    }
}