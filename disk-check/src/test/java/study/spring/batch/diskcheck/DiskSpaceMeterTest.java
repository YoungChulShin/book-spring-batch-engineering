package study.spring.batch.diskcheck;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiskSpaceMeterTest {

  DiskSpaceMeter diskSpaceMeter = new DiskSpaceMeter();

  @Test
  @DisplayName("남은 용량을 0에서 100 사이의 퍼센트로 계산한다")
  void getUsablePercentage() throws IOException {
    int usablePercentage = diskSpaceMeter.getUsablePercentage("/");

    Assertions.assertThat(usablePercentage).isBetween(0, 100);
  }

}