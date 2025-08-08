package Classes;


public class Matriz {
    private int a11, a12, a21, a22;
    
    public static int matrizDeterminanteCalcular(int a11, int a12, int a21, int a22){
        int det;
        det = (a11 * a22) - (a12 * a21);
        return det;
    }
    
    public static int[] matrizInversaCalcular(int a11, int a12, int a21, int a22){
        int inverso[] = new int[4];
        int d = matrizDeterminanteCalcular(a11,a12,a21,a22);
        
        if(d != 0){ //por enquanto, apenas operações em que DET = +- 1 estão funcionando
        inverso[0] = a22 * (1/d);
        inverso[1] = (a12 * -1) * (1/d);
        inverso[2] = a21 * -1 * (1/d);
        inverso[3] = a11 * (1/d);
        return inverso;
        }
        
        else
        return null;
    }
}
