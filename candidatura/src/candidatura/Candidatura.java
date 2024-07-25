/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candidatura;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author DEV
 */
public class Candidatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        selecaoCandidatos();
        
    
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        
        System.out.println("Imprimindo uma lista de candidatos informando o índice do elemento. ");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de N° " + (indice+1) + " é o candidato " + candidatos[indice]);
        }
    }
    
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " solicitou " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para vaga. ");
                candidatosSelecionados++;
                
            }
            
            
            candidatosAtual++;

        }
    }
        
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato. ");
        } else if (salarioPretendido == salarioBase){
            System.out.println("ligar para o candidato com contra proposta. ");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos. ");
        }
    }
    
}
