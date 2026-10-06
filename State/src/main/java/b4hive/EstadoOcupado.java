package b4hive;

public class EstadoOcupado extends Estado {

    @Override
    public String whichState() {
        return "Ocupado";
    }

    @Override 
    public boolean liberar(Room room) {
        room.setEstado(RoomManagement.getEstadoLivre());
        return true;
    }

}