/*
 * Copyright (C) 2024 kayque de freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package avaliacao.n1;

/**
 *
 * @author kayque de freitas <kayquefreitas08@gmail.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */
import java.util.Scanner;
public class Prova1 {
    public static void main(String[] args) {
        int opcao = 0, qde_expresso=0, qde_capuccino=0, 
            qde_leite_com_cafe=0, qde_cafes_vendidos;
        int tst = 2;
        int pagar = 0;
        int parcela = 0;
        boolean testinho = true;
        double valor_expresso, valor_capuccino,
            valor_leite_com_cafe, valor_cafes_vendidos;
        
        Scanner sc = new Scanner(System.in);

    
        do { /*
             --> esse laço de repetição serve para comunicar ao usuario qual bebida ele quer, caso ele queira outra 
            sera contabilizado uma encrementação em uma das variaveis de controle
            */
                //entrada de dados
               System.out.println("Forneça uma opção: \n"+
                                    "1 ­ café expresso; \n"+
                                    "2 ­ café capuccino; \n"+
                                    "3 ­ leite com café; \n"+
                                    "4 ­ totalizar vendas;");


      
                opcao = sc.nextInt();//finaliza aqui a entrada de dados
                
                //processamento
                //caso uma das opções abaixo for escolhida ira acontecer uma incrementação de controle
                 if ( opcao == 1 ) qde_expresso++;
                else if (opcao == 2) qde_capuccino++;
                else if (opcao == 3) qde_leite_com_cafe++;
                else if (opcao != 4) System.out.println("Opção inválida");//saida de dados
               

      
        } while ( opcao != 4); //esse e o fim do laço
        do {
            System.out.println("Dejesa remover algum item? \n"+
                                "1 para Sim \n"+
                                "2 para Não");
            tst = sc.nextInt();
             if (tst == 1){
            int A = 0;
                 System.out.println("Quais dos itens você dejesa remover?: \n"+
                                    "1 ­ café expresso; \n"+
                                    "2 ­ café capuccino; \n"+
                                    "3 ­ leite com café; \n"+
                                    "4 Sair da tela de remoção");
                 A = sc.nextInt();
            switch (A){
               case 1: {
                   if (A == 1){
                qde_expresso -=1;
                System.out.println("Um item removido");
                 tst =1;
                   }
                        }
               case 2: {
                   if (A == 2){
                qde_capuccino -=1;
               System.out.println("Um item removido");
               tst =1;
                   }
                        }
               case 3: {
                   if (A== 3){
                qde_leite_com_cafe -=1; 
                System.out.println("Um item removido");
                tst =1;
                   }
                        }
            }
            }
            
           
        } while (tst == 1);
        tst = 0;
        //aqui sera ultilizado a variavel de controle assim verificando o preço das coisas que foi solicidado
        //pegando quantas vezes o laço foi repetido e multiplicando pelo seu valor
        
        valor_expresso = qde_expresso*0.75;
        valor_capuccino = qde_capuccino;    
        valor_leite_com_cafe = qde_leite_com_cafe*1.25;     
        qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_leite_com_cafe;
        valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe;
        
        System.out.println("Deseja pagar parcelado? \n"+
                                "1 para Sim \n"+
                                "2 para Não");
        tst = sc.nextInt();
        if(tst == 1){
            System.out.println("Quantas vezes deseja parcela?\n"+
                    "O Maximo de parcelamento e 12");
            parcela = sc.nextInt();
            if (parcela <= 12){
                if (valor_expresso > 0){
                    valor_expresso = valor_expresso/parcela;
                }else if (valor_capuccino > 0){
                    valor_capuccino = valor_capuccino/parcela;
                }else if (valor_leite_com_cafe > 0){
                    valor_leite_com_cafe = valor_leite_com_cafe/parcela;
                }
        } else {
                System.out.println("Não tem como parcela maior que 12 vezes.");
            }
        }
        //saida de dados
        //aqui faz uma verificação para ver se o cliente quer parcelar ou não
         if (parcela == 0 ){
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor: "+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: "+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+  " ­ valor: "+valor_leite_com_cafe);        
        System.out.println("Qde cafés vendidos: "+ qde_cafes_vendidos +   " ­ valor cafés vendidos: "+valor_cafes_vendidos);
    }else {
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor a pagar por mês: "+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor a pagar por mês: "+valor_capuccino);    
        System.out.println("Qde leite com café: "+qde_leite_com_cafe+  " ­ valor a pagar por mês: "+valor_leite_com_cafe);        
        System.out.println("Qde cafés vendidos: "+ qde_cafes_vendidos +   " ­ valor cafés vendidos: "+valor_cafes_vendidos);
         }
         do { //aqui não deixa o programa encerrar se o cliente não escolher uma forma de pagamento
             
        System.out.println("Deseja pagar com dinheiro ou outra forma? \n"+
                            "1- Dinheiro \n"+
                            "2- Outro método de pagamento");
         pagar = sc.nextInt();
        if (pagar > 0 && pagar <= 2){
            testinho = false;
        }
            
        }while (testinho == true);
    }   //finaliza aqui a saida de dados


}
//finaliza aqui o processamento
