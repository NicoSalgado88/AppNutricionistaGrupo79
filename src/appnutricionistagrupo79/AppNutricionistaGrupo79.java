package appnutricionistagrupo79;


import AccesoADatos.*;
import Entidades.*;
import java.time.LocalDate;
import java.time.Month;
//import java.util.ArrayList;

public class AppNutricionistaGrupo79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conexion.getConexion();
//        ArrayList<Telefono> tel = new ArrayList<>();

        Paciente p = new Paciente(1, 123456, "anti", "corrientes", 123456, true);
        PacienteData pd = new PacienteData();
//       pd.guardarPaciente(p);
//        System.out.println(p.toString());
        //pd.modificarPaciente(p);
//        System.out.println( pd.buscarPaciente(1));
//        System.out.println(p.toString());
//        pd.modificarPaciente(p);

        // pd.eliminarPaciente(3);
        for (Paciente paciente : pd.listarPaciente()) {
            System.out.println(paciente.toString());
        }
        Dieta d = new Dieta(4, "ensalda de pollo con papa", p, LocalDate.of(2023, Month.MARCH, 10), LocalDate.of(2023, Month.APRIL, 10), 95.5, 70.5, 95.5, true);
//        DietaData dd = new DietaData();
        // dd.guardarDieta(d);
//        System.out.println(d.toString());
//        dd.modificarDieta(d);
//        System.out.println(d.toString());
      //  System.out.println(dd.buscarDieta(1));
      //dd.eliminarDieta(1);
        Comida c=new Comida(2,20, "carne", "bife", true);
//        ComidaData cd=new ComidaData();
//        cd.guardarComida(c);
//        System.out.println(c.toString());
        //cd.modificarComida(c);
       // System.out.println(cd.buscarComida(1));
       // System.out.println(c.toString());
       
       Telefono t=new Telefono(1, 1, 15123);
       TelefonoData td=new TelefonoData();
//       td.guardarTelefono(t);
//        for (Telefono telefono : td.listarTelefonoPorPaciente(1)) {
//            System.out.println(telefono);
//        }
//       td.modificarTelefono(t);
//        td.eliminarTelefono(1);
       DCData dcd=new DCData();
       DietaComida dc=new DietaComida(5, c, d);
//       dcd.guardarDC(dc);
//    dcd.modificarDC(dc);
//        dcd.eliminarDC(5);

//        for (Comida comida : dcd.listarComidaPorDieta(4)) {
//            System.out.println(comida.toString());
//        }

//        for (Dieta dieta : dcd.listarDietaPorComida(1)) {
//            System.out.println(dieta.toString());
//        }
    }

}
