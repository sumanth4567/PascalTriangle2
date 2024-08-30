import java.util.*;
class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long currentElement = 1;
        row.add((int)currentElement);
    
        for(int i=1;i<=rowIndex;i++){
            currentElement =currentElement *(rowIndex-i+1)/i;
            row.add((int)currentElement);
        }
        return row;
    }
    // main class
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row index :");
        int rowIndex = sc.nextInt();
        PascalsTriangle2 ps2 = new PascalsTriangle2();
        System.out.println(ps2.getRow(rowIndex));
    }
    
}
