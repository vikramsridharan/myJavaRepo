package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import app.Application;

public class Tester {
  @Test
  public void f() {
	  Application app = new Application();
	  Assert.assertEquals(app.printer(), "App");
  }
}
