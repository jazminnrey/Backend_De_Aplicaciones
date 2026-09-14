package ar.edu.utnfc.backend;
import java.util.ArrayList;
import java.util.Comparator;
//mport java.util.Set;
//mport java.util.HashSet;
//mport java.util.Map;
//mport java.util.HashMap;
import java.util.Optional;
//
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
        //Persona persona1 = new Persona("Jazmin", 21, 1.52);
        ////System.out.println(persona1.getNombre());
        //persona1.setNombre("Morena");
        //System.out.println(persona1.getNombre());
//
        //persona1.setEdad(-20);
        //System.out.println(persona1.getEdad());
//
        //persona1.setAltura(1.68);
        //System.out.println(persona1.getAltura());


        Repositorio repo1 = new Repositorio("Backend UTN",150, true);
        //System.out.println(repo1.getNombre());
//
        //
//
        //repo1.setCantEstrellas(0);
        //System.out.println(repo1.getCantEstrellas());
        //System.out.println(repo1.esPopular());

        Repositorio repo2 = new Repositorio("Java UTN", 80, true);
        Repositorio repo3 = new Repositorio("Prueba", 300, false);

        ArrayList<Repositorio> repositorios = new ArrayList<>();

        repositorios.add(repo1);
        repositorios.add(repo2);
        repositorios.add(repo3);

        long cantidad = repositorios.stream()
                .filter(repo -> repo.esPopular())
                .count();
        System.out.println(cantidad);

        boolean existe = repositorios.stream()
                .anyMatch(repo -> repo.getCantEstrellas() >= 500);
        System.out.println(existe);

        //Optional<Repositorio> resultado = repositorios.stream()
          //      .filter(repo -> repo.getCantEstrellas() >= 200)
            //    .findFirst();
        
       // if (resultado.isPresent()){
         //       System.out.println(resultado.get().getNombre());
        //}else{
          //      System.out.println("No lo encontre");
        //}

        Optional<Repositorio> res = repositorios.stream()
                
                .min(Comparator.comparingInt(repo -> repo.getCantEstrellas()));
        if (res.isPresent()){
                System.out.println(res.get().getNombre());
        }else{
                System.out.println("No encontré");
        }

        //repositorios.stream()
          //      .filter(repo -> repo.getCantEstrellas() >= 100)
            //    .map(repo -> repo.getNombre())
              //  .forEach(nombre -> System.out.println(nombre));
        
                //System.out.println(repositorios.size());
        //int contador = 0;
        //for (int i=0; i < repositorios.size(); i++){
        //        System.out.println(repositorios.get(i).getNombre());
        //        if (repositorios.get(i).esPopular()){
        //                contador += 1;      
        //        }
        //}
        //System.out.println("La cantidad de repos populares son: " + contador);
        //int contador = 0;
        //String nombreBuscado = "Python";
        //boolean encontrado = false;
        //for (Repositorio repo : repositorios){
        //        //if (repo.esPopular()){
        //        //        contador += 1;
        //        //        System.out.println("Nombre: " + repo.getNombre());
        //        //}
//
        //        if (nombreBuscado.equals(repo.getNombre())){
        //                System.out.println("Repositorio encontrado: " + repo.getNombre());
        //                encontrado = true;
        //        }
        //        
        //}
//
        //if (encontrado){
        //        System.out.println("Se encontró correctamente");
        //}else{
        //        System.out.println("No se encontró el repositorio");
        //}


        //System.out.println("La cantidad de repos populares es de: "+ contador);


        //persona1.nombre = "Jazmin";
        //persona1.edad = 21;
        //persona1.altura = 1.52;
        //System.out.println(persona1.nombre);
        
        //System.out.println(persona1.edad);
        //System.out.println(persona1.altura);

        //ArrayList<String> lenguajes = new ArrayList<>();
        //lenguajes.add("Java");
        //lenguajes.add("Python");
        //lenguajes.add("Java");
        //lenguajes.add("JavaScript");
        //lenguajes.add("Python");
        //lenguajes.add("C++");
        //System.out.println("Punto 1: " + lenguajes);
//
        //int contador = 0;
        //for (int i = 0; i < lenguajes.size(); i++) {
        //    contador += 1;
        //}
        //System.out.println("Punto 2: " + contador);
//
        //int contadorCaracteres = 0;
        //for (int j = 0; j < lenguajes.size(); j++) {
        //    if (lenguajes.get(j).length() >= 5) {
        //        contadorCaracteres += 1;
        //    }
        //}
        //System.out.println("Punto 3: " + contadorCaracteres);
//
        //Set<String> LenguajesSet = new HashSet<>(lenguajes);
        //System.out.println("Punto 4: " + LenguajesSet);
//
        //Map<String, Integer> anioCreacion = new HashMap<>();
        //anioCreacion.put("Java", 1995);
        //anioCreacion.put("Python", 1991);
        //anioCreacion.put("JavaScript", 1995);
        //anioCreacion.put("C++", 1985);
        //System.out.println("Punto 5: " + anioCreacion);
        //
        //
//
        //System.out.println("Punto 6: " + esAnteriorA2000(1995));
        //System.out.println(esAnteriorA2000(1991));
        //System.out.println(esAnteriorA2000(1995));
        //System.out.println(esAnteriorA2000(1985));
        
    } 
    //static boolean esAnteriorA2000(int anio){
    //    return anio < 2000;
    //}   
}
