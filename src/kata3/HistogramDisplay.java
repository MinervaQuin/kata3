/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Minerva
 */
class HistogramDisplay extends ApplicationFrame{

    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    
    
    void execute() {
        setVisible(true);
    }

    private ChartPanel createPanel() {
        ChartPanel chartPanel= new ChartPanel(createChart(createDataset())) ;
        chartPanel.setPreferredSize(new Dimension(500,400));
        
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
        "Histograma JFreeChart",
         "Dominios email",
         "Nº de emails",
         dataSet,
         PlotOrientation.VERTICAL,
         false,
         false,
         rootPaneCheckingEnabled
        );
        return chart;
    };
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        dataSet.addValue(89, "","ulpgc.es");
        dataSet.addValue(49,  "","gmail.es");
        dataSet.addValue(96,  "","protonmail.es");
        dataSet.addValue(56,  "","ponmeuncinco.es");
        dataSet.addValue(82,  "","un5son6créditos.es");
        return dataSet;
    };
    
    
}
