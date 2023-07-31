package animals;

public class Counter implements AutoCloseable {
    
    private int counter = 0;
    
    public void add() {
        counter++;
    }

    @Override
    public void close() throws Exception {
        if (counter == 0) {
            throw new Exception("Счетчик не использован в блоке try-with-resources");
        }
    }
}
