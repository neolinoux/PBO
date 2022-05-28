public class App {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        View view = new View();
        Controller c = new Controller(model, view);
        
        c.run();
        
    }
}
