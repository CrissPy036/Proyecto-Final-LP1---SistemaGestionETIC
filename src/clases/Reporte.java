package clases;

import java.sql.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.util.HashMap;
/*
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
*/
/**
 *
 * @author Stiven Gonzalez
 * @author Cristhian Gonzalez
 * 
 */
public class Reporte extends Conexion {
/*
    public void mostrar(String reporte) {
        HashMap parametro = new HashMap();
        parametro.put("param1", "");
        Connection con = retornarConexion();
        URL urlReporte = getClass().getClassLoader().getResource("reportes/reporte" + reporte + ".jasper");
        System.out.println(urlReporte.getPath());
        try {
            JasperReport maestroReporte = (JasperReport) JRLoader.loadObject(urlReporte);
            JasperPrint maestroPrint = JasperFillManager.fillReport(maestroReporte, parametro, con);
            JasperViewer verReporte = new JasperViewer(maestroPrint, false);
            verReporte.setTitle("Vista previa - Listado de " + reporte);
            verReporte.setVisible(true);
        } catch (JRException ex) {
            System.err.println("Error en: " + ex);
        }
    }
*/
}
