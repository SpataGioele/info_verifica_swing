import components.FormLibreria;

public class App {
    public static void main(String[] args) throws Exception {
        MyFrame frame = new MyFrame();

        FormLibreria form = new FormLibreria();

        // adding
        frame.add(form);

        // frame setting
        frame.setVisible(true);
    }
}
