public class teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);
        System.out.println(cc.getSaldo());
        cc.saca(200);
        System.out.println(cc.getSaldo());
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(100);
        System.out.println(cp.getSaldo());
        System.out.println(cc.getSaldo());
        cp.transfere(100, cc);
        System.out.println(cp.getSaldo());
        cc.saca(50);
        System.out.println(cc.getSaldo());
    }
}
