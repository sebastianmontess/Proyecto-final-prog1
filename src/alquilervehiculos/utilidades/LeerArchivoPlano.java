
 
package alquilervehiculos.utilidades;

import alquilervehiculos.modelo.AbstractVehiculo;
import alquilervehiculos.modelo.Coche;
import alquilervehiculos.modelo.Furgoneta;
import alquilervehiculos.modelo.Moto;
import alquilervehiculos.modelo.TipoUsuario;
import alquilervehiculos.modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class LeerArchivoPlano {
    public static List<Usuario> cargarUsuarios(TipoUsuario[] tipos) {
        List<Usuario> listado= new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("src/Usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;            
//            br.readLine();
            while ((linea = br.readLine()) != null) {
               
               String[] datos= linea.split(",");
               
               Usuario usuario= new Usuario(
                datos[0],datos[1],datos[2],datos[3],tipos[Integer.parseInt(datos[4])-1]);
                                    
               listado.add(usuario);
                       
            }
        } catch (Exception e) {
            System.out.println("El archivo no existe = " + e.getMessage());
        } finally {            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listado;
    }

    
    public static  List<AbstractVehiculo> cargarMotos (List<AbstractVehiculo> vehiculos){
        List<AbstractVehiculo> listado= new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
         try {
            archivo = new File("src/Moto.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        // Lectura del fichero
            String linea;            
            br.readLine();
            while ((linea = br.readLine()) != null) {
               
               String[] datos= linea.split(",");
               
               Moto moto= new Moto(
                       datos[0],Integer.parseInt(datos[1]),Boolean.parseBoolean(datos[2]),Double.parseDouble(datos[3]),Boolean.parseBoolean(datos[4]));
                                     
               listado.add(moto);
                       
            }
        } catch (Exception e) {
            System.out.println("El archivo no existe = " + e.getMessage());
        } finally {            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return listado;
    }
    
     public static  List<AbstractVehiculo> cargarCoches (List<AbstractVehiculo> vehiculos){
        List<AbstractVehiculo> listado= new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
         try {
            archivo = new File("src/Coche.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        // Lectura del fichero
            String linea;            
            br.readLine();
            while ((linea = br.readLine()) != null) {
               
               String[] datos= linea.split(",");
               
               Coche coche= new Coche(
              datos[0],Integer.parseInt(datos[1]),Boolean.parseBoolean(datos[2]),Double.parseDouble(datos[3]),Boolean.parseBoolean(datos[4]));
                                     
               listado.add(coche);
                       
            }
        } catch (Exception e) {
            System.out.println("El archivo no existe = " + e.getMessage());
        } finally {            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
         return listado;
    }
    
      public static  List<AbstractVehiculo> cargarFurgonetas (List<AbstractVehiculo> vehiculos){
        List<AbstractVehiculo> listado= new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
         try {
            archivo = new File("src/Furgoneta.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        // Lectura del fichero
            String linea;            
            br.readLine();
            while ((linea = br.readLine()) != null) {
               
               String[] datos= linea.split(",");
               
               Furgoneta furgoneta= new Furgoneta(
              datos[0],Integer.parseInt(datos[1]),Boolean.parseBoolean(datos[2]),Double.parseDouble(datos[3]),Short.parseShort(datos[4]));
                                     
               listado.add(furgoneta);
                       
            }
        } catch (Exception e) {
            System.out.println("El archivo no existe = " + e.getMessage());
        } finally {            
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
         return listado;
    }
    
    
    
    
}
