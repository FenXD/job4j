package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
*Test
*
*@author Maksim Katorgin
*@version $Id$
*@since 03.02.2019
*/
public class CalculateTest {
/**
*Test echo
*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
		String name = "Maksim";
		String expect = "Echo,echo,echo:Maksim";
		Calculate calc = new Calculate();
		String result = calc.echo(name);
		assertThat(result,is(expect));
	}
	
}