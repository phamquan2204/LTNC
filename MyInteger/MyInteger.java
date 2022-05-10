package MyInteger;

public class MyInteger{
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public boolean isEven() {
        return (value % 2 == 0);
    }

    public boolean isOdd() {
        return (value % 2 == 1);
    }

    public boolean isPrime() {
        if (value < 1) return false;
        if (1 < value && value <= 3){
            return true;
        }
        if (value > 3){
            for (int i = 2; i < Math.sqrt(value); i++){
                if(value%i == 0){
                    return false;
                } else {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }
}