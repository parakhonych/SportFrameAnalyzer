package util;

import org.opencv.core.*;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.List;

import dto.DominantColor;

public class ImageAnalyzer {
    /**
     * Analyze image and return dominant color with its percentage.
     * Only considers green, white, and orange.
     *
     * @param image - input OpenCV Mat image to analyze
     * @return DominantColor object containing:
     * - colorName: name of the dominant color ("green", "white", or "orange")
     * - percentage: percentage of the image covered by this color
     */

    public static DominantColor getDominantColor(Mat image) {
        Mat hsv = new Mat();
        Imgproc.cvtColor(image, hsv, Imgproc.COLOR_BGR2HSV);

        int greenCount = 0, whiteCount = 0, orangeCount = 0;

        for (int i = 0; i < hsv.rows(); i++) {
            for (int j = 0; j < hsv.cols(); j++) {
                double[] pixel = hsv.get(i, j);
                double h = pixel[0]; // Hue
                double s = pixel[1]; // Saturation
                double v = pixel[2]; // Value

                if (s < 30 && v > 200) { // White
                    whiteCount++;
                } else if (h >= 35 && h <= 85) { // Green
                    greenCount++;
                } else if (h >= 10 && h <= 25) { // Orange
                    orangeCount++;
                }
            }
        }

        int total = hsv.rows() * hsv.cols();
        double greenPerc = (greenCount * 100.0) / total;
        double whitePerc = (whiteCount * 100.0) / total;
        double orangePerc = (orangeCount * 100.0) / total;

        // Find max
        if (greenPerc >= whitePerc && greenPerc >= orangePerc) {
            return new DominantColor("Green", greenPerc);
        } else if (whitePerc >= greenPerc && whitePerc >= orangePerc) {
            return new DominantColor("White", whitePerc);
        } else {
            return new DominantColor("Orange", orangePerc);
        }
    }

    /**
     * Detects parallel white lines in the given image.
     * <p>
     * This function converts the image to grayscale, applies Gaussian blur,
     * performs Canny edge detection, and then detects lines using the Probabilistic Hough Transform.
     * It groups detected lines by angle and returns true if a group of at least 8 parallel lines is found.
     *
     * @param image The input image (Mat) in BGR color space.
     * @return true if there is a group of at least 8 parallel white lines, false otherwise.
     */
    public static boolean detectParallelLines(Mat image) {

        Mat hsv = new Mat();
        Imgproc.cvtColor(image, hsv, Imgproc.COLOR_BGR2HSV);


        Scalar lowerWhite = new Scalar(0, 0, 200);
        Scalar upperWhite = new Scalar(180, 30, 255);
        Mat whiteMask = new Mat();
        Core.inRange(hsv, lowerWhite, upperWhite, whiteMask);


        Mat blurred = new Mat();
        Imgproc.GaussianBlur(whiteMask, blurred, new Size(5, 5), 0);

        Mat edges = new Mat();
        Imgproc.Canny(blurred, edges, 50, 150);


        Mat lines = new Mat();
        Imgproc.HoughLinesP(edges, lines, 1, Math.PI / 180, 100, 100, 20);


        if (lines.rows() == 0) return false;

        List<Double> angles = new ArrayList<>();
        for (int i = 0; i < lines.rows(); i++) {
            double[] l = lines.get(i, 0);
            Point pt1 = new Point(l[0], l[1]);
            Point pt2 = new Point(l[2], l[3]);
            double angle = Math.atan2(pt2.y - pt1.y, pt2.x - pt1.x);
            angles.add(angle);
        }


        double tolerance = Math.toRadians(5);
        List<List<Double>> groups = new ArrayList<>();

        for (double angle : angles) {
            boolean added = false;
            for (List<Double> group : groups) {
                for (double a : group) {
                    if (Math.abs(a - angle) < tolerance || Math.abs(Math.abs(a - angle) - Math.PI) < tolerance) {
                        group.add(angle);
                        added = true;
                        break;
                    }
                }
                if (added) break;
            }
            if (!added) {
                List<Double> newGroup = new ArrayList<>();
                newGroup.add(angle);
                groups.add(newGroup);
            }
        }


        for (List<Double> group : groups) {
            if (group.size() >= 8) {
                System.out.println("Found parallel lines: " + group.size());
                return true;
            }
        }

        return false;
    }

}
