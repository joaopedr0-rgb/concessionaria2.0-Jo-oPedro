package Controller;
import java.util.ArrayList;
import model.carrosModel;

public class CarrosController {

    
    public static ArrayList<carrosModel> ListaCarros = new ArrayList<carrosModel>();
        
        public carrosModel(String modelo, String marca, int ano, double preco){
            
           if(modelo == null || modelo.trim().isEmpty() || marca == null || marca.trim().isEmpty() || ano <= 0 || preco <= 0) {
               throw new IllegalArgumentException("Todos os campos devem ser preenchidos corretamente.");
           }
        carrosModel carro1 = new carrosModel("Civic", "Honda", 2020, 95000.00);
        carrosModel carro2 = new carrosModel("Gol", "Volkswagen", 2015, 35000.00);
        carrosModel carro3 = new carrosModel("Corolla", "Toyota", 2022, 130000.00);

        ListaCarros.add(carro1);
        ListaCarros.add(carro2);
        ListaCarros.add(carro3);
        }
       
        
        public ArrayList<carrosModel> getListaCarros() {
        
            return ListaCarros;
        }
    
}
