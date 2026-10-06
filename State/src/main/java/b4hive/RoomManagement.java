package b4hive;

public class RoomManagement {

    //#region <Singleton>
    private RoomManagement() {}

    private static RoomManagement instance;

    public static RoomManagement getInstance() {
        if(instance == null) {
            instance = new RoomManagement();
        }
        return instance;
    }
    //#endregion <Singleton>

    //#region <Estados>
    private static EstadoLivre estadoLivre;
    public static EstadoLivre getEstadoLivre() {
        if(estadoLivre == null) {
            estadoLivre = new EstadoLivre();
        }
        return estadoLivre;
    }

    private static EstadoOcupado estadoOcupado;
    public static EstadoOcupado getEstadoOcupado() {
        if(estadoOcupado == null) {
            estadoOcupado = new EstadoOcupado();
        }
        return estadoOcupado;
    }

    private static EstadoManutencao estadoManutencao;
    public static EstadoManutencao getEstadoManutencao() {
        if(estadoManutencao == null) {
            estadoManutencao = new EstadoManutencao();
        }
        return estadoManutencao;
    }

    private static EstadoTrancado estadoTrancado;
    public static EstadoTrancado getEstadoTrancado() {
        if(estadoTrancado == null) {
            estadoTrancado = new EstadoTrancado();
        }
        return estadoTrancado;
    }
    //#endregion <Estados>

}