class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length; //Row
        int n = board[0].length; //Column
        
        HashMap<Character,Integer> row = new HashMap<>();
        HashMap<Character,Integer> column = new HashMap<>();
        System.out.println("ROW");
        // Checking values row wise
        for(int i = 0; i < m; i++)
        {
            row = new HashMap<>();
            for(int j = 0; j<n; j++)
            {
                if(board[i][j] == '.'){continue;}
                System.out.println(board[i][j]);
                if(board[i][j] >= '1' && board[i][j] <= '9') //Checking if the digit is bw 0 and 9
                {
                    if(row.containsKey(board[i][j])){
                        System.out.println("Char " + board[i][j] + "appeared twice in row wise checking");
                        return false;
                    } //If row wise, one element occurs twice then false 
                    else
                    {
                        row.put(board[i][j],1);
                    }
                }
                else{
                    System.out.println("Char not a digit");
                    return false;
                }
            }
            System.out.println("Row " + i + " checked");
        }
        
        System.out.println("COLUMN");
        // Checking values column wise
        for(int i = 0; i < n; i++)
        {
            column = new HashMap<>();
            for(int j = 0; j<m; j++)
            {
                if(board[j][i] == '.'){continue;}
                System.out.println(board[j][i]);
                if(board[j][i] >= '1' && board[j][i] <= '9') //Checking if the digit is bw 0 and 9
                {
                    if(column.containsKey(board[j][i])){
                        System.out.println("Char " + board[j][i] + "appeared twice in column wise checking");
                        return false;
                    } //If column wise, one element occurs twice then false 
                    else
                    {
                        column.put(board[j][i],1);
                    }
                }
                else{
                    System.out.println("Char not a digit");
                    return false;
                }
            }
            System.out.println("Column " + i + " checked");
        }
        
        // 3X3 Grid checking
        for(int i = 0; i < 3; i++)
        {
            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            HashMap<Character,Integer> map3 = new HashMap<>();
            for(int j = i*3; j < i*3 + 3; j++)
            {
                for(int k = 0; k < 3; k++)
                {
                    if(board[j][k] == '.'){continue;}
                    if(board[j][k] >= '1' && board[j][k] <= '9')
                    {
                        if(map1.containsKey(board[j][k]))
                        {
                            System.out.println("Character" + board[j][k] + " found twice");
                            return false;
                        }
                        map1.put(board[j][k],1);
                    }
                    else
                    {
                        System.out.println("Character not a digit");
                        return false;
                    }
                }
                
                for(int k = 3; k < 6; k++)
                {
                    if(board[j][k] == '.'){continue;}
                    if(board[j][k] >= '1' && board[j][k] <= '9')
                    {
                        if(map2.containsKey(board[j][k]))
                        {
                            System.out.println("Character" + board[j][k] + " found twice");
                            return false;
                        }
                        map2.put(board[j][k],1);
                    }
                    else
                    {
                        System.out.println("Character not a digit");
                        return false;
                    }
                }
                
                for(int k = 6; k < 9; k++)
                {
                    if(board[j][k] == '.'){continue;}
                    if(board[j][k] >= '1' && board[j][k] <= '9')
                    {
                        if(map3.containsKey(board[j][k]))
                        {
                            System.out.println("Character" + board[j][k] + " found twice");
                            return false;
                        }
                        map3.put(board[j][k],1);
                    }
                    else
                    {
                        System.out.println("Character not a digit");
                        return false;
                    }
                }
            }
            System.out.println("Grid " + i + " checked");
        }
        
        return true;
        
    }
}