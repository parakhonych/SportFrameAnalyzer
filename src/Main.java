import org.opencv.core.Core;
import ui.SportFrameAnalyzer;
import factory.SportStrategyFactory;

public class Main {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        SportStrategyFactory factory = new SportStrategyFactory();

        javax.swing.SwingUtilities.invokeLater(() -> {
            SportFrameAnalyzer frame = new SportFrameAnalyzer(factory);
            frame.setVisible(true);
        });
    }
}
