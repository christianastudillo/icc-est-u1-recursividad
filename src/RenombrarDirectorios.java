import java.io.File;
public class RenombrarDirectorios {
    public void RenombrarDirectorios(String path) {
        //validemos que e path sea un directorio
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("La ruta path no es un directorio valido");
            return;
        }
        //aca vamos a cambiar los nombres de los directorios
        //System.out.println("La ruta path es valida");
        RenombrarDirectoriosInternos(dir);
    }
    public void RenombrarDirectoriosInternos(File dir) {
        //listar todos los archivos y/o carpetas hijas
        File[] directoriosArchivosInternos = dir.listFiles();
        if(directoriosArchivosInternos == null) {
            return;
        }
        for (File directorArchivo : directoriosArchivosInternos) {
            if(directorArchivo.isDirectory()){
                String nombreoriginal = directorArchivo.getName();
                String nuevoNombre = "Nuevo - " + nombreoriginal;
                File nuevoDirectorio = new File(directorArchivo.getParent(), nuevoNombre);
                directorArchivo.renameTo(nuevoDirectorio);
                System.out.println("El directorio " + nombreoriginal + " ha sido renombrado a " + nuevoNombre);
                
            }
        }
    }
}
