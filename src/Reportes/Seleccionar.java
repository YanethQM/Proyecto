
package Reportes;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.data.general.DefaultPieDataset;


public class Seleccionar {
    
     public static void Seleccionar(String fecha){
        Connection con;
        Conexion cn= new Conexion();
        PreparedStatement ps;
        ResultSet rs;
    try{
        String sql ="SELECT * from ventas where fecha=?";
        con=cn.getConexion();
        ps= con.prepareStatement(sql);
        ps.setString(1, fecha);
        rs=ps.executeQuery();
        DefaultPieDataset  dataset = new DefaultPieDataset();
        while(rs.next()){
            dataset.setValue(rs.getString("total"), rs.getDouble("total"));
        }
     
    }catch (SQLException e){
        System.out.println(e.toString());
    }
    }
        
}
