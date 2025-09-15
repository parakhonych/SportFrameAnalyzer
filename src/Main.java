import org.opencv.core.Core;
import ui.SportFrameAnalyzer;

public class Main {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SportFrameAnalyzer frame = new SportFrameAnalyzer();
                frame.setVisible(true);
            }
        });
    }
}
