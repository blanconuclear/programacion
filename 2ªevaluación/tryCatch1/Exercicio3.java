class Exercicio3 {
    public static void main(String[] args) {

        try {
            Circulo c = new Circulo(2.0, "branco");
            System.out.println("Area circulo " + c.area());
        } catch (CorBrancaException e) {
            System.out.println("NON SE PUIDO CREAR OBXECTO: " + e.getMessage());
        }

        try {
            Triangulo t = new Triangulo(2.0, 3.0, "rojo");
            System.out.println("Area triangulo " + t.area());
        } catch (Exception e) {
            System.out.println("NON SE PUIDO CREAR OBXECTO: " + e.getMessage());
        }
    }
}

abstract class Figura {
    protected String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    abstract public double area();
}

class CorBrancaException extends Exception {
    public CorBrancaException(String mensagem) {
        super(mensagem);
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String cor) throws CorBrancaException {
        super(cor);
        if (cor.equals("branco")) {
            throw new CorBrancaException("O círculo non pode ser de cor branca.");
        }
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
