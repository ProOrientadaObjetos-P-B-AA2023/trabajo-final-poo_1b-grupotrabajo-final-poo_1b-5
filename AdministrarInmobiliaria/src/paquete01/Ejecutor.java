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
            int i=0;
            int iDEP=0;
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
                    System.out.println("2.- PARA MOSTRAR DATOS");
                    System.out.println("3.- PARA SALIR");
                    int opc= sc.nextInt();
                    switch (opc){
                        case 1:
                            boolean intdatos=true;
                            while (intdatos){
                                try{
                                    System.out.println("1.- INGRESAR PROPIETARIO");
                                    System.out.println("2.- INGRESAR BARRIO");
                                    System.out.println("3.- INGRESAR CIUDAD");
                                    System.out.println("4.- INGRESAR CONTRUCTORA");
                                    System.out.println("5.- INGRESAR CASA");
                                    System.out.println("6.- INGRESAR DEPARTAMENTO");
                                    System.out.println("7.- SALIR");
                                    int opc2= sc.nextInt();
                                    switch (opc2){
                                        case 1:
                                            Formatter propietarios= new Formatter(new FileWriter("propietarios.dat",true));
                                            System.out.println("INGRESE: NOMBRE; APELLDO; IDENTIFICACION");
                                            propietarios.format("%s;%s;%s%n",sc.next().toUpperCase(),sc.next().toUpperCase(),sc.next().toUpperCase());
                                            propietarios.close();
                                            break;
                                        case 2:
                                            Formatter barrios= new Formatter(new FileWriter("barrios.dat",true));
                                            System.out.println("\nINGRESE: NOMBRE BARRIO; REFERENCIA");
                                            barrios.format("%s;%s%n",sc.next().toUpperCase(),sc.next().toUpperCase());
                                            barrios.close();
                                            break;
                                        case 3:
                                            Formatter ciudades= new Formatter(new FileWriter("ciudades.dat",true));
                                            System.out.println("INGRESE: NOMBRE CIUDAD; NOMBRE PROVINCIA");
                                            ciudades.format("%s;%s%n",sc.next().toUpperCase(),sc.next().toUpperCase());
                                            ciudades.close();
                                            break;
                                        case 4:
                                            Formatter constructoras= new Formatter(new FileWriter("constructoras.dat",true));
                                            System.out.println("INGRESE: NOMBRE CONSTRUCTORA; ID EMPRESA");
                                            constructoras.format("%s;%s%n",sc.next().toUpperCase(),sc.next().toUpperCase());
                                            constructoras.close();
                                            break;
                                        case 5:


                                            boolean info= true;
                                            Formatter casas= new Formatter(new FileWriter("casas.dat",true));
                                            System.out.println("INGRESE: IDENTIFICACION");
                                            String idP=sc.next().toUpperCase();
                                            Scanner lecverif= new Scanner(new File("propietarios.dat"));
                                            while (lecverif.hasNext()){
                                                String prop[] = lecverif.nextLine().split(";");
                                                if (idP.equals(prop[2])){
                                                    casas.format("%s;%s;%s;",prop[0],prop[1],prop[2]);
                                                    info=true;
                                                    break;
                                                }else{
                                                    info=false;
                                                }
                                            }
                                            if (!info){
                                                System.out.println("IDENTIFICACION INGRESADA INCORRECTA");
                                                break;
                                            }
                                            Scanner verifB= new Scanner(new File("barrios.dat"));
                                            System.out.println("INGRESE NOMBRE BARRIO");
                                            String nomB=sc.next().toUpperCase();
                                            while (verifB.hasNext()){
                                                String barr[] = verifB.nextLine().split(";");
                                                if (nomB.equals(barr[0])){
                                                    casas.format("%s;%s;",barr[0],barr[1]);
                                                    info=true;
                                                    break;
                                                }else{
                                                    info=false;
                                                }
                                            }
                                            if (!info){
                                                System.out.println("NOMBRE DE BARRIO INCORRECTO");
                                                break;
                                            }
                                            Scanner verifC= new Scanner(new File("ciudades.dat"));
                                            System.out.println("INGRESE NOMBRE CIUDAD");
                                            String nomC=sc.next().toUpperCase();
                                            while (verifC.hasNext()){
                                                String ciud[] = verifC.nextLine().split(";");
                                                if (nomC.equals(ciud[0])){
                                                    casas.format("%s;%s;",ciud[0],ciud[1]);
                                                    info=true;
                                                    break;
                                                }else{
                                                    info=false;
                                                }
                                            }
                                            if (!info){
                                                System.out.println("NOMBRE DE CIUDAD INCORRECTA");
                                                break;
                                            }
                                            Scanner verifE= new Scanner(new File("constructoras.dat"));
                                            System.out.println("INGRESE ID DE LA EMPRESA");
                                            String idE=sc.next().toUpperCase();
                                            while (verifE.hasNext()){
                                                String empresa[] = verifE.nextLine().split(";");
                                                if (idE.equals(empresa[1])){
                                                    casas.format("%s;%s;",empresa[0],empresa[1]);
                                                    info=true;
                                                    break;
                                                }else{
                                                    info=false;
                                                }
                                            }
                                            if (!info){
                                                System.out.println("ID DE LA EMPRESA INCORRECTA");
                                                break;
                                            }


                                            System.out.println("INGRESE: PRECIO METRO CUADRADO; NUMERO METRO CUDRADO; NUMERO CUARTOS");
                                            casa.add(new Casa(sc.nextDouble(),sc.nextDouble(),sc.nextInt())) ;
                                            for (Casa c: casa) {
                                                c.calcularCostoFinal();
                                            }
                                            casas.format("%.2f; %.2f; %.2f; %d%n",casa.get(i).getCostoFinal(),casa.get(i).getPrecioPorMetroCuadrado(),casa.get(i).getNumeroMetrosCuadrados(),casa.get(i).getNumeroCuartos());
                                            i++;
                                            casas.close();
                                            break;

                                        case 6:
                                            boolean info1= true;
                                            Formatter depa= new Formatter(new FileWriter("departamentos.dat"));
                                            System.out.println("INGRESE: IDENTIFICACION");
                                            String idP1=sc.next().toUpperCase();
                                            Scanner lecverif2= new Scanner(new File("propietarios.dat"));
                                            while (lecverif2.hasNext()){
                                                String prop[] = lecverif2.nextLine().split(";");
                                                if (idP1.equals(prop[2])){
                                                    depa.format("%s;%s;%s;",prop[0],prop[1],prop[2]);
                                                    info1=true;
                                                    break;
                                                }else{

                                                    info1=false;
                                                }
                                            }
                                            if (!info1){
                                                System.out.println("IDENTIFICACION INGRESADA INCORRECTA");
                                                break;
                                            }


                                            Scanner verifB2= new Scanner(new File("barrios.dat"));
                                            System.out.println("INGRESE NOMBRE BARRIO");
                                            String nomB2=sc.next().toUpperCase();
                                            while (verifB2.hasNext()){
                                                String barr[] = verifB2.nextLine().split(";");
                                                if (nomB2.equals(barr[0])){
                                                    depa.format("%s;%s;",barr[0],barr[1]);
                                                    info1=true;
                                                    break;
                                                }else{
                                                    info1=false;
                                                }
                                            }
                                            if (!info1){
                                                System.out.println("NOMBRE DE BARRIO INCORRECTO");
                                                break;
                                            }

                                            Scanner verifC2= new Scanner(new File("ciudades.dat"));
                                            System.out.println("INGRESE NOMBRE CIUDAD");
                                            String nomC2=sc.next().toUpperCase();
                                            while (verifC2.hasNext()){
                                                String ciud[] = verifC2.nextLine().split(";");
                                                if (nomC2.equals(ciud[0])){
                                                    depa.format("%s;%s;",ciud[0],ciud[1]);
                                                    info1=true;
                                                    break;
                                                }else{
                                                    info1=false;
                                                }
                                            }
                                            if (!info1){
                                                System.out.println("NOMBRE DE CIUDAD INCORRECTA");
                                                break;}


                                            Scanner verifE2= new Scanner(new File("constructoras.dat"));
                                            System.out.println("INGRESE ID DE LA EMPRESA");
                                            String idE2=sc.next().toUpperCase();
                                            while (verifE2.hasNext()){
                                                String empresa[] = verifE2.nextLine().split(";");
                                                if (idE2.equals(empresa[1])){
                                                    depa.format("%s;%s;",empresa[0],empresa[1]);
                                                    info1=true;
                                                    break;
                                                }else{
                                                    info1=false;
                                                }
                                            }
                                            if (!info1){
                                                System.out.println("ID DE LA EMPRESA INCORRECTA");
                                                break;
                                            }
                                            System.out.println("INGRESE: PRECIO METRO CUADRADO; NUMERO METRO CUADRADO; VALOR ALICUOTA; UBICACION; NOMBRE EDIFICIO");
                                            departamento.add(new Departamento(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next().toUpperCase(),sc.next().toUpperCase()));
                                            for (Departamento de:departamento) {
                                                de.calcularCostoFinal();
                                            }
                                            depa.format("%.2f;%.2f;%.2f;%.2f;%s;%s%n",departamento.get(iDEP).getCostoFinal(),departamento.get(iDEP).getPrecioMetroCuadrado(),departamento.get(iDEP).getNumeroMetrosCuadrados(),departamento.get(iDEP).getValorAlicuotaMensual(),departamento.get(iDEP).getUbicacionDepartamentoE(),departamento.get(iDEP).getNombreEdificio());
                                            iDEP++;
                                            depa.close();
                                            break;
                                        case 7:
                                            intdatos=false;
                                            break;
                                    }
                                }catch (Exception e){
                                    System.out.println(e);
                                    System.out.println("\nERROR AL INGRESAR OPCION\n");
                                    sc.nextLine();
                                }
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
                            leccasa.close();
                            lecdepar.close();
                            lec.close();
                            lec2.close();
                            lec3.close();
                            lec4.close();
                            break;
                        case 3:
                            interruptor=false;
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