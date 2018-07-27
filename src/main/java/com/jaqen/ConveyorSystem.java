package com.jaqen;

/**
 * Domain object to store conveyor system
 * 
 * @author Kent Fletcher
 * @date 7/12/2018
 *
 */
public class ConveyorSystem
{

	Node startNode;
	Node endNode;
	Long travelTime;

	public Node getStartNode()
	{
		return startNode;
	}

	public void setStartNode(Node n)
	{
		this.startNode = n;
	}

	public Node getEndNode()
	{
		return endNode;
	}

	public void setEndNode(Node n)
	{
		this.endNode = n;
	}

	public Long getTravelTime()
	{
		return travelTime;
	}

	public void setTravelTime(Long travelTime)
	{
		this.travelTime = travelTime;
	}

	public String toString()
	{
		return "[" + startNode + "][" + endNode + "][" + travelTime + "]";
	}
}
