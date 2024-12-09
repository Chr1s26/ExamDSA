package Model;

public class Route {
	
	public int StartStation;
	public int EndStation;
	public int travelTime;
	
	public Route(int StartStation, int EndStation, int travelTime) {
		this.StartStation = StartStation;
		this.EndStation = EndStation;
		this.travelTime = travelTime;
	}
}
