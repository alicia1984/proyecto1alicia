/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1alicia;
import java.util.Scanner;//esta libreria toma los datos que digita el usuario por consola 
//paso 1
/**
 *
 * @author LP 13
 */
public class EntradadeDatos {

public static void main(String[] args)
{
 //Aqui  estamos creando  el Objeto scanner - Paso 2 
    //Este objeto solo se crea una solo vez
Scanner sc = new Scanner(System.in);//se  crea  el  lector
//pedir  datos  al usuario paso3
System.out.println("Por favor ingrese su nombre");
//se  lee  el  nombre y  se  almacena - paso 4
String nombre = sc.nextLine();
//procesamos  los  datos del  usuario, en este caso,lo imprimimos - paso 5
System.out.println("Bienvenidos "+nombre+ "por favor digite la edad");
int edad = sc.nextInt();
System.out.println("Usted tiene"+edad+"años");
}
}
