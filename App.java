
public class App {
    public static class Item {
        public int peso;
        public int valor;

        public Item(int p, int v) {
            this.peso = p;
            this.valor = v;
        }
    }

        public static double fractionalKnapsack(Item[] items, int capacity) {
            int valueTotal = 0;
            int pesoAtual = 0;

            for (int i = 0; i < items.length; i++) {
                if (pesoAtual + items[i].peso <= capacity) {
                    pesoAtual += items[i].peso;
                    valueTotal += items[i].valor;
                } else {
                    int restante = capacity - pesoAtual;
                    valueTotal += items[i].valor * ((double) restante / items[i].peso);
                    break;
                }
            }
            return valueTotal;
        }

        public static void main(String[] args) {
            System.out.println("Algoritmo guloso, modelo que busca o cenário com o maior valor possível a se adquirir");
            Item[] items = new Item[3];
            items[0] = new Item(10, 60);
            items[1] = new Item(20, 100);
            items[2] = new Item(30, 120);
            double valorMax = fractionalKnapsack(items, 50);
            System.out.println("Valor maximo da mochila: " + valorMax);
        }
    }
