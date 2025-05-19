package somativa;

import java.io.IOException;
import java.util.*;

public class Main {
    
    public static Map<Livro, List<Livro>> dijkstra(HashMap<Livro, Set<Livro>> grafo, Livro origem) {
        Map<Livro, Integer> distancias = new HashMap<>();
        Map<Livro, List<Livro>> caminhos = new HashMap<>();
        Queue<Livro> fila = new LinkedList<>();

        distancias.put(origem, 0);
        caminhos.put(origem, List.of(origem));
        fila.add(origem);

        while (!fila.isEmpty()) {
            Livro atual = fila.poll();
            int distanciaAtual = distancias.get(atual);

            for (Livro vizinho : grafo.getOrDefault(atual, new HashSet<>())) {
                if (!distancias.containsKey(vizinho)) {
                    distancias.put(vizinho, distanciaAtual + 1);
                    List<Livro> caminho = new ArrayList<>(caminhos.get(atual));
                    caminho.add(vizinho);
                    caminhos.put(vizinho, caminho);
                    fila.add(vizinho);
                }
            }
        }
        return caminhos;
    }

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {
            //livros no acervo
            Livro livro1 = new Livro("A culpa é das estrelas", "John Green", "Romance");
            Livro livro2 = new Livro("A volta ao mundo em 80 dias", "Jules Verne", "Aventura");
            Livro livro3 = new Livro("O Assassinato no Expresso Oriente", "Agatha Christie", "Suspense");
            Livro livro4 = new Livro("Dom Casmurro", "Machado de Assis", "Clássico");
            Livro livro5 = new Livro("A torre negra", "Stephen King", "Fantasia");
            Livro livro6 = new Livro("A Moreninha", "Joaquim Macedo", "Romance");
            Livro livro7 = new Livro("Tempo do desprezo", "Andrzej Sapkowski", "Fantasia");
            Livro livro8 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Clássico");
            Livro livro9 = new Livro("O pequeno príncipe", "Antoine de Saint-Exupéry", "Filosofia");
            Livro livro10 = new Livro("O mundo de Sofia", "Jostein Gaarder", "Filosofia");

            List<Livro> livros = List.of(
                    livro1, livro2, livro3, livro4, livro5,
                    livro6, livro7, livro8, livro9, livro10);

            //grafo
            HashMap<Livro, Set<Livro>> grafo = new HashMap<>();

            //relações entre os livros
            //livro 1
            grafo.put(livro1, new HashSet<>());
            grafo.get(livro1).add(livro10);
            grafo.get(livro1).add(livro9);

            //livro 2
            grafo.put(livro2, new HashSet<>());
            grafo.get(livro2).add(livro3);
            grafo.get(livro2).add(livro7);
            grafo.get(livro2).add(livro5);

            //livro 3
            grafo.put(livro3, new HashSet<>());
            grafo.get(livro3).add(livro2);
            grafo.get(livro3).add(livro4);
            grafo.get(livro3).add(livro7);

            //livro 4
            grafo.put(livro4, new HashSet<>());
            grafo.get(livro4).add(livro6);
            grafo.get(livro4).add(livro8);

            //livro 5
            grafo.put(livro5, new HashSet<>());
            grafo.get(livro5).add(livro3);
            grafo.get(livro5).add(livro7);
            grafo.get(livro5).add(livro2);

            //livro 6
            grafo.put(livro6, new HashSet<>());
            grafo.get(livro6).add(livro4);
            grafo.get(livro6).add(livro8);

            //livro 7
            grafo.put(livro7, new HashSet<>());
            grafo.get(livro7).add(livro2);
            grafo.get(livro7).add(livro5);
            grafo.get(livro7).add(livro3);

            //livro 8
            grafo.put(livro8, new HashSet<>());
            grafo.get(livro8).add(livro4);
            grafo.get(livro8).add(livro6);

            //livro 9
            grafo.put(livro9, new HashSet<>());
            grafo.get(livro9).add(livro1);
            grafo.get(livro9).add(livro10);

            //livro 10
            grafo.put(livro10, new HashSet<>());
            grafo.get(livro10).add(livro1);
            grafo.get(livro10).add(livro9);

            // menu principal
            System.out.println("=== RECOMENDAÇÕES DE LIVROS DO NOSSO ACERVO === \n\n");
            System.out.println("[1] Livros recomendados com base em titulos");
            System.out.println("[2] Livros recomendados por categorias");
            System.out.println("[3] Recomendações por proximidade\n");
            System.out.print("Digite a opçao: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {

                    System.out.println("\nEscolha um título:\n");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println("[" + (i + 1) + "] " + livros.get(i).getTitulo());

                    }

                    System.out.println();

                    System.out.print("Digite o número do livro: ");

                    int escolha = scanner.nextInt();

                    if (escolha >= 1 && escolha <= livros.size()) {
                        Livro escolhido = livros.get(escolha - 1);
                        System.out.println("\n Recomendados para '" + escolhido.getTitulo() + "':\n");
                        Set<Livro> recomendados = grafo.get(escolhido);

                        if (recomendados != null) {
                            for (Livro l : recomendados) {
                                System.out.println("- " + l);
                            }
                        } else {
                            System.out.println("Nenhuma recomendação disponível.");
                        }
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }

                case 2 -> {
                    Set<String> categorias = new HashSet<>();
                    for (Livro l : livros) {
                        categorias.add(l.getCategoria());
                    }

                    System.out.println("\nCategorias disponíveis:\n");
                    int index = 1;
                    List<String> listaCategorias = new ArrayList<>(categorias);
                    for (String cat : listaCategorias) {
                        System.out.println("[" + index + "] " + cat);
                        index++;
                    }
                    System.out.println();

                    System.out.print("Escolha uma categoria: ");
                    int escolhaCat = scanner.nextInt();

                    if (escolhaCat >= 1 && escolhaCat <= listaCategorias.size()) {
                        String categoriaEscolhida = listaCategorias.get(escolhaCat - 1);
                        System.out.println("\nLivros da categoria '" + categoriaEscolhida + "'\n");
                        for (Livro l : livros) {
                            if (l.getCategoria().equalsIgnoreCase(categoriaEscolhida)) {
                                System.out.println("- " + l);
                            }
                        }
                        System.out.println();

                    } else {
                        System.out.println("Opção inválida.");
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("\nEscolha um título para recomendações por distância: \n");
                    for (int i = 0; i < livros.size(); i++) {
                        System.out.println("[" + (i + 1) + "] " + livros.get(i).getTitulo());
                    }

                    System.out.print("\nDigite o número do livro: ");
                    int escolhaLivro = scanner.nextInt();

                    if (escolhaLivro >= 1 && escolhaLivro <= livros.size()) {
                        Livro origem = livros.get(escolhaLivro - 1);
                        Map<Livro, List<Livro>> caminhos = dijkstra(grafo, origem);

                        System.out.println("\n === Recomendações a partir de \"" + origem.getTitulo() + "\" === \n");
                        for (Map.Entry<Livro, List<Livro>> entry : caminhos.entrySet()) {
                            Livro destino = entry.getKey();
                            if (!destino.equals(origem)) {
                                List<Livro> caminho = entry.getValue();
                                System.out.print("- " + destino.getTitulo() + " (Distância: " + caminho.size() + ") -> Caminho: ");
                                System.out.print(origem.getTitulo());
                                for (Livro l : caminho) {
                                    System.out.print(" -> " + l.getTitulo());
                                }
                                System.out.println();
                            }
                        }

                    } else {
                        System.out.println("Opção inválida.");
                    }
                }
                default -> {
                    System.out.println("Opção inválida.");
                    System.out.println();

                }
            }
        }

    }
}
