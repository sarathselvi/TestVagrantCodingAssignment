package com.testvagrant.qa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrant.constants.FrameworkConstants;

public class VerifyWicketKeeper {

	@Test
	public void verifyWicketKeeper() throws IOException {

		String response = new String(Files.readAllBytes(Paths.get(FrameworkConstants.getJsonresponse())));

		Assert.assertEquals(response.toLowerCase().contains("wicket-keeper"), true);

	}

}
