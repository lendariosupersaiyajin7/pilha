import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> Stack = new Stack<>();
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(11);
        pilha.push(12);
        pilha.push(13);
        pilha.push(14);
        pilha.pico();
        pilha.isFull();
        pilha.isEmpty();

        System.out.println("pilha tá cheia? " + pilha.isFull());
        System.out.println("pilha tá vazia? " + pilha.isEmpty());
        System.out.println("qual o topo da pilha? " + pilha.pico());
    }
}
