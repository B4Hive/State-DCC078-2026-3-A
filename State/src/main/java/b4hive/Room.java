package b4hive;

public class Room {

    private Estado estadoAtual;

    public Room() { this.estadoAtual = RoomManagement.getEstadoLivre(); }

    public void setEstado(Estado estado) { this.estadoAtual = estado; } // Isso sendo public me parece arriscado

    public Estado getEstadoAtual() { return this.estadoAtual; }

    //#region Estados
    public boolean liberar() { return this.estadoAtual.liberar(this); }
    public boolean ocupar() { return this.estadoAtual.ocupar(this); }
    public boolean manutencao() { return this.estadoAtual.manutencao(this); }
    public boolean trancar() { return this.estadoAtual.trancar(this); }
    //#endregion Estados

}