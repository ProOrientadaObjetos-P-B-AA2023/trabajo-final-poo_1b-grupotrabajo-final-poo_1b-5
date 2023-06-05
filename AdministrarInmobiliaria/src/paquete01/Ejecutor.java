package paquete01;

import paquete06.Casa;
import paquete06.Departamento;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean interruptor= true;
        try{
            Formatter ca= new Formatter("casas.dat");
            Formatter de1= new Formatter("departamentos.dat");
            Formatter ba= new Formatter("barrios.dat");
            Formatter pr= new Formatter("propietarios.dat");
            Formatter ci= new Formatter("ciudades.dat");
            Formatter co= new Formatter("constructoras.dat");
            ca.close();
            de1.close();
            ba.close();
            pr.close();
            ci.close();
            co.close();
            ArrayList<Departamento> departamento= new ArrayList<>();
            ArrayList<Casa> casa= new ArrayList<>();
            while(interruptor){
                try{
                    System.out.println("\n1.- PARA AÑADIR NUEVOS DATOS");
                    System.out.println("2.- PARA MOSTRAR DATOS Y SALIR");
                    int opc= sc.nextInt();
                    switch (opc){
                        case 1:
                            try{
                                Formatter casas= new Formatter("casas.dat");
                                Formatter departamentos= new Formatter("departamentos.dat");
                                Formatter barrios= new Formatter(new FileWriter("barrios.dat",true));
                                Formatter propietarios= new Formatter(new FileWriter("propietarios.dat",true));
                                Formatter ciudades= new Formatter(new FileWriter("ciudades.dat",true));
                                Formatter constructoras= new Formatter(new FileWriter("constructoras.dat",true));
                                System.out.println("\nINGRESE: NOMBRE BARRIO; REFERENCIA");
                                barrios.format("%s; %s%n",sc.next(),sc.next());
                                System.out.println("INGRESE: NOMBRE; APELLDO; IDENTIFICACION");
                                propietarios.format("%s; %s; %s%n",sc.next(),sc.next(),sc.next());
                                System.out.println("INGRESE: NOMBRE CIUDAD; NOMBRE PROVINCIA");
                                ciudades.format("%s; %s%n",sc.next(),sc.next());
                                System.out.println("INGRESE: NOMBRE CONSTRUCTORA; ID EMPRESA");
                                constructoras.format("%s; %s%n",sc.next(),sc.next());
                                System.out.println("INGRESE: PRECIO METRO CUADRADO; NUMERO METRO CUDRADO; NUMERO CUARTOS");
                                casa.add(new Casa(sc.nextDouble(),sc.nextDouble(),sc.nextInt())) ;
                                for (Casa c: casa) {
                                    c.calcularCostoFinal();
                                }
                                System.out.println("INGRESE: PRECIO METRO CUADRADO; NUMERO METRO CUADRADO; VALOR ALICUOTA; UBICACION; NOMBRE EDIFICIO");
                                departamento.add(new Departamento(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next(),sc.next()));
                                for (Departamento de:departamento) {
                                    de.calcularCostoFinal();
                                }
                                barrios.close();
                                propietarios.close();
                                ciudades.close();
                                constructoras.close();
                                Scanner lec= new Scanner(new File("barrios.dat"));
                                Scanner lec2= new Scanner(new File("propietarios.dat"));
                                Scanner lec3= new Scanner(new File("ciudades.dat"));
                                Scanner lec4= new Scanner(new File("constructoras.dat"));
                                int i=0;
                                while (lec.hasNext()){
                                    String barr[]=lec.nextLine().split(";");
                                    String prop[]=lec2.nextLine().split(";");
                                    String ciud[]=lec3.nextLine().split(";");
                                    String cons[]=lec4.nextLine().split(";");
                                    casas.format("%s; %s; %s; %s; %.2f; %.2f; %.2f; %d%n",barr[1],prop[0],ciud[0],cons[0],casa.get(i).getCostoFinal(),casa.get(i).getPrecioPorMetroCuadrado(),casa.get(i).getNumeroMetrosCuadrados(),casa.get(i).getNumeroCuartos());
                                    departamentos.format("%s; %s; %s; %s; %.2f; %.2f; %.2f; %.2f; %s; %s%n",barr[1],prop[0],ciud[0],cons[0], departamento.get(i).getCostoFinal(),departamento.get(i).getPrecioMetroCuadrado(),departamento.get(i).getNumeroMetrosCuadrados(),departamento.get(i).getValorAlicuotaMensual(),departamento.get(i).getUbicacionDepartamentoE(),departamento.get(i).getNombreEdificio());
                                    i++;
                                    if (i+1==departamento.size()){
                                        break;
                                    }
                                }
                                casas.close();
                                departamentos.close();
                                lec.close();
                                lec2.close();
                                lec3.close();
                                lec4.close();
                            }catch (Exception e){
                                System.out.println("\nERROR AL INGRESAR DATOS");
                                System.out.println("INGRESE NUEVAMENTE\n");
                                sc.nextLine();
                            }
                            break;
                        case 2:
                            Scanner leccasa= new Scanner(new File("casas.dat"));
                            Scanner lecdepar= new Scanner(new File("departamentos.dat"));
                            Scanner lec= new Scanner(new File("barrios.dat"));
                            Scanner lec2= new Scanner(new File("propietarios.dat"));
                            Scanner lec3= new Scanner(new File("ciudades.dat"));
                            Scanner lec4= new Scanner(new File("constructoras.dat"));
                            System.out.println("Casas:");
                            while (leccasa.hasNext()){
                                System.out.println(leccasa.nextLine());
                            }
                            System.out.println("Departamento:");
                            while (lecdepar.hasNext()){
                                System.out.println(lecdepar.nextLine());
                            }
                            System.out.println("Barrios:");
                            while (lec.hasNext()){
                                System.out.println(lec.nextLine());
                            }
                            System.out.println("Propietarios:");
                            while (lec2.hasNext()){
                                System.out.println(lec2.nextLine());
                            }
                            System.out.println("Ciudades:");
                            while (lec3.hasNext()){
                                System.out.println(lec3.nextLine());
                            }
                            System.out.println("Constructoras:");
                            while (lec4.hasNext()){
                                System.out.println(lec4.nextLine());
                            }
                            interruptor=false;
                            leccasa.close();
                            lecdepar.close();
                            lec.close();
                            lec2.close();
                            lec3.close();
                            lec4.close();
                            break;
                    }
                }catch (Exception e){
                    System.out.println("\nERROR AL INGRESAR OPCION\n");
                    sc.nextLine();
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}