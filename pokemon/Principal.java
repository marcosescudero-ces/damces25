package Segundotrimestre.pokemon;

import java.util.Scanner;

public class Principal {
    static pokemonPOO pokemonelegido;
    static pokemonPOO pokemonrival;



    static int[] potenciapika= {50,40,80,15};
    static String[] ataquepika={"trueno","Rayo","Impactrueno","Curacion"};
    public static pokemonPOO pikachu= new pokemonPOO("Pikachu","Electrico",100,potenciapika,ataquepika,"amarillo");

    static int[] potenciasq= {45,30,70,25};
    static   String[] ataquesq={"Aqua jet","surf","Aquacola","Curacion"};
    public static   pokemonPOO squirtle = new pokemonPOO("Squirtle","Agua",100,potenciasq,ataquesq,"azul");

   static int[] potenciacha= {80,60,100,45};
    static String[] ataquecha={"Pulso dragón","Tajo","Llamarada","Ala dragón"};
  public static   pokemonPOO charizard = new pokemonPOO("charizard","fuego",100,potenciacha,ataquecha,"rojo");

    public static pokemonPOO[] arraypokemonelegir = {pikachu,squirtle,charizard};

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op=0;
        while (op!=4){
            imprime();
            op= sc.nextInt();
            sc.nextLine();


            if (op==1){
                jugar();
            }
            else if (op==2){
                inicial();
            }
            else if (op==3){
                informacion();
            }
            else if (op==4){
                combate();
            }
            else if (op==5){
                salir();
            }
        }

    }
    private static void imprime() {
        System.out.println("1- Jugar");
        System.out.println("2- Elige tu pokemon inicial");
        System.out.println("3- Informacion pokemon");
        System.out.println("4- Combate");
        System.out.println("5- salir");
    }
    private static void jugar(){

        System.out.println(" ██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗    ███████╗███████╗███╗   ███╗███████╗██████╗  █████╗ ██╗     ██████╗  █████╗ ");
        System.out.println("██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║    ██╔════╝██╔════╝████╗ ████║██╔════╝██╔══██╗██╔══██╗██║     ██╔══██╗██╔══██╗");
        System.out.println("██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║    █████╗  ███████╗██╔████╔██║█████╗  ██████╔╝███████║██║     ██║  ██║███████║");
        System.out.println("██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║    ██╔══╝  ╚════██║██║╚██╔╝██║██╔══╝  ██╔══██╗██╔══██║██║     ██║  ██║██╔══██║");
        System.out.println("██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║    ███████╗███████║██║ ╚═╝ ██║███████╗██║  ██║██║  ██║███████╗██████╔╝██║  ██║");
        System.out.println("╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝    ╚══════╝╚══════╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═════╝ ╚═╝  ╚═╝");

        System.out.println();
        System.out.println("                                            ╔══════════════════════════════════════╗");
        System.out.println("                                            ║                                      ║");
        System.out.println("                                            ║    ¡Bienvenido al mundo Pokémon!     ║");
        System.out.println("                                            ║    ¡Tu aventura comienza ahora!      ║");
        System.out.println("                                            ║                                      ║");
        System.out.println("                                            ║    Prepara tus Pokemon y explora     ║");
        System.out.println("                                            ║    la misteriosa región Kanto.       ║");
        System.out.println("                                            ║                                      ║");
        System.out.println("                                            ╚══════════════════════════════════════╝");
    }
    private static void inicial(){
        System.out.println("                                            ╔════════════════════════════════════════╗");
        System.out.println("                                            ║      ¡Elige tu Pokémon inicial!        ║");
        System.out.println("                                            ║                                        ║");
        System.out.println("                                            ║  1. Pikachu  2. Squirtle  3. Charizard ║");
        System.out.println("                                            ╚════════════════════════════════════════╝");


        int opciones = sc.nextInt();
        sc.nextLine();

        if(opciones==1){

            System.out.println("Has elegido a pikachu, Enhorabuena!!!");
            pokemonelegido=arraypokemonelegir[1];

            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠿⠟⠛⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⠁⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⡀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⢠⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⠤⠶⠶⠛⢻⣿⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⠴⠖⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⠟⠉⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⢀⣀⡤⠿⠶⠒⠒⠒⠒⠲⠶⠶⠶⢤⣀⣀⠀⠀⣀⣠⠶⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣀⡴⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢉⣽⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⠶⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠶⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣀⣠⡤⠶⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⠀⣠⣶⡶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣠⠤⠶⠶⠶⠶⠶⡷");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⣸⠁⢸⣿⣿⣀⣼⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡏⠉⣿⣶⡄⠀⠀⠀⠀⣿⠀⠀⠀⠀⣀⣠⠤⠶⠖⠋⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⣸⠇");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⡟⠀⠘⣿⣿⣿⡿⠏⠀⠀⢠⣤⡄⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⢿⣠⡴⠖⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡏⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢀⣼⠁⠀⠀⠀⠉⠉⠀⠀⠀⢀⣤⣍⣀⠀⠀⠀⠀⠀⠀⠉⠻⠿⠛⠉⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⣸⡏⠉⠳⣆⠀⠀⠘⢷⡶⣶⠛⠉⠈⠉⠳⠦⣄⣀⣤⠖⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡞⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⣿⠀⠀⠀⣹⡄⠀⠀⠀⣿⠋⠀⠀⠀⠀⠀⠀⠀⢸⠇⠀⠀⠀⠀⣶⠋⠁⠈⠙⢶⡀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠁⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⢸⣇⣀⣴⡟⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠙⠦⣄⣀⡴⠟⢰⠇⠀⠀⠀⠀⣶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠶⠟⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠻⣏⠁⠀⠀⠀⠀⠀⠀⢻⡄⠀⠀⠀⠀⠀⣴⠃⠀⠀⠀⠀⠀⠙⠦⣄⣀⡴⠟⠻⣄⠀⠀⠀⢹⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⡀⠀⠀⠀⠀⠀⠀⢳⣄⠀⠀⢀⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⣦⠀⠀⠀⠀⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⢦⣀⠀⠀⠀⠀⠀⠙⠳⠶⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠿⡇⠘⢷⡀⠀⠀⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠉⠳⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡴⠞⠁⠀⣿⠀⠀⠻⣄⠀⠀⠹⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⠉⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⢹⣦⠴⠞⠋⠀⠀⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠀⣀⣠⠶⠖⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⢀⣀⠀⠀⠀⠀⠀⢰⡏⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⢀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⠀⠘⣾⠋⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⣾⣿⣿⡄⢀⣴⠶⠛⠓⠶⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡇⣠⠶⠿⠷⠶⣄⣠⣾⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

        }else if (opciones==2){
            System.out.println("Has elegido a squirtle, Enhorabuena!!!");
            pokemonelegido=arraypokemonelegir[2];


            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⠤⠤⠤⠤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⠢⣄⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠁⠀⠀⠀⠀⢀⣀⡐⢄⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀⡜⠁⠀⣿⡌⠀⠀⠀⠀⠀⠀⠀⠀⠈⢆⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠀⠀⠀⠀⠀⠀⣸⣷⣤⣾⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠊⣼⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⢤⡀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⡜⣼⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⠉⠲⣄⣀⣼⡇⠀⠀⠀⠀⠀⠀⠻⠿⣿⣟⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠉⠉⠁⠀⡏⠑⠌⠓⢬⣧⠀⠀⠀⠀⠘⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠿⡀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠇⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠈⠉⠓⠒⠲⠤⢤⣀⠀⠂⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⢀⣠⠤⠖⠒⠒⠒⠦⢤⡀⠀⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀⠀⠈⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠲⠤⠤⠒⠋⢉⠟⠀⠀⠀⠀");
            System.out.println("⠀⠀⢀⡴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠙⢦⠀⠀⠀⢠⡞⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⠋⠀⠀⠀⠀⠀");
            System.out.println("⠀⣠⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢇⠀⢠⡟⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡏⠈⠑⠢⢤⣀⣀⠀⠀⠀⠀⢀⣀⡤⠖⠯⣀⠀⠀⠀⠀⠀⠀");
            System.out.println("⢀⡟⠀⠀⠀⠀⠠⠴⠤⣀⠀⠀⠀⠀⠀⢸⣠⡟⠀⠀⠀⠀⢹⣄⠀⠀⠀⠀⠀⠀⢀⣼⡁⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⢻⠀⠀⠀⠀⠀⠉⠢⣄⣀⡀⠀");
            System.out.println("⢸⡇⠀⠀⠀⠀⠀⠀⠀⠘⡆⠀⠀⠀⠀⢈⣿⡇⠀⠀⠀⠀⢸⠉⢢⣀⡀⢀⣀⣴⠟⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠀⠀⠀⠀⠀⠀⢇⡀");
            System.out.println("⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⢸⡇⣷⠀⠀⠀⢀⡞⠀⢰⠏⠉⠉⠁⢸⡀⠀⠀⠀⠈⠓⠶⠤⣤⣄⣀⣠⡤⠴⡇⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁");
            System.out.println("⠀⠹⣆⠀⠀⠀⠀⠀⢀⡼⠁⠀⠀⠀⠀⢸⠁⠸⡆⠀⣠⠞⠀⢀⡞⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⢸⠃⠀⠀⢰⣧⣀⣀⡀⠀⢀⣀⣠⠴⠃⠀");
            System.out.println("⠀⠀⠹⡓⠦⠤⠤⠖⠋⠀⠀⠀⠀⠀⠀⢸⠀⠀⠹⡴⠁⠀⢠⠞⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⣸⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠘⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢸⢁⡠⠴⢧⡀⠀⠀⠀⠀⣀⠔⠳⣄⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⢠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⣠⡿⠋⠀⠀⠀⠙⢦⣀⡠⠞⠁⠀⠀⠈⠙⠶⣤⣀⡀⣰⠃⠀⠀⣠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠙⢦⣀⠀⠀⠀⠀⠀⠀⣸⠏⠀⠀⠀⠀⠀⠀⠈⢻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣹⠋⠉⠉⣹⠏⠙⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠲⢤⣄⣀⣠⡏⠀⠀⠀⠀⠀⠀⠀⠀⠈⣇⠀⠀⠀⠀⠀⠀⠀⠀⡰⠃⢀⣤⠞⠁⠀⠀⠘⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡽⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⠶⠤⠤⠤⠤⠤⢤⣞⡥⠖⠋⠀⠀⠀⠀⠀⠀⢹⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠟⠒⠀⠀⠒⠒⠺⢯⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠃⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⠀⠀⠀⠀⢄⣈⠆⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⢄⡀⠀⠀⠀⠀⠀⠀⢀⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣄⠀⠀⠀⠀⢀⣠⠴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢇⣀⡤⠖⢄⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⠒⠒⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

        }else if (opciones==3){
            System.out.println("Has elegido a charizard, Enhorabuena!!!");
            pokemonelegido=arraypokemonelegir[3];



            System.out.println("                 .\"-,.__");
            System.out.println("                 `.     `.  ,");
            System.out.println("              .--'  .._,'\"-' `.");
            System.out.println("             .    .'         `'");
            System.out.println("             `.   /          ,'");
            System.out.println("               `  '--.   ,-\"'");
            System.out.println("                `\"`   |  \\");
            System.out.println("                   -. \\, |");
            System.out.println("                    `--Y.'      ___.");
            System.out.println("                         \\     L._, \\");
            System.out.println("               _.,        `.   <  <\\                _");
            System.out.println("             ,' '           `, `.   | \\            ( `");
            System.out.println("          ../, `.            `  |    .\\`.           \\ \\_");
            System.out.println("         ,' ,..  .           _.,'    ||\\l            )  '\".");
            System.out.println("        , ,'   \\           ,'.-.`-._,'  |           .  _._`.");
            System.out.println("      ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\");
            System.out.println("    .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.");
            System.out.println("    |  '          ..         `-...-\"  |  `-'      / /        . `.");
            System.out.println("    | /           |L__           |    |          / /          `. `.");
            System.out.println("   , /            .   .          |    |         / /             ` `");
            System.out.println("  / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\");
            System.out.println(" / .           \\\"`_/. `-_ \\_,.  ,'    +-` `-'  _,        ..,-.    \\`.");
            System.out.println(".  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\");
            System.out.println("' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`");
            System.out.println("|'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\");
            System.out.println("||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|");
            System.out.println("||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||");
            System.out.println("|| '              V      / /           `   | `   ,'   ,' '.    !  `. ||");
            System.out.println("||/            _,-------7 '              . |  `-'    l         /    `||");
            System.out.println(". |          ,' .-   ,' ||               | .-.        `.      .'     ||");
            System.out.println(" `'        ,'    `\".'    |               |    `.        '. -.'       `'");
            System.out.println("          /      ,'      |               |,'    \\-.._,.'/'");
            System.out.println("          .     /        .               .       \\    .''");
            System.out.println("        .`.    |         `.             /         :_,'.'");
            System.out.println("          \\ `...\\   _     ,'-.        .'         /_.-'");
            System.out.println("           `-.__ `,  `'   .  _.>----''.  _  __  /");
            System.out.println("                .'        /\"'          |  \"'   '_");
            System.out.println("               /_|.-'\\ ,\".             '.'`__'-( \\");
            System.out.println("                 / ,\"'\"\\,'               `/  `-.|\" mh");

        }
        System.out.println("Profesor: ¡Cuida bien de tu Pokémon! ¡Juntos enfrentarán muchas aventuras!");


    }
    private static void informacion(){
        System.out.println("                                            ╔════════════════════════════════════════╗");
        System.out.println("                                            ║                ¡Pokedex!               ║");
        System.out.println("                                            ║                                        ║");
        System.out.println("                                            ║  1. Pikachu  2. Squirtle  3. Charizard ║");
        System.out.println("                                            ╚════════════════════════════════════════╝");


        int info = sc.nextInt();
        sc.nextLine();



        if (info==1){
            System.out.println("Nombre: " +pikachu.getNombre());
            System.out.println("Tipo: " +pikachu.getTipo());
            System.out.println("Color: " +pikachu.getColor());
            System.out.println("Vida: " +pikachu.getVida());
            System.out.println( pikachu.getAtaque()[0] +": " +pikachu.getPotencia()[0]);
            System.out.println( pikachu.getAtaque()[1] +": " +pikachu.getPotencia()[1]);
            System.out.println( pikachu.getAtaque()[2] +": " +pikachu.getPotencia()[2]);
            System.out.println( pikachu.getAtaque()[3] +": " +pikachu.getPotencia()[3]);




        }
        else if (info==2){
            System.out.println("Nombre: " +squirtle.getNombre());
            System.out.println("Tipo: " +squirtle.getTipo());
            System.out.println("Color: " +squirtle.getColor());
            System.out.println("Vida: " +squirtle.getVida());
            System.out.println( squirtle.getAtaque()[0] +": " +squirtle.getPotencia()[0]);
            System.out.println( squirtle.getAtaque()[1] +": " +squirtle.getPotencia()[1]);
            System.out.println( squirtle.getAtaque()[2] +": " +squirtle.getPotencia()[2]);
            System.out.println( squirtle.getAtaque()[3] +": " +squirtle.getPotencia()[3]);

        }
        else if (info==3){
            System.out.println("Nombre: " +charizard.getNombre());
            System.out.println("Tipo: " +charizard.getTipo());
            System.out.println("Color: " +charizard.getColor());
            System.out.println("Vida: " +charizard.getVida());
            System.out.println( charizard.getAtaque()[0] +": " +charizard.getPotencia()[0]);
            System.out.println( charizard.getAtaque()[1] +": " +charizard.getPotencia()[1]);
            System.out.println( charizard.getAtaque()[2] +": " +charizard.getPotencia()[2]);
            System.out.println( charizard.getAtaque()[3] +": " +charizard.getPotencia()[3]);

        }

    }
    private static void combate(){
        int aleatorio = (int) (Math.random()*3);
        pokemonrival=arraypokemonelegir[aleatorio];
        System.out.println("¡Comienza el combate entre " + pokemonelegido.getNombre() + " y " + pokemonrival.getNombre() + "!");
        int accion = sc.nextInt();
        sc.nextLine();

    }
    private static void salir(){
        System.out.println("Has salido del juego, vuelve pronto!!!");
    }

}
