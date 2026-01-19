package Controller;
import java.util.ArrayList;
import model.carrosModel;

public class CarrosController {

    
    public static ArrayList<carrosModel> ListaCarros = new ArrayList<carrosModel>();
        
        public CarrosController(){
            ListaCarros.add(new carrosModel("Civic","Honda",2020,"Preto",59000));
            ListaCarros.add(new carrosModel("Civic","Honda",2020,"Preto",59000));
            ListaCarros.add(new carrosModel("Civic","Honda",2020,"Preto",59000));
            ListaCarros.add(new carrosModel("Civic","Honda",2020,"Preto",59000));
            
        }


        public ArrayList<carrosModel> getListaCarros() {

            return ListaCarros;
        }
    
}
