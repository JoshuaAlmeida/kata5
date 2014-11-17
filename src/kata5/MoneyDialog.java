/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class MoneyDialog extends JPanel {

    public MoneyDialog() {
        super(new FlowLayout());
        add(createTextEdit());
        add(new CurrencyDialog());
    }

    private JTextField createTextEdit() {
        return new JTextField(10);
    }
    
}
