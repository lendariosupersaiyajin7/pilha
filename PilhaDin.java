public class PilhaDin {
    private int size;
    private int[] coisas;
    private int top;

    public PilhaDin(int sizeDin) {
        this.size = sizeDin;
        this.coisas = new int[sizeDin];
        this.top = -1;
    }

    public void push(int coisa) {
        if (top == size - 1) {
            aumentarPilha();
        }
        coisas[++top] = coisa;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("pilha faminta 😫");
            return -1;
        } else {
            return coisas[top--];
        }
    }

    public int pico() {
        if (top == -1) {
            System.out.println("pilha faminta 😫");
            return -1;
        } else {
            return coisas[top];
        }
    }

    private void aumentarPilha() {
        int sizeDois = size * 2;
        int[] pilhaJr = new int[sizeDois];
        System.arraycopy(coisas, 0, pilhaJr, 0, size);
        coisas = pilhaJr;
        size = sizeDois;

        System.out.println("Pilha expandida com ardor 😎😋😊 - novo tamanho: " + size);
    }
}
