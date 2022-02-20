
package LibreriaAlex;
import LibreriaAlex.LeerDatos;
import java.util.Arrays;
/**
 *
 * @author Alejandro Pereiro G
 */
public class arrays {
    //Para Arrays de tipo float
        public static float[] crearArray(float[]lista){
        for(int i = 0; i<lista.length;i++){
            lista[i]=LeerDatos.leerFloat("Teclea nota");
        }
        return lista;
    }
        public static void amosarArray(float[]lista){
        int op;
            op=LeerDatos.leerInt("MENU\n1 con for\n2con for each\n3 con la clase Arrays");
            switch(op){
                case 1: for(int i=0;i<lista.length;i++){
                        System.out.println("posicion " +i+" = "+lista [i]);
                        }
                        break;
                case 2: for(float elemento:lista)
                        System.out.println(elemento);
                        break;
                case 3: System.out.println(Arrays.toString(lista));
                        break;
                default:System.out.println("Opción incorrecta");        
            }
    }    
        public static int buscarElemento(float[]lista, String mensaje){
        float elebus=LeerDatos.leerFloat(mensaje);
        int atopado=0; //si es cero no está
        int posicion=0;
        for(int i = 0; i<lista.length;i++){
            if(elebus == lista[i]){
                System.out.println(elebus+" está en la lista");
                posicion=i;
                atopado=1;
                break;
            }
        }
        if(atopado==0){
            System.out.println(elebus+" no está");
            posicion=-1;
        }
        return posicion;
    }
        public static float[] ordenarElementos(float[]lista){
            Arrays.sort(lista);
            return lista;
        }
        public static float[] borrarElemento(float[]lista, String mensaje){
        int pos=arrays.buscarElemento(lista, mensaje); 
        if(pos<0)
            System.out.println("El elemento no se puede borrar");
        else{
            for(int i = pos;i<lista.length-1; i++)
                lista[i]=lista[i+1];
        }
        lista=Arrays.copyOf(lista, lista.length-1);
        return lista;
    }
        public static float[]añadir(float[]lista){
        float eleAña=LeerDatos.leerFloat("Ingresa el elemento que deseas añadir");
        lista=Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=eleAña;
        return lista;
    }
    //Para Arrays de tipo int
        public static int[] crearArray(int[]lista){
        for(int i = 0; i<lista.length;i++){
            lista[i]=LeerDatos.leerInt("Teclea nota");
        }
        return lista;
    }
        public static void amosarArray(int[]lista){
        int op;
            op=LeerDatos.leerInt("MENU\n1 con for\n2con for each\n3 con la clase Arrays");
            switch(op){
                case 1: for(int i=0;i<lista.length;i++){
                        System.out.println("posicion " +i+" = "+lista [i]);
                        }
                        break;
                case 2: for(int elemento:lista)
                        System.out.println(elemento);
                        break;
                case 3: System.out.println(Arrays.toString(lista));
                        break;
                default:System.out.println("Opción incorrecta");        
            }
    }    
        public static int buscarElemento(int[]lista, String mensaje){
        int elebus=LeerDatos.leerInt(mensaje);
        int atopado=0; //si es cero no está
        int posicion=0;
        for(int i = 0; i<lista.length;i++){
            if(elebus == lista[i]){
                System.out.println(elebus+" está en la lista");
                posicion=i;
                atopado=1;
                break;
            }
        }
        if(atopado==0){
            System.out.println(elebus+" no está");
            posicion=-1;
        }
        return posicion;
    }
        public static int[] ordenarElementos(int[]lista){
            Arrays.sort(lista);
            return lista;
        }
        public static int[] borrarElemento(int[]lista, String mensaje){
        int pos=arrays.buscarElemento(lista, mensaje); 
        if(pos<0)
            System.out.println("El elemento no se puede borrar");
        else{
            for(int i = pos;i<lista.length-1; i++)
                lista[i]=lista[i+1];
        }
        lista=Arrays.copyOf(lista, lista.length-1);
        return lista;
    }
        public static int[]añadir(int[]lista){
        int eleAña=LeerDatos.leerInt("Ingresa el elemento que deseas añadir");
        lista=Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=eleAña;
        return lista;
    }
    //Para Arrays de tipo String
        public static String[] crearArray(String[]lista){
        for(int i = 0; i<lista.length;i++){
            lista[i]=LeerDatos.leerString("Teclea nota");
        }
        return lista;
    }
        public static void amosarArray(String[]lista){
        int op;
            op=LeerDatos.leerInt("MENU\n1 con for\n2con for each\n3 con la clase Arrays");
            switch(op){
                case 1: for(int i=0;i<lista.length;i++){
                        System.out.println("posicion " +i+" = "+lista [i]);
                        }
                        break;
                case 2: for(String elemento:lista)
                        System.out.println(elemento);
                        break;
                case 3: System.out.println(Arrays.toString(lista));
                        break;
                default:System.out.println("Opción incorrecta");        
            }
    }    
        public static int buscarElemento(String[]lista, String mensaje){
        String elebus=LeerDatos.leerString(mensaje);
        int atopado=0; //si es cero no está
        int posicion=0;
        for(int i = 0; i<lista.length;i++){
            if(elebus == lista[i]){
                System.out.println(elebus+" está en la lista");
                posicion=i;
                atopado=1;
                break;
            }
        }
        if(atopado==0){
            System.out.println(elebus+" no está");
            posicion=-1;
        }
        return posicion;
    }
        public static String[] ordenarElementos(String[]lista){
            Arrays.sort(lista);
            return lista;
        }
        public static String[] borrarElemento(String[]lista, String mensaje){
        int pos=arrays.buscarElemento(lista, mensaje); 
        if(pos<0)
            System.out.println("El elemento no se puede borrar");
        else{
            for(int i = pos;i<lista.length-1; i++)
                lista[i]=lista[i+1];
        }
        lista=Arrays.copyOf(lista, lista.length-1);
        return lista;
    }
        public static String[]añadir(String[]lista){
        String eleAña=LeerDatos.leerString("Ingresa el elemento que deseas añadir");
        lista=Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=eleAña;
        return lista;
    }
    //Para Arrays de tipo double
        public static double[] crearArray(double[]lista){
        for(int i = 0; i<lista.length;i++){
            lista[i]=LeerDatos.leerDouble("Teclea nota");
        }
        return lista;
    }
        public static void amosarArray(double[]lista){
        int op;
            op=LeerDatos.leerInt("MENU\n1 con for\n2con for each\n3 con la clase Arrays");
            switch(op){
                case 1: for(int i=0;i<lista.length;i++){
                        System.out.println("posicion " +i+" = "+lista [i]);
                        }
                        break;
                case 2: for(double elemento:lista)
                        System.out.println(elemento);
                        break;
                case 3: System.out.println(Arrays.toString(lista));
                        break;
                default:System.out.println("Opción incorrecta");        
            }
    }    
        public static int buscarElemento(double[]lista, String mensaje){
        double elebus=LeerDatos.leerDouble(mensaje);
        int atopado=0; //si es cero no está
        int posicion=0;
        for(int i = 0; i<lista.length;i++){
            if(elebus == lista[i]){
                System.out.println(elebus+" está en la lista");
                posicion=i;
                atopado=1;
                break;
            }
        }
        if(atopado==0){
            System.out.println(elebus+" no está");
            posicion=-1;
        }
        return posicion;
    }
        public static double[] ordenarElementos(double[]lista){
            Arrays.sort(lista);
            return lista;
        }
        public static double[] borrarElemento(double[]lista, String mensaje){
        int pos=arrays.buscarElemento(lista, mensaje); 
        if(pos<0)
            System.out.println("El elemento no se puede borrar");
        else{
            for(int i = pos;i<lista.length-1; i++)
                lista[i]=lista[i+1];
        }
        lista=Arrays.copyOf(lista, lista.length-1);
        return lista;
    }
        public static double[]añadir(double[]lista){
        double eleAña=LeerDatos.leerDouble("Ingresa el elemento que deseas añadir");
        lista=Arrays.copyOf(lista, lista.length+1);
        lista[lista.length-1]=eleAña;
        return lista;
    }
}
