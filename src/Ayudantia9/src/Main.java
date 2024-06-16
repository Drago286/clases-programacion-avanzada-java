public class Main {
    public static void main(String[] args) {

        int [] vector1 = {5,3,5,2,9};
        int [] vector2 = {-1,23,5,2,9};
        int [] vector3 = {1,3,6,8,9};
        int [] vector4 = {1};

        System.out.println("Verficacion vector1: "+ verficarOrdenVector(vector1,0));
        System.out.println("Verficacion vector2: "+ verficarOrdenVector(vector2,0));
        System.out.println("Verficacion vector3: "+ verficarOrdenVector(vector3,0));
        System.out.println("Verficacion vector4: "+ verficarOrdenVector(vector4,0));

        System.out.println("Suma numero pares del vector 3: "+sumarPares(vector3,0,vector3.length-1));

    }


    public static boolean verficarOrdenVector(int[] vector, int indice){

        if (indice == vector.length-1){
            return true;
        }

        if(vector[indice] >= 0 && vector[indice] <= vector[indice+1]){
            return verficarOrdenVector(vector, indice+1);
        }else {
            return false;
        }
    }
    public static int sumarPares(int [] vector, int i, int f){

        if (i>f){
            return 0;
        }
        int mitad = (i+f)/2;

        int sumaIzquierda=sumarPares(vector,i,mitad-1);
        int sumaDerecha=sumarPares(vector,mitad+1,f);

        int sumaActual = 0;

        if (vector[mitad]%2 == 0 ){
            sumaActual = vector[mitad];
        }

        return sumaIzquierda + sumaDerecha + sumaActual;

    }
}
