package com.hashcode.google;

public class Endpoint {
	int endPointID;
	int latencyToMainDataCenter;
	ConnectedCacheServer[] connectedCacheServers;
	Endpoint(int endPointID, int latencyToMainDataCenter, int numberOfConnectedServers) {
		this.endPointID = endPointID;
		this.latencyToMainDataCenter = latencyToMainDataCenter;
		this.connectedCacheServers = new ConnectedCacheServer[numberOfConnectedServers];
	}
}
