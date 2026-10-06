package b4hive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void roomShouldBeInFreeStateInitially() {
        Room room = new Room();
        assertTrue(room.getEstadoAtual().whichState().equals("Livre"));
    }
    
    //#region From Free State

    @Test
    public void roomLiberateShouldReturnFalseFromFreeState() {
        Room room = new Room();
        assertFalse(room.liberar());
    }

    @Test
    public void roomOcupyShouldReturnTrueFromFreeState() {
        Room room = new Room();
        assertTrue(room.ocupar());
    }

    @Test
    public void roomShouldBeInOccupiedStateAfterOccupy() {
        Room room = new Room();
        room.ocupar();
        assertTrue(room.getEstadoAtual().whichState().equals("Ocupado"));
    }

    @Test
    public void roomMaintenanceShouldReturnTrueFromFreeState() {
        Room room = new Room();
        assertTrue(room.manutencao());
    }

    @Test
    public void roomShouldBeInMaintenanceStateAfterMaintenance() {
        Room room = new Room();
        room.manutencao();
        assertTrue(room.getEstadoAtual().whichState().equals("Manutencao"));
    }

    @Test
    public void roomTrancarShouldReturnFalseFromFreeState() {
        Room room = new Room();
        assertFalse(room.trancar());
    }

    //#endregion From Free State

    //#region From Occupied State

    @Test
    public void roomLiberateShouldReturnTrueFromOccupiedState() {
        Room room = new Room();
        room.ocupar();
        assertTrue(room.liberar());
    }

    @Test
    public void roomShouldBeInFreeStateAfterLiberate() {
        Room room = new Room();
        room.ocupar();
        room.liberar();
        assertTrue(room.getEstadoAtual().whichState().equals("Livre"));
    }
    
    @Test 
    public void roomOcupyShouldReturnFalseFromOccupiedState() {
        Room room = new Room();
        room.ocupar();
        assertFalse(room.ocupar());
    }
    
    @Test 
    public void roomMaintenanceShouldReturnFalseFromOccupiedState() {
        Room room = new Room();
        room.ocupar();
        assertFalse(room.manutencao());
    }

    @Test
    public void roomTrancarShouldReturnFalseFromOccupiedState() {
        Room room = new Room();
        room.ocupar();
        assertFalse(room.trancar());
    }

    //#endregion From Occupied State

    //#region From Maintenance State

    @Test 
    public void roomLiberateShouldReturnTrueFromMaintenanceState() {
        Room room = new Room();
        room.manutencao();
        assertTrue(room.liberar());
    }

    @Test
    public void roomShouldBeInFreeStateAfterLiberateFromMaintenance() {
        Room room = new Room();
        room.manutencao();
        room.liberar();
        assertTrue(room.getEstadoAtual().whichState().equals("Livre"));
    }

    @Test
    public void roomOcupyShouldReturnFalseFromMaintenanceState() {
        Room room = new Room();
        room.manutencao();
        assertFalse(room.ocupar());
    }

    @Test
    public void roomMaintenanceShouldReturnFalseFromMaintenanceState() {
        Room room = new Room();
        room.manutencao();
        assertFalse(room.manutencao());
    }

    @Test
    public void roomTrancarShouldReturnTrueFromMaintenanceState() {
        Room room = new Room();
        room.manutencao();
        assertTrue(room.trancar());
    }

    @Test
    public void roomShouldBeInLockedStateAfterTrancarFromMaintenance() {
        Room room = new Room();
        room.manutencao();
        room.trancar();
        assertTrue(room.getEstadoAtual().whichState().equals("Trancado"));
    }

    //#endregion From Maintenance State

    //#region From Locked State

    @Test
    public void roomLiberateShouldReturnFalseFromLockedState() {
        Room room = new Room();
        room.manutencao();
        room.trancar();
        assertFalse(room.liberar());
    }

    @Test
    public void roomOcupyShouldReturnFalseFromLockedState() {
        Room room = new Room();
        room.manutencao();
        room.trancar();
        assertFalse(room.ocupar());
    }

    @Test
    public void roomMaintenanceShouldReturnFalseFromLockedState() {
        Room room = new Room();
        room.manutencao();
        room.trancar();
        assertFalse(room.manutencao());
    }

    @Test
    public void roomTrancarShouldReturnFalseFromLockedState() {
        Room room = new Room();
        room.manutencao();
        room.trancar();
        assertFalse(room.trancar());
    }

    //#endregion From Locked State

}
