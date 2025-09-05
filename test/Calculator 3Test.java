import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

class Calculator 3Test {
    private {{className}} instance;
    
    @BeforeEach
    void setUp() {
        instance = new {{className}}();
    }
    
    @AfterEach
    void tearDown() {
        instance = null;
    }
    

}