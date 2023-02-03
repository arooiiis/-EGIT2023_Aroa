
public class Persona {
    final char SEXOHOMBRE = 'H';
    final char SEXOMUJER = 'M';
    
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    Persona(){
        this.nombre =  "";
        this.edad = 0;
        this.generarDNI();
        this.sexo = SEXOMUJER;
        this.peso = 0;
        this.altura = 0;
    }
    
    Persona(String nombre, int edad, char sexo){
        this.nombre =  nombre;
        this.edad = edad;
        this.generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }
    
    double getIMC(){
        double imc = this.peso/(this.altura*this.altura);
        return imc;
    }
    
    int getPesoCorrecto(){
        int peso_correcto = 1;
        double imc = this.getIMC();
        
        if(imc >= 20 && imc <= 25){
            peso_correcto = 0;
        }else if(imc < 20){
            peso_correcto = -1;
        }
        
        return peso_correcto;
    }
    
    boolean esMayorDeEdad(){
        boolean mayor_edad = false;
        
        if(this.edad >= 18){
            mayor_edad = true;
        }
        
        return mayor_edad;
    }
    private void generarDNI(){
        String dni = "";
        
        //calcular los 8 numeros aleatorios
        for(int i = 0; i < 8; i++){
            int numero = (int) Math.floor(Math.random()*(9-0+1)+0);
            dni = dni + numero;
        }
        
        //pasar el string a numero
        int numero_dni = Integer.parseInt(dni);
        //calcular la letra
        int resto_dni = numero_dni % 23;
        char[] letras_dni = {'T','R','W','A','G','M','Y','F','P','P','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char letra_dni = letras_dni[resto_dni];
        
        //aÃ±adir la letra
        dni = dni + letra_dni;
        this.DNI = dni;
    }
    
    char comprobarSexo(char sexo){
        if((sexo == SEXOHOMBRE) || (sexo == SEXOMUJER)){
            return sexo;
        }else{
            return SEXOMUJER;
        }
    }
    public String toString(){
        String cadena;
        String cadena_sexo;
        cadena = this.nombre + " " + this.edad + " " + this.DNI + " " + this.sexo;
        return cadena;
    }
}

