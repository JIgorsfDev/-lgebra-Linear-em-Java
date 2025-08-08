package Main;
//pretendo implementar uma interface gráfica e mais funcionalidades em breve, essa é apenas uma versão inicial
import Classes.Matriz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int el[] = new int[4];
        int opcao;
        Scanner sc = new Scanner(System.in);
        
        try{ //no momento, apenas serão aceitas matrizes 2 X 2
        
        System.out.print("Defina o A11: ");
        el[0] = sc.nextInt();
        System.out.print("Defina o A12: ");
        el[1] = sc.nextInt();
        System.out.print("Defina o A21: ");
        el[2] = sc.nextInt();
        System.out.print("Defina o A22: ");
        el[3] = sc.nextInt();
        
        do{
            System.out.print("\n1-Exibir Matriz.\n2-Exibir Diagonais.\n3-Calcular Determinante.\n4-Exibir Matriz Inversa.\n0-Sair.\nSelecione uma opção: ");
            opcao = sc.nextInt();
            
            if(opcao != 0){
             switch(opcao){
                 case 1: System.out.println("|" + el[0] + " " + el[1] + "|\n|" + el[2] + " " + el[3] + "|"); break;
                 case 2: System.out.println("Diagonal Principal: " + el[0] + " " + el[3]); System.out.println("Diagonal Secundária: " + el[1] + " "+ el[2]); break;
                 case 3:
                     Matriz d = new Matriz();
                     int deter;
                     deter = d.matrizDeterminanteCalcular(el[0], el[1], el[2], el[3]);
                     System.out.println("Determinante: " + deter);
                     break;
                 case 4: 
                     int i[] = new int[4];
                     Matriz m = new Matriz();
                     i = m.matrizInversaCalcular(el[0], el[1], el[2], el[3]);
                     System.out.println("|" + i[0] + " " + i[1] + "|\n|" + i[2] + " " + i[3] + "|");
                     break;
                 default: System.out.println("Nice Try, fella!"); break;
             }
            }
        }while(opcao != 0);
       }  
        catch(Exception error){
            System.out.println("Erro!" + error.toString());
        }
        sc.close();
   }
}
