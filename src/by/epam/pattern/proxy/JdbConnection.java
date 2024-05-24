package by.epam.pattern.proxy;
import java.sql.Connection;

public interface JdbConnection extends Connection {
   Connection getConnection();

 default  void close() {

 }
}