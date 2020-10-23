package com.pgp.ReviewAnalyser;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewAnalyserApplicationTests
{
        private ReviewAnalyserApplication analyser = new ReviewAnalyserApplication();
	@Test
        public void testWordCount()
        {
   	 assertEquals(7,analyser.getWordCount("Train to win in the digital economy"),0.0);
	}

}
