package com.ljp.plugintest.window;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.ljp.plugintest.data.DataCenter;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JDialog {
    private JPanel contentPane;
    private JTextField titleField;
    private JTable dataTable;
    private JButton saveButton;
    private JButton cleanButton;
    private JButton closeButton;
    private JButton buttonOK;

    private void init(){
        titleField.setText(DataCenter.noteTitle);
        //dataTable.setModel(DataCenter.tableModel);
        dataTable.setEnabled(true);
    }
    public MyWindow(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        init();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    @Override
    public JPanel getContentPane() {
        return contentPane;
    }
}
