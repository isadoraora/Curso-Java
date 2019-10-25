/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixevolution;

/**
 *
 * @author isa.mdeo
 */
public class MatrixEvolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizFixa[][]= new int [10][10];
            for(int i=0; i<matrizFixa.length;i++){
                for(int j=0;j<matrizFixa.length;j++){
                    matrizFixa[i][j]= (int)(Math.random()*100+1);
                }
            }
            System.out.println("\n\n");
            for (int i=0; i<matrizFixa.length;i++){
                for(int j=0; j<matrizFixa.length;j++){
                    if(i==j)
                        System.out.println(matrizFixa[i][j]);
                }
            }
                System.out.println("\n\n");
                for(int i=0; i<matrizFixa.length;i++){
                    for (int j=0; j<matrizFixa.length; j++){
                        if(i>j)
                            System.out.println(matrizFixa[i][j]);
                        
                            
                    }
                }
                System.out.println("\n\n");
                
                double produto =1;
        for (int[] matrizFixa1 : matrizFixa) {
            produto *= matrizFixa1[9];
        }
                System.out.println("Produto: "+produto);
                
                int linha=0,coluna=0,num=0;
                
                for(int i=0;i<matrizFixa.length;i++){
                    for(int j=0;j<matrizFixa.length;j++){
                        
                        if((i==0) && (j==0))
                                num=matrizFixa[0][0];
                                
                                if(matrizFixa[i][j]>num){
                                    linha=i;
                                    coluna=j;
                                    num=matrizFixa[i][j];
                                }
                    }
                }
                System.out.println(linha+" "+coluna+" "+num);
                
    }
    
}
