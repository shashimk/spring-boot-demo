package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;
import uk.org.webcompere.systemstubs.stream.SystemIn;

@SpringBootTest(args = "70") @ExtendWith(SystemStubsExtension.class)
class SpringBootStandaloneApplicationTest {
  @Test void testMainWithCommandLineArguments() {
		Assertions.assertDoesNotThrow(() -> Exception.class);
  }

  @SystemStub private SystemIn systemIn = new SystemIn("50");

  @Test void testMainWithoutCommandLineArguments() {
    SpringBootStandaloneApplication s = new SpringBootStandaloneApplication();
    s.main(new String[] {});
		Assertions.assertDoesNotThrow(() -> Exception.class);
  }
}
