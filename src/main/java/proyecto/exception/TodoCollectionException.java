package proyecto.exception;

public class TodoCollectionException extends Exception{
    
    private static final long serialVersionUID = 1L;

    public TodoCollectionException(String message){
        super(message);
    }

    public static String NotFoundException(String id){
        return "Todo con el id " + id + " no encontrado";
    }

    public static String TodoAlreadyExists(){
        return "La tarea ya existe";
    }

    


}
