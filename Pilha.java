public class Pilha {
    private int size;
    private int [] coisas;
    private int top;
    
    public Pilha(int size) {
        this.size = size;
        this.coisas = new int [size];
        this.top = -1;
    }

    public void push(int coisa) {
        if(top == size -1) {
            System.out.println("pilha satisfeita 🤤");
        } else {
            coisas[++top] = coisa;
        }
    }

    public int pop() {
        if(top == -1) {
            System.out.println("pilha faminta 😫");
            return -1;
    } else {
        return coisas[top--];
        }
    }

    public int pico() {
        if(top == -1) {
            System.out.println("pilha faminha 😫");
            return -1;
        } else {
            return coisas[top];
        }
    }

    public boolean isFull() {
        if (top == this.size -1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

