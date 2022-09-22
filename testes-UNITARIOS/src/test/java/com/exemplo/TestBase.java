package com.exemplo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;

public class TestBase {

    private AutoCloseable closeable;

    @BeforeEach
    public void openMacks(){
        closeable = MockitoAnnotations.openMocks(this);
    }
    @AfterEach
    public void releaseMocks() throws Exception{
        closeable.close();
    }


}
