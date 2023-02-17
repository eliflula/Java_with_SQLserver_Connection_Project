
package java_with_sqlserver;


import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException; 

public class Java_with_sqlserver {
    public static void main(String[] args) throws SQLException {
        System.out.println("main çalıştı");
                    ////Veritabanımızın yolunu belirtmemiz için gereken Url’nin yazılması
            //String dburl="jdbc:sqlserver://localhost; database=ETRAD2; integratedSecurity=true";
            String constr = "jdbc:sqlserver://localhost; databaseName=VtyDB; user=sa; password=191020";
            //Connection con = new DriverManager.getConnection(constr);
            Connection con =DriverManager.getConnection(constr);
        
        try {
            //yüklememiz gereken JDBC sürücünün yazılması
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDrive");            
            System.out.println("try içindeyim");
            
            //drivermanagera bağlanmak DriverManager.getConnection() metodu ile balantının gerçekleşmesi
             con = DriverManager.getConnection(constr);
             System.out.println("con create sonrası");
            //Connection connection =(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433/ETRADE2","sa","191020");
            
            //statement komutu sqldeki temel sorguların oluşmasını sağlar
            //Arayüz sql komutlarını veritabanına göndermek için çeşitli metotları tanımlar.
            //Komut sonucu ResultSet ise true, güncelleme sayısı(update, delete) veya sonuç yok ise false döndür.
            Statement stm = con.createStatement();
             
            String query ="Select * from iller where adi like 'a%' order by adi";
            
            //Doğrudan veri çekme(SELECT) veya veri listeme işlemi için executeQuery metodu kullanılabilir.
            //JDBC kullanarak veri çekme işlemi sonrasında veri listelemek için ResultSet sınıfı kullanılır.

            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                System.out.println("Kodu: "+rs.getString("ilkodu")+ " "+ rs.getString(2)+" "+rs.getString(3));
            }
            
            stm.close();
            if(con != null)
                con.close();
            
        } catch (Exception e) {
            System.out.println("Hata Oldu: " + e.toString());
        }
    }
}




