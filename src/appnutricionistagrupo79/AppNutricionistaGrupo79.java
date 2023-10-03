package appnutricionistagrupo79;

import AccesoADatos.ComidaData;
import AccesoADatos.Conexion;
import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import Entidades.Telefono;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class AppNutricionistaGrupo79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Conexion.getConexion();
        ArrayList<Telefono> tel = new ArrayList<>();

        Paciente p = new Paciente(1, 123456, "anti", "corrientes", tel, true);
        PacienteData pd = new PacienteData();
//       pd.guardarPaciente(p);
//        System.out.println(p.toString());
        //pd.modificarPaciente(p);
//        System.out.println( pd.buscarPaciente(1));
//        System.out.println(p.toString());
//        pd.modificarPaciente(p);

        // pd.eliminarPaciente(3);
//        for (Paciente paciente : pd.listarPaciente()) {
//            System.out.println(paciente.toString());
//        }
        Dieta d = new Dieta(1, "ensalda de pollo con papa", p, LocalDate.of(2023, Month.MARCH, 10), LocalDate.of(2023, Month.APRIL, 10), 95.5, 70.5, 95.5, true);
        DietaData dd = new DietaData();
        // dd.guardarDieta(d);
//        System.out.println(d.toString());
//        dd.modificarDieta(d);
//        System.out.println(d.toString());
      //  System.out.println(dd.buscarDieta(1));
      //dd.eliminarDieta(1);
        Comida c=new Comida(3,20, "carne", "bife", true);
        ComidaData cd=new ComidaData();
        cd.guardarComida(c);
        System.out.println(c.toString());
        //cd.modificarComida(c);
       // System.out.println(cd.buscarComida(1));
       // System.out.println(c.toString());
    }

}
