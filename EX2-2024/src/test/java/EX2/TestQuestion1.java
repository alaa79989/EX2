package EX2;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import EX2.Quesstion1;

public class TestQuestion1 {
 Quesstion1 tester =new Quesstion1();
  
 @Test
 public void  check_amin1() {
	 int a=5,b=10,c=10;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test
 public void  check_amin2() {
	 int a=6 ,b=11,c=11;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test 
 public void  check_amin3() {
	 int a=200,b=10,c=10;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test 
 public void  check_amin4() {
	 int a=199,b=10,c=12;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }

 @Test  
 public void  check_amin5() {
	 int a=10 ,b=5,c=10;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 
 @Test 
 public void  check_amin6() {
	 int a=11,b=6,c=11;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test  
 public void  check_amin7() {
	 int a=10,b=200,c=10;
	 String expected_output="real roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test  
 public void  check_amin8() {
	 int a=12,b=199,c=10;
	 String expected_output="real roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test
 public void  check_amin9() {
	 int a=10,b=10,c=5;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 }
 @Test
 public void  check_amin10() {
	 int a=11,b=11,c=6;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
 
	 }
 @Test
 public void  check_amin11() {
	 int a=10,b=10,c=200;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
	 
 }
	 
 @Test
 public void  check_amin12() {
	 int a=12,b=10,c=199;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output); 
	 
 }
 @Test
 public void  check_amin13() {
	 int a=100,b=100,c=100;
	 String expected_output="imaginary roots";
	 String actual_output=tester.calc_roots(a, b, c);
	 assertEquals(expected_output,actual_output);
}
}
	 