public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("SBI rate: " + new SBI().getRate());
        System.out.println("HDFC rate: " + new HDFC().getRate());
    }
}

class Bank {
    double getRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getRate() {
        return 7.0;
    }
}
