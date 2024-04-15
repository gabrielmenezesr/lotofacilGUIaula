import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    private static final Random random = new Random();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::criarGUI);
    }

    private static void criarGUI() {
        JFrame frame = new JFrame("Lotofácil (PAGAAA)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(0, 1, 0, 20)); // Layout com espaçamento vertical de 10 pixels

        JButton botao1 = new JButton("Apostar de 0 a 100");
        JButton botao2 = new JButton("Apostar de A à Z");
        JButton botao3 = new JButton("Apostar em par ou ímpar");
        JButton botaoSair = new JButton("Sair");

        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                apostarDe0a100();
            }
        });

        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                apostarDeAaZ();
            }
        });

        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                apostarParOuImpar();
            }
        });

        botaoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(botaoSair);

        frame.getContentPane().add(painel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void apostarDe0a100() {
        String input = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100 para apostar:");
        try {
            int numeroApostado = Integer.parseInt(input);
            int numeroSorteado = random.nextInt(101);

            if (numeroApostado < 0 || numeroApostado > 100) {
                JOptionPane.showMessageDialog(null, "Aposta inválida.");
            } else {
                String mensagem = (numeroApostado == numeroSorteado) ?
                        "Você ganhou (PAGOU MUITO) R$ 1.000,00 reais." :
                        "Que pena (NÃO PAGOU)! O número sorteado foi: " + numeroSorteado + ".";
                JOptionPane.showMessageDialog(null, mensagem);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número válido.");
        }
    }

    private static void apostarDeAaZ() {
        char letraPremiada = 'G'; // Sempre a letra 'G' será premiada

        char letraApostada = JOptionPane.showInputDialog(null, "Digite uma letra para apostar:").toUpperCase().charAt(0);

        if (letraApostada == 'G') {
            JOptionPane.showMessageDialog(null, "Você ganhou (PAGOU DEMAIS) R$ 500,00 reais.");
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! (NÃO PAGOU) A letra sorteada foi: " + letraPremiada + ".");
        }
    }

    private static void apostarParOuImpar() {
        String input = JOptionPane.showInputDialog(null, "Digite um número inteiro:");
        try {
            int numeroDigitado = Integer.parseInt(input);
            String mensagem = (numeroDigitado % 2 == 0) ?
                    "Você ganhou R$ 100,00 reais. (PAGOU)" :
                    "Que pena! (NÃO PAGOU) O número digitado é ímpar e a premiação foi para números pares.";
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número inteiro válido.");
        }
    }
}

