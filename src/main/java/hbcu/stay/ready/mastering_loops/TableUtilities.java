package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;
        String table = "";
        for(int i = 1; i <= tableSize; i++){
            table += getMultiplicationRow(i, tableSize) + "\n";
        }
        return table;
    }
    private static String getMultiplicationRow(int row, int tableSize){
        String table = "";
        for(int i = 1; i <= tableSize;i++){
            table += String.format("%3s |", i*row);
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        String table = "";
        for(int i = 1; i <= tableSize; i++){
            table += getMultiplicationRow(i, tableSize) + "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i = 1; i <= tableSize; i++){
            table += getMultiplicationRow(i, tableSize) + "\n";
        }
        return table;
    }
}
