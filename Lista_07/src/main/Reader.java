package main;

import java.util.Scanner;

public class Reader
{
	protected Scanner s;

	public Reader()
	{
		s = new Scanner(System.in);
	}

	public int readInt()
	{
		return Integer.parseInt(s.nextLine());
	}

	public String readString()
	{
		return s.nextLine();
	}

	public double readDouble()
	{
		return Double.parseDouble(s.nextLine());
	}

	public float readFloat()
	{
		return Float.parseFloat(s.nextLine());
	}
}