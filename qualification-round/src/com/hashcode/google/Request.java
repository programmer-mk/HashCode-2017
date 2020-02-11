package com.hashcode.google;

public class Request {
	int requestID;
	int videoID;
	int endPointID;
	int number;
	Request(int requestID, int videoID,int endPointID, int number) {
		this.requestID = requestID;
		this.videoID = videoID;
		this.endPointID = endPointID;
		this.number = number;
	}
}
