package strategy;

import dto.ImageData;

public interface SportStrategy {

    void lightCheck(ImageData imageData);

    void mediumCheck(ImageData imageData);

    void heavyCheck(ImageData imageData);
}
