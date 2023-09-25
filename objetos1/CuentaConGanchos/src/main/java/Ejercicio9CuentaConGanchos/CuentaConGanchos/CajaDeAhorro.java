package Ejercicio9CuentaConGanchos.CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro() {
		super();
	}

	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + monto * 0.02);
	}
	
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo()  >= monto + monto * 0.02) {
			
			return true;
		} else
			return false;
	}

}
