import java.util.*;
public class lista{
    public static void main(String[] args){
	ArrayList<String> nombres = new ArrayList<>();
	nombres.add("Juan");
	nombres.add("Gustavo");
	nombres.add("Alicia");
	nombres.add("Jose");
	System.out.println(nombres);
	System.out.println(nombres.get(2));
	nombres.add(2, "Rebeca");
	System.out.println(nombres);
	System.out.println(nombres.get(2));
	System.out.println("Elementos en lista: "+nombres.size());
	nombres.remove(0);
	nombres.remove(nombres.size()-1);
	nombres.remove("Alicia");
	System.out.println(nombres);
	System.out.println("Elementos en lista: "+nombres.size());
	ListIterator<String> recorrido = nombres.listIterator();
	System.out.println("Los nombres en la lista son: ");
	while (recorrido.hasNext()){
	    System.out.println(recorrido.next());
	}
	System.out.println("Los nombres en sentido inverso son: ");
	while (recorrido.hasPrevious()){
	    System.out.println(recorrido.previous());
	}
    }
}