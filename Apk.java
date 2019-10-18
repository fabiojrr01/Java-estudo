 package visao;
import javax.swing.JOptionPane;
 import modelo.Proprietario;
 import modelo.Carro;
 import modelo.Endereco;

public class Apk {
    
    public static void main (String []args){
        
        Proprietario pr = new Proprietario();
        Carro Cr = new Carro ();
        Endereco End=new Endereco();
                
        
        
        String Us=JOptionPane.showInputDialog("Digite o Seu Nome:");
        pr.setNome(Us);
        
        String Cp=JOptionPane.showInputDialog("Digite seu Cpf: ");
        pr.setCpf(Cp);
        
        String rgg= JOptionPane.showInputDialog("Digite seu Rg: ");
        pr.setRg(rgg);
        
        String Dt=JOptionPane.showInputDialog("Digite sua Data de Nascimento: ");
        pr.setDataN(Dt);
        
        
        JOptionPane.showConfirmDialog(null,Cr.Acelerar());
        JOptionPane.showConfirmDialog(null,Cr.Freiar());
        JOptionPane.showConfirmDialog(null,Cr.TrocarMarcha());
        JOptionPane.showConfirmDialog(null,Cr.ReduzirMarcha());
        JOptionPane.showConfirmDialog(null,Cr.marchaRe());
        
        String Ruaaa= JOptionPane.showInputDialog("Digite o Nome da Rua: ");
        String Brr= JOptionPane.showInputDialog("Digite o Nome do Bairro: ");
        String cdd= JOptionPane.showInputDialog("Digite o Nome da Cidade: ");
        String std= JOptionPane.showInputDialog("Digite o Nome da Estado: ");
        String cp= JOptionPane.showInputDialog("Digite o Nome do Cep: ");
        String cpmt= JOptionPane.showInputDialog("Digite o Nome dp Complemento: ");
        
        End.setRua(Ruaaa);
        End.setBairro(Brr);
        End.setCidade(cdd);
        End.setEstado(std);
        End.setCep(cp);
        End.setComplemento(cpmt);
        
        
        
                
        
        
                
                }
        
    
        
        


                
    
}
