package egg_guia_9_ej_6;

import Entidades.Curso;
import Servicios.CursoService;

public class EGG_Guia_9_Ej_6 {

    public static void main(String[] args) {

        CursoService cursoservicio = new CursoService();
       // Curso curso1 = new Curso();
        
        Curso curso1 = cursoservicio.crearCurso();

    }

}
