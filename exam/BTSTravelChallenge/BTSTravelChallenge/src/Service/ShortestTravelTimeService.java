package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Model.Route;

public class ShortestTravelTimeService {
	
	public static Route[] routes;
	public static BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
	public static int minMinute = 100;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		getInformation();
	}
	
	public static void getInformation() throws NumberFormatException, IOException {
		int i = 0;
		System.out.print("Enter the number of station !");
		int n = Integer.parseInt(bufferReader.readLine());
		System.out.print("Enter the number of tracks!");
		int m = Integer.parseInt(bufferReader.readLine());
		routes = new Route[m];
		
		while(i != m) {
			System.out.print("Enter the start station");
			int u = Integer.parseInt(bufferReader.readLine());
			System.out.print("Enter the end staion");
			int v = Integer.parseInt(bufferReader.readLine());
			System.out.print("Enter the travel time");
			int t = Integer.parseInt(bufferReader.readLine());
			Route route = new Route(u,v,t);
			routes[i] = route;
			i++;
		}
		
		System.out.print("Enter the start station");
		int s = Integer.parseInt(bufferReader.readLine());
		System.out.print("Enter the destination station");
		int d = Integer.parseInt(bufferReader.readLine());
		
		findShortestTime(s,d,0);
		
		System.out.print("Shortest Travel Time "+minMinute);
		
	}
	
	public static void findShortestTime(int s, int d,int totalTime) {
		
		for(int i = 0; i < routes.length; i++) {
			
			if(routes[i].StartStation == s) {
				
				if(routes[i].EndStation == d) {
					totalTime += routes[i].travelTime;
					if(totalTime < minMinute) {
						minMinute = totalTime;
						totalTime = 0;
					}
				}
				else {
					findShortestTime(routes[i].EndStation,d,totalTime + routes[i].travelTime);
				}
			}
		}
		
	}
}
