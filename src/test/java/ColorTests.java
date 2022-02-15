import net.thesimpleteam.colors.Colors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorTests {

    @Test
    void testBackgroundColor() {
        assertEquals("\u001b[48;2;255;0;255m", Colors.getBackgroundColorFromRGB(255, 0, 255));
    }

}
