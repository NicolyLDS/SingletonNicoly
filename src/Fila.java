public class Fila {
    private static Fila instance;
    private void ImprimeDocumento(){
    }

    private void RemoveDocumento(){
    }

    private void RemoveTodosDocumentos(){
    }

    private Fila(){
    }

    public static Fila getInstance(){
        if (instance == null)
        {
            instance = new Fila();
        }
        return instance;
    }
}
