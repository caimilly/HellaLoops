package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String response = "";
        for(int x = start; x < stop;x++){
            if (x % 2 == 0){
                response +="" + x;
            }
        }
        return response;
    }


    public static String getOddNumbers(int start, int stop) {
        String response = "";
        for(int x = start; x < stop;x++){
            if (x % 2 != 0){
                response +="" + x;
            }
        }
        return response;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String response = "";
        for(Integer i = start; i < stop; i+= step){
            response += (int)Math.pow(i,2);
        }
        return response;
    }

    public static String getRange(int stop) {
        String response = "";
        for(int x=0; x<stop;x++){
            response +=""+x;
        }
        return response;
    }

    public static String getRange(int start, int stop) {
        String response = "";
        for(int x = start; x < stop;x++){
            response +="" + x;
        }
        return response;
    }


    public static String getRange(int start, int stop, int step) {
        String response = "";
        for(Integer i = start; i < stop; i+= step){
            response += ""+i;
        }
        return response;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String response = "";
        for(Integer i = start; i < stop; i+= step){
            response += (int)Math.pow(i,exponent);
        }
        return response;
    }
}