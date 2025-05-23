package POO_ConexionNico;



public class edadesArray {
    public static void ran (int [] A, int min,int max){

        for(int p=0;p<A.length;p++){
            A[p]=(int)(Math.random()*(max-min+1))+ min;
        }

    }

    public static void main (String []args){

        int[] aBono= new int[6];
        int p=0;
        for(p=0; p <aBono.length;p++){
            aBono[p]=0;
        }

        for(p=0; p<aBono.length;p++){
            System.out.print(aBono[p]+",");
            
        }
        System.out.println();

        for( p=0; p<aBono.length;p++){
            aBono[p]=(int)(Math.random()*49)+1;
            System.out.print(aBono[p]+",");
        }
    }
}
