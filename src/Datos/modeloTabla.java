/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 203pc1
 */
public class modeloTabla extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int row, int column)
    {
        
        return false;
    }
    
    
}
