
// https://everybody.codes/event/2025/quests/2


// part 1
public class Main{

    // [X1,Y1] + [X2,Y2] = [X1 + X2, Y1 + Y2]
    private static int[] sum(int[] X, int[] Y){
        return new int[]{X[0]+Y[0], X[1]+Y[1]};
    }

    // [X1,Y1] * [X2,Y2] = [X1 * X2 - Y1 * Y2, X1 * Y2 + Y1 * X2]
    private static int[] mul(int[] X, int[] Y){
        return new int[]{X[0]*Y[0] - X[1]*Y[1], X[0]*Y[1] + X[1]*Y[0]};
    }

    // [X1,Y1] / [X2,Y2] = [X1 / X2, Y1 / Y2]
    private static int[] div(int[] X, int[] Y){
        return new int[]{X[0]/Y[0], X[1]/Y[1]};
    }

    public static void main(String[] args){

        //Begin by setting the result to   [0,0] . Then, complete three cycles of the following operations:
        //Multiply the result by itself.
        //Divide the result by  [10,10] .
        //Add  A  to the result.

        int[] A = {157,59};
        int[] R = new int[2];

        for(int i=0; i<3; i++){
            R = mul(R, R);
            R = div(R, new int[]{10, 10});
            R = sum(R, A);
        }
        
        for(int in: R) System.out.print(in+ " "); // 151617 868799 
    }
}



// part 2
public class Main{

    // [X1,Y1] + [X2,Y2] = [X1 + X2, Y1 + Y2]
    private static long[] sum(long[] X, long[] Y){
        return new long[]{X[0]+Y[0], X[1]+Y[1]};
    }

    // [X1,Y1] * [X2,Y2] = [X1 * X2 - Y1 * Y2, X1 * Y2 + Y1 * X2]
    private static long[] mul(long[] X, long[] Y){
        return new long[]{X[0]*Y[0] - X[1]*Y[1], X[0]*Y[1] + X[1]*Y[0]};
    }

    // [X1,Y1] / [X2,Y2] = [X1 / X2, Y1 / Y2]
    private static long[] div(long[] X, long[] Y){
        return new long[]{X[0]/Y[0], X[1]/Y[1]};
    }

    public static void main(String[] args){

        long[] A = {-21673,67997};
        long[] R = new long[2];
        int count = 0;

        for(int j=0; j<=1000; j+=10){
            for(int k=0; k<=1000; k+=10){

                long[] P = sum(A, new long[]{k, j});
                R = new long[2];

                for(int i=0; i<100; i++){
                    R = mul(R, R);
                    R = div(R, new long[]{100000L, 100000L});
                    R = sum(R, P);
                    if(R[0] > 1000000L || R[0] < -1000000L || R[1] > 1000000L || R[1] < -1000000L) break;
                }

                if(R[0] <= 1000000L && R[0] >= -1000000L && R[1] <= 1000000L && R[1] >= -1000000L) count++;
            }
        }
        
        System.out.println(count); // 1316

    }
}



// part 3
public class Main{

    // [X1,Y1] + [X2,Y2] = [X1 + X2, Y1 + Y2]
    private static long[] sum(long[] X, long[] Y){
        return new long[]{X[0]+Y[0], X[1]+Y[1]};
    }

    // [X1,Y1] * [X2,Y2] = [X1 * X2 - Y1 * Y2, X1 * Y2 + Y1 * X2]
    private static long[] mul(long[] X, long[] Y){
        return new long[]{X[0]*Y[0] - X[1]*Y[1], X[0]*Y[1] + X[1]*Y[0]};
    }

    // [X1,Y1] / [X2,Y2] = [X1 / X2, Y1 / Y2]
    private static long[] div(long[] X, long[] Y){
        return new long[]{X[0]/Y[0], X[1]/Y[1]};
    }

    public static void main(String[] args){

        long[] A = {-21673,67997};
        long[] R = new long[2];
        int count = 0;

        for(int j=0; j<=1000; j+=1){
            for(int k=0; k<=1000; k+=1){

                long[] P = sum(A, new long[]{k, j});
                R = new long[2];

                for(int i=0; i<100; i++){
                    R = mul(R, R);
                    R = div(R, new long[]{100000L, 100000L});
                    R = sum(R, P);
                    if(R[0] > 1000000L || R[0] < -1000000L || R[1] > 1000000L || R[1] < -1000000L) break;
                }

                if(R[0] <= 1000000L && R[0] >= -1000000L && R[1] <= 1000000L && R[1] >= -1000000L) count++;
            }
        }
        
        System.out.println(count); // 129213

    }
}