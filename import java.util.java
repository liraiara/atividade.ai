import java.util.HashMap;
import java.util.Map;

public class AgenteLogico {

    private Map<String, String> respostas;

    public AgenteLogico() {
        // Inicialização das respostas padrão
        respostas = new HashMap<>();
        respostas.put("Olá", "Olá! Como posso ajudá-lo hoje?");
        respostas.put("Qual é o seu horário de funcionamento?", "Estamos abertos de segunda a sexta-feira, das 9h às 18h.");
        respostas.put("Como posso fazer uma devolução?", "Você pode fazer uma devolução em qualquer uma de nossas lojas físicas ou entrar em contato conosco para obter assistência.");
        // Adicione mais respostas conforme necessário
    }

    public String responder(String pergunta) {
        // Verifica se há uma resposta direta para a pergunta
        if (respostas.containsKey(pergunta)) {
            return respostas.get(pergunta);
        } else {
            // Caso contrário, retorna uma resposta padrão
            return "Desculpe, não entendi sua pergunta. Por favor, tente novamente ou entre em contato conosco para obter ajuda.";
        }
    }

    public static void main(String[] args) {
        // Cria um novo agente lógico
        AgenteLogico agente = new AgenteLogico();

        // Exemplos de perguntas
        String pergunta1 = "Olá";
        String pergunta2 = "Qual é o seu horário de funcionamento?";
        String pergunta3 = "Como posso rastrear meu pedido?";

        // Obtém respostas do agente lógico
        String resposta1 = agente.responder(pergunta1);
        String resposta2 = agente.responder(pergunta2);
        String resposta3 = agente.responder(pergunta3);

        // Exibe as respostas
        System.out.println("Pergunta: " + pergunta1);
        System.out.println("Resposta: " + resposta1);

        System.out.println("\nPergunta: " + pergunta2);
        System.out.println("Resposta: " + resposta2);

        System.out.println("\nPergunta: " + pergunta3);
        System.out.println("Resposta: " + resposta3);
    }
}
