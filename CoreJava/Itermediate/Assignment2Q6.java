abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist()
     {
       return "This is File Persistence class";
     }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist()
    {
      return "This is Database Persistence Class";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	Persistence filePersistance=new FilePersistence();
    	Persistence databasePersistance=new DatabasePersistence();
    	System.out.println(filePersistance.persist());
    	System.out.println(databasePersistance.persist());
    }
}
