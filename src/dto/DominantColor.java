package dto;

public class DominantColor {
    private final String color;
    private final double percentage;

    public DominantColor(String color, double percentage) {
        this.color = color;
        this.percentage = percentage;
    }

    public String getColor() {
        return color;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return color + " (" + String.format("%.2f", percentage) + "%)";
    }
}

