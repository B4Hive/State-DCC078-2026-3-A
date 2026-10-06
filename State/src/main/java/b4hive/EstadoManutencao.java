package b4hive;

public class EstadoManutencao extends Estado {

    @Override
    public String whichState() {
        return "Manutencao";
    }

    @Override 
    public boolean liberar(Room room) {
        room.setEstado(RoomManagement.getEstadoLivre());
        return true;
    }

    @Override
    public boolean trancar(Room room) {
        room.setEstado(RoomManagement.getEstadoTrancado());
        return true;
    }

}