package br.ufpe.cin.if710.podcast.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import br.ufpe.cin.if710.podcast.R;

public class EpisodeDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode_detail);

        this.displayEpisodeData(
                getIntent(),
                new HashMap<Integer, String>() {{
                    put(R.id.episode_title, MainActivity.CLICKED_TITLE);
                    put(R.id.episode_description, MainActivity.CLICKED_DESCRIPTION);
                    put(R.id.episode_pubdate, MainActivity.CLICKED_PUBDATE);
                    put(R.id.episode_downloadlink, MainActivity.CLICKED_DOWNLOADLINK);
                }}
        );

    }

    private void displayEpisodeData(Intent intent, HashMap<Integer, String> fieldsMap) {
        for (Map.Entry<Integer, String> field : fieldsMap.entrySet()) {
            TextView textView = findViewById(field.getKey());
            textView.setTextSize(20);
            textView.setText(intent.getStringExtra(field.getValue()));
        }
    }
}
