import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class BoneListView extends JFrame {

    private JList<String> jlst;
    private DefaultListModel<String> listModel;
    private BoneControl boneControl;

    public BoneListView() {
        super("Lista de Bones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o modelo da lista
        listModel = new DefaultListModel<>();

        // Cria a JList com o modelo
        jlst = new JList<>(listModel);

        // Adiciona a JList a um JScrollPane
        JScrollPane scrollPane = new JScrollPane(jlst);

        // Define o layout do JFrame
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        // Define um tamanho padrão para o JFrame
        setSize(300, 200);

        // Exibe o JFrame
        setVisible(true);

        // Cria a instância da control dos bones
        boneControl = new BoneControl();

        // Carrega a lista de bones
        loadBones();
    }

    private void loadBones() {
        // Obtém a lista de bones da control
        Bone[] bones = boneControl.getdBones();

        // Limpa o modelo da lista
        listModel.clear();

        // Adiciona os nomes dos bones ao modelo da lista
        for (Bone bone : bones) {
            if (bone != null) {
                listModel.addElement(bone.getNome());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BoneListView();
            }
        });
    }
}
