package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String response = "";
        for (int i = 1; i < numberOfRows; i++) {
            for (int j = 0; j < i; j++) {
                response += "*";
            }
            response += "\n";
        }
        return response;
    }

    public static String getRow(int numberOfStars) {
        String response = "";
        int x = 0;
        while (x < numberOfStars) {
            response += "*";
            x++;
        }
        return response;
    }

    public static String getSmallTriangle() {
        String response = "";
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                response += "*";
            }
            response += "\n";
        }
        return response;
    }

    public static String getLargeTriangle() {
        String response = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                response += "*";
            }
            response += "\n";
        }
        return response;
    }
}