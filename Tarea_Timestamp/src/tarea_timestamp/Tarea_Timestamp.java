package tarea_timestamp;

import java.util.Scanner;

public class Tarea_Timestamp {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        boolean bisiesto = false;
        boolean verify = true;
        String mes = "";
        String dia = "";
        String hora = "";
        String minuto = "";
        String segundo = "";
        
        System.out.println("Ingrese la fecha a continuacion...");
        System.out.print("Año: ");
        String año = leer.next();
        int year = Integer.parseInt(año);
        if((year % 4 == 0) && (year % 4 == 0 && year % 100 != 0)){
            bisiesto = true;
        }
        while(verify){
            System.out.print("Mes: ");
            String month = leer.next();
            int checkMonth = Integer.parseInt(month);
            if(checkMonth > 12 || checkMonth < 1){
                System.out.println("Mes no valido, intente de nuevo");
            }else{
                System.out.print("Ingrese dia: ");
                String day = leer.next();
                int checkDay = Integer.parseInt(day);
                if((checkMonth == 1 || checkMonth == 3 || checkMonth == 5 || checkMonth == 7 || checkMonth == 8 || checkMonth == 10 || checkMonth == 12) && checkDay > 31 || checkDay < 1){
                    System.out.println("Dia no valido, intente de nuevo");
                }else if((checkMonth == 4 || checkMonth == 6 || checkMonth == 9 || checkMonth == 11) && checkDay > 30 || checkDay < 1){
                    System.out.println("Dia no valido, intente de nuevo");
                }else if(bisiesto == true && checkMonth == 2 && checkDay > 29 || checkDay < 1){
                    System.out.println("Dia no valido, intente de nuevo");
                }else if(bisiesto == false && checkMonth == 2 && checkDay > 28 || checkDay < 1){
                    System.out.println("Dia no valido, intente de nuevo");
                }else{
                    verify = false;
                    if(month.length() < 2){
                        mes = "0" + month;
                    }else{
                        mes = month;
                    }
                    if(day.length() < 2){
                        dia = "0" + day;
                    }else{
                        dia = day;
                    }
                }
            }
        }
        verify = true;
        while(verify){
            System.out.print("Hora: ");
            hora = leer.next();
            int hour = Integer.parseInt(hora);
            if(hour > 24 || hour < 0){
                System.out.println("Hora no valida, intente de nuevo");
            }else{
                if(hora.length() < 2){
                    hora = "0" + hora;
                }
                verify = false;
            }
        }
        verify = true;
        while(verify){
            System.out.print("Minuto: ");
            minuto = leer.next();
            int minute = Integer.parseInt(minuto);
            if(minute > 59 || minute < 0){
                System.out.println("Hora no valida, intente de nuevo");
            }else{
                if(minuto.length() < 2){
                    minuto = "0" + minuto;
                }
                verify = false;
            }
        }
        verify = true;
        while(verify){
            System.out.print("Segundo: ");
            segundo = leer.next();
            int second = Integer.parseInt(segundo);
            if(second > 59 || second < 0){
                System.out.println("Hora no valida, intente de nuevo");
            }else{
                if(segundo.length() < 2){
                    segundo = "0" + segundo;
                }
                verify = false;
            }
        }
        
        Timestamp muestraVacio = new Timestamp();
        System.out.println("\nConstructor vacio...");
        System.out.println(muestraVacio.toStringEmpty());
        
        Timestamp muestraFecha = new Timestamp();
        System.out.println("\nConstructor solo con atributos de fecha...");
        muestraFecha.setAño(año);
        muestraFecha.setMes(mes);
        muestraFecha.setDia(dia);
        System.out.println(muestraFecha.toStringDate());
        
        Timestamp muestraTodo = new Timestamp();
        System.out.println("\nConstructor con todos los atributos...");
        muestraTodo.setAño(año);
        muestraTodo.setMes(mes);
        muestraTodo.setDia(dia);
        muestraTodo.setHora(hora);
        muestraTodo.setMinuto(minuto);
        muestraTodo.setSegundo(segundo);
        System.out.println(muestraTodo.toString());
        
        
    }
    
}
