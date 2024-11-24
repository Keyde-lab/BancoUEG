package contasusuarios;

public class ContaCorrente extends Conta {
    private double chequeEspecial;


    public ContaCorrente(double saldo, String titular, String numeroConta, String senha) {
        super(saldo, titular, numeroConta, senha, "corrente");

    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldo = getSaldo();
        if(valor>0 && valor< (saldo + chequeEspecial)) {
             saldo-=valor;
                setSaldo(saldo);
                System.out.println("Saque realizado.");
        } else {
            System.out.println("Saque invalido, verifique o saldo total e o valor solicitado");
            }
        }

    @Override
    public String toString() {
        return super.toString() + " [ cheque especial =" + chequeEspecial + "]";
    }
}
