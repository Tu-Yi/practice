package com.xiedaimala.spider.model;

import java.util.*;

public class SearchSate {
    private final int maximumResults;

    private Queue<NewsWithRelated> newsQueue = new LinkedList<NewsWithRelated>();
    private int count = 0;
    private Set<String> visited = new HashSet<String>();
    private ArrayList<Viewable> results = new ArrayList<Viewable>();

    public SearchSate(int maxmumResults) {
        this.maximumResults = maxmumResults;
    }

    public synchronized NewsWithRelated poll() {
        return newsQueue.poll();
    }

    public synchronized void addResult(NewsWithRelated result) {
        results.add(result);
        count += 1;
    }

    public synchronized void visit(NewsWithRelated news) {
        if(!visited.contains(news.getUrl())) {
            newsQueue.add(news);
            visited.add(news.getUrl());
        }
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized boolean hasTarget() {
        return !newsQueue.isEmpty() && count < maximumResults;
    }

    public synchronized ArrayList<Viewable> getResults() {
        return results;
    }
}
