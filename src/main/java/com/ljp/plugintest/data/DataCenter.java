package com.ljp.plugintest.data;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class DataCenter {
    public static Vector<String> vector;
    //表格各列名称
    public static String[] tableHeader = {"标题","备注","文件名","代码段"};
    //tableModel 两个参数分别为二位数组[][]填充内容 和 []列名
    public static DefaultTableModel tableModel = new DefaultTableModel(null,tableHeader);
    public static String noteTitle = "";

}
