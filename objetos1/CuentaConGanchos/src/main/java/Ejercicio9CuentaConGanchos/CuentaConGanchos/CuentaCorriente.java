package Ejercicio9CuentaConGanchos.CuentaConGanchos;

public class CuentaCorriente extends Cuenta {

	private double descubierto;

	
	

	public CuentaCorriente() {
		super();
		this.descubierto = 0;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		} else {
			if(this.puedeExtraerDescubierto(monto)) {
				this.extraerSinControlar(monto);
				return true;
			}
		}
		return false;
			
	}

	private boolean puedeExtraerDescubierto(double monto) {
		if (this.getDescubierto() + this.getSaldo() >= monto)
			return true;
		else
			return false;
	}

	private boolean puedeExtraerDelSaldo(double monto) {
		if (this.getSaldo() >= monto)
			return true;
		else
			return false;
	}

	protected boolean puedeExtraer(double monto) {
		if (this.puedeExtraerDelSaldo(monto)) {
			return true;
		} else
			return this.puedeExtraerDescubierto(monto);

	}

}
