package Data;

import org.w3c.dom.xpath.XPathResult;

import javax.swing.JOptionPane;
import java.sql.SQLOutput;
//                                                                                           SEMANA 2
public class Main {

    public static void main(String[] args) {
        // write your code here
        String nombreDeMicrofono = "AT2020";
        String microfono2 = "BlueYeti";

        if (microfono2 == "BlueYeti") {
            System.out.println("Este micrófono sirve para podcast");
        }

        //Operadores relacionales == Es igual ==> <== != > <


        Integer prueba = 15;
        if (prueba == 15) {
            System.out.println("El número es igual a 15");
        }

        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nota: "));
        if (nota >= 80) {
           JOptionPane.showMessageDialog(null, "El estudiante tiene acceso a carreras");
        }else{
            JOptionPane.showMessageDialog(null,"El estudiante no Aprobo");
        }

        int numero = 25;
        int elSegundoNumero = 31;
        if (numero == 25 && elSegundoNumero ==30){ // Verdadero Falso  || Verdadero and &&
            System.out.println("los numeros son iguales");
        }

        int provincia;
        provincia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su provincia: "));
        if (provincia == 1){
            JOptionPane.showMessageDialog(null, "Su provincia es San José. ");
        }else if (provincia == 2){
            JOptionPane.showMessageDialog(null, "Su provincia es Alajuela. ");
        }else if (provincia == 3){
            JOptionPane.showMessageDialog(null, "Su provincia es Heredia. ");
        }else if (provincia == 4){
            JOptionPane.showMessageDialog(null, "Su provincia es Cartago. ");
        }else if (provincia == 5){
            JOptionPane.showMessageDialog(null, "Su provincia es Guanacaste. ");
        }else if (provincia == 6){
            JOptionPane.showMessageDialog(null, "Su provincia es Limón. ");
        }else if (provincia == 7){
            JOptionPane.showMessageDialog(null, "Su provincia es Puntarenas. ");
        }

        int casa;
        casa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la casa: "));
        if (casa % 2 == 0){
            System.out.println("Su casa es la número" + casa + "y los impuestos se pagan trimestralmente");
        }else if(casa % 3 == 0){
            System.out.println("Los impuestos se pagan semestralmente");
        }


        /*
        if (dia == 1){
            JOptionPane.showMessageDialog(null, "Es lunes. ");
        }else if (dia == 2) {
            JOptionPane.showMessageDialog(null, "Es martes. ");
        }else if (dia == 3) {
            JOptionPane.showMessageDialog(null, "Es miércoles. ");
        }else if (dia == 4) {
            JOptionPane.showMessageDialog(null, "Es jueves. ");
        }else if (dia == 5) {
            JOptionPane.showMessageDialog(null, "Es viernes. ");
        }else if (dia == 6) {
            JOptionPane.showMessageDialog(null, "Es sábado. ");
        }else if (dia == 7) {
            JOptionPane.showMessageDialog(null, "Es domingo. ");
        }
        if (dia < 6){
            JOptionPane.showMessageDialog(null, "Es un día laboral. ");
        }else if(dia > 5){
            JOptionPane.showMessageDialog(null, "No es un día laboral. ");
        } */

        int dia;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia de la semana: \n1- Domingo. \n2- Lunes. \n3- Martes. \n4- Miercoles." +
                "\n5- Jueves. \n6- Viernes. \n7- Sabado."));

        switch (dia){
            case 1 : JOptionPane.showMessageDialog(null, "Es Domingo. ");
                break;
            case 2 : JOptionPane.showMessageDialog(null, "Es lunes. ");
                break;
            case 3 : JOptionPane.showMessageDialog(null, "Es martes. ");
                break;
            case 4 : JOptionPane.showMessageDialog(null, "Es miércoles. ");
                break;
            case 5 : JOptionPane.showMessageDialog(null, "Es jueves. ");
                break;
            case 6 : JOptionPane.showMessageDialog(null, "Es viernes. ");
                break;
            case 7 : JOptionPane.showMessageDialog(null, "Es sábado. ");
                break;
        }
        if (dia == 7 && dia == 1){
            JOptionPane.showMessageDialog(null, "No es un día laboral. ");
        }else{
            JOptionPane.showMessageDialog(null, "Es un día laboral. ");
        }

        //Casa de empeño
        //2569  2600
        //Piden precio
        //Precio

    }
}