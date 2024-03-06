/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package novatoprogramador.arbol_binario;


public class Arbol_binario {

    public static void main(String[] args) {
      
        buscar_arbol<Integer> arbol = new buscar_arbol<>();
        
        arbol.add(10);
        arbol.add(15);
        arbol.add(8);
        arbol.add(3);
        
        arbol.add(arbol.getRoot(), 30);
        arbol.add(arbol.getRoot(), 23);
        arbol.add(arbol.getRoot(), 14);
        arbol.add(arbol.getRoot(), 36);
        
      
        
       
        System.out.println("preorder");
       arbol.preorder(arbol.getRoot());
       System.out.println("postorder");
       arbol.postorder(arbol.getRoot());
       System.out.println("inorder");
       arbol.inorder(arbol.getRoot());
    }
    
}
