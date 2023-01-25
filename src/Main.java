public class Main {
    public static void main(String[] args) {
        //positivos(-12);
        //bucle();
        //doWhile();
        //bucleFor();
        estructuraSwitch("verano");

    }

    public static void positivos(int numero){
        if(numero == 0){
            System.out.println("El numero ingresado es 0");
        }
        else if(numero > 0 ){
            System.out.println("El numero "+numero+" es positivo");
        }else{
            System.out.println("El numero "+numero+" es negativo");
        }
    }

    public static void bucle(){
        int numeroWhile = 1;
        while(numeroWhile < 4){
            System.out.println("El bucle esta en la ejecucion "+numeroWhile);
            numeroWhile++;
        }
    }

    public static void doWhile(){
        int numeroWhile = 1;
        do{
            System.out.println("Mensaje dentro de un do while");
        }while(numeroWhile < 1);
    }

    public static void bucleFor(){

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Mensaje desde un ciclo for, en la iteracion "+numeroFor);
        }
    }

    public static void estructuraSwitch(String estacion){
        switch (estacion){
            case "verano":
                System.out.println("En este momento te encuentras en la estacion verano");
                break;
            case "invierno":
                System.out.println("En este momento te encuentras en la estacion invierno");
                break;
            case "otoño":
                System.out.println("En este momento te encuentras en la estacion otoño");
                break;
            case "primavera":
                System.out.println("En este momento te encuentras en la estacion primavera");
                break;
            default:
                System.out.println("Revisa bien la estacion ingresada");
        }
    }

}