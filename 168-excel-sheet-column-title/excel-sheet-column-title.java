class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            columnTitle.insert(0, (char) (remainder + 'A'));
            columnNumber /= 26;
        }
        
        return columnTitle.toString();
    }
}
