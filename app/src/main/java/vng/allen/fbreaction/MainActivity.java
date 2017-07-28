package vng.allen.fbreaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import vng.allen.fbreaction.widget.ReactionView;

public class MainActivity extends AppCompatActivity {
    View btnLike;

    RelativeLayout root;

    ReactionView rvl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLike = findViewById(R.id.btn_like);
        root = (RelativeLayout) findViewById(R.id.root);
    }

    public void showReactionView (View view ) {
        rvl = new ReactionView(this);
        root.addView(rvl);
        rvl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == android.view.MotionEvent.ACTION_UP) {
                    root.removeView(rvl);
                    rvl = null;
                }
                return false;
            }
        });
    }
}
