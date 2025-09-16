package ui;

import dto.ImageData;
import factory.SportStrategyFactory;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class SportFrameAnalyzer extends JFrame {
    private JPanel imagePanel;
    private JLabel imageLabel;
    private JTextArea infoArea;
    private JButton openButton;

    private final SportStrategyFactory factory;

    public SportFrameAnalyzer(SportStrategyFactory factory) {
        this.factory = factory;
        setTitle("Sport Frame Analyzer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        imagePanel = new JPanel(new BorderLayout());
        imagePanel.setPreferredSize(new Dimension(1200, 800));
        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        infoArea = new JTextArea();
        infoArea.setEditable(false);
        infoArea.setPreferredSize(new Dimension(550, 800));
        infoArea.setMargin(new Insets(2, 5, 2, 2));
        infoArea.setFont(new Font("Arial", Font.PLAIN, 20));

        openButton = new JButton("Open Image");
        openButton.addActionListener(this::selectImage);

        add(openButton, BorderLayout.NORTH);
        add(imagePanel, BorderLayout.CENTER);
        add(infoArea, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void selectImage(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            Mat image = Imgcodecs.imread(path);
            if (image.empty()) {
                JOptionPane.showMessageDialog(this, "Cannot load image!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ImageData imageData = new ImageData(path, image);


            String result = factory.executeStrategy(imageData);
            infoArea.setText(result);

            int panelWidth = imagePanel.getWidth();
            int panelHeight = imagePanel.getHeight();
            ImageIcon icon = new ImageIcon(path);
            Image img = icon.getImage();
            double scale = Math.min((double) panelWidth / img.getWidth(null),
                    (double) panelHeight / img.getHeight(null));
            Image scaledImg = img.getScaledInstance((int) (img.getWidth(null) * scale),
                    (int) (img.getHeight(null) * scale),
                    Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImg));
        }
    }
}
