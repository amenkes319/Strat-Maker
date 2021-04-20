package dashboard.java.model;

public class NodeData
{
	private String path, id, tab;
	private double x, y, angle;
	private double r, g, b, a;

	public NodeData(String path, String id, double x, double y, double angle, String tab, double r, double g, double b, double a)
	{
		this.path = path;
		this.id = id;
		this.x = x;
		this.y = y;
		this.angle = angle;
		this.tab = tab;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double getAngle()
	{
		return angle;
	}

	public void setAngle(double angle)
	{
		this.angle = angle;
	}
	
	public String getTab()
	{
		return tab;
	}

	public void setTab(String tab)
	{
		this.tab = tab;
	}

	public double getRed()
	{
		return r;
	}

	public void setRed(double r)
	{
		this.r = r;
	}

	public double getGreen()
	{
		return g;
	}

	public void setGreen(double g)
	{
		this.g = g;
	}

	public double getBlue()
	{
		return b;
	}

	public void setBlue(double b)
	{
		this.b = b;
	}

	public double getAlpha()
	{
		return a;
	}

	public void setAlpha(double a)
	{
		this.a = a;
	}

	public String toString()
	{
		return "(" + path + ", " + id + ", " + x + ", " + y + ", " + angle + ")";
	}
}
