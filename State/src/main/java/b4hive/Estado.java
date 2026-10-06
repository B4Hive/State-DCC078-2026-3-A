package b4hive;

public abstract class Estado {

    public abstract String whichState();

    public boolean liberar(Room room)       { return false; }
    public boolean ocupar(Room room)        { return false; }
    public boolean manutencao(Room room)    { return false; }
    public boolean trancar(Room room)       { return false; }

}