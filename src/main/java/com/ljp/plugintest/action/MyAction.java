package com.ljp.plugintest.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.SelectionModel;
import com.ljp.plugintest.data.DataCenter;
import org.jetbrains.annotations.NotNull;

public class MyAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        SelectionModel selectionModel = editor.getSelectionModel();
        String selectedText = selectionModel.getSelectedText();
        DataCenter.noteTitle = selectedText;
        DataCenter.tableModel = null;
    }
}
