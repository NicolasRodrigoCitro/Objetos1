package Ejercicio9CuentaConGanchos.CuentaConGanchos;

public abstract class Cuenta {
	private double saldo;
	
	
	protected abstract boolean puedeExtraer(double monto);
	
	public Cuenta() {
		this.saldo=0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double monto) {
		this.saldo+=monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo-=monto;
	}
	
	public boolean extraer(double monto) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}else
			return false;
	}
	
	public boolean transferirAcuenta(double monto,Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}else
			return false;
	}
	
	
}
