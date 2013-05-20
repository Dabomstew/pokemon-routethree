public class ComplexBattleFlags {
	private int shiftedInPokemon = -1;
	private int switchedInPokemon = -1;
	private int deadSwitchPokemon = -1;

	public ComplexBattleFlags() {

	}

	public int getShiftedInPokemon() {
		return shiftedInPokemon;
	}

	public void setShiftedInPokemon(int shiftedInPokemon) {
		this.shiftedInPokemon = shiftedInPokemon;
	}

	public int getSwitchedInPokemon() {
		return switchedInPokemon;
	}

	public void setSwitchedInPokemon(int switchedInPokemon) {
		this.switchedInPokemon = switchedInPokemon;
	}

	public int getDeadSwitchPokemon() {
		return deadSwitchPokemon;
	}

	public void setDeadSwitchPokemon(int deadSwitchPokemon) {
		this.deadSwitchPokemon = deadSwitchPokemon;
	}

	public boolean hasShiftedInPokemon() {
		return this.shiftedInPokemon > 0;
	}

	public boolean hasSwitchedInPokemon() {
		return this.switchedInPokemon > 0;
	}

	public boolean hasDeadSwitchPokemon() {
		return this.deadSwitchPokemon > 0;
	}

}
