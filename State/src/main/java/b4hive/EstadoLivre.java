package b4hive;

public class EstadoLivre extends Estado {

    @Override
    public String whichState() {
        return "Livre";
    }

    @Override
    public boolean ocupar(Room room) {
        room.setEstado(RoomManagement.getEstadoOcupado());
        return true;
    }

    @Override
    public boolean manutencao(Room room) {
        room.setEstado(RoomManagement.getEstadoManutencao());
        return true;
    }
}