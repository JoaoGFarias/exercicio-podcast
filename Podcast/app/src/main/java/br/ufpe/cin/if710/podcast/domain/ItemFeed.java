package br.ufpe.cin.if710.podcast.domain;

import android.content.ContentValues;

import br.ufpe.cin.if710.podcast.db.PodcastDBHelper;

public class ItemFeed {
    private final String title;
    private final String link;
    private final String pubDate;
    private final String description;
    private final String downloadLink;


    public ItemFeed(String title, String link, String pubDate, String description, String downloadLink) {
        this.title = title;
        this.link = link;
        this.pubDate = pubDate;
        this.description = description;
        this.downloadLink = downloadLink;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getDescription() {
        return description;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public ContentValues contentValueRepresentation() {
        ContentValues values = new ContentValues();
        values.put(PodcastDBHelper.EPISODE_TITLE, this.getTitle());
        values.put(PodcastDBHelper.EPISODE_LINK, this.getLink());
        values.put(PodcastDBHelper.EPISODE_DATE, this.getPubDate());
        values.put(PodcastDBHelper.EPISODE_DESC, this.getDescription());
        values.put(PodcastDBHelper.EPISODE_DOWNLOAD_LINK, this.getDownloadLink());
        values.put(PodcastDBHelper.EPISODE_FILE_URI, "DUMB");
        return values;
    }

    @Override
    public String toString() {
        return title;
    }
}