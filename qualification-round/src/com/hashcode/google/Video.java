package com.hashcode.google;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Video {
	int videoID;
	int size;
	double value;
	int cacheServerID;
	HashSet<Integer> relevantCacheServers;
	List<Integer> relevantRequests;
	Video(int videoID, int size) {
		this.videoID = videoID;
		this.size = size;
		this.value = 0;
		this.cacheServerID = -1;
		this.relevantCacheServers = new HashSet<>();
		this.relevantRequests = new ArrayList<>();
	}
}
