package jp.ac.jec.a16cm0209.demoanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnFadeIn, btnFadeOut, btnZoomIn, btnZoomOut,
            btnRepeat, btnMove, btnBack, btnRotate,
            btnMoveUp, btnMoveDown, btnSequence, btnSameTime;
    ImageView imgView;
    Animation amin_FadeIn, amin_FadeOut, amin_ZoomIn, amin_ZoomOut,
            amin_Repeat, amin_Move, amin_Back, amin_Rotate,
            amin_MoveUp, amin_MoveDown, amin_Sequence, amin_SameTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();

        Press();
        Animation();
    }

    private void addControl() {
        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        btnRepeat = (Button) findViewById(R.id.btnRepeat);
        btnMove = (Button) findViewById(R.id.btnMove);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnMoveUp = (Button) findViewById(R.id.btnMoveUp);
        btnMoveDown = (Button) findViewById(R.id.btnMoveDown);
        btnSequence = (Button) findViewById(R.id.btnSequence);
        btnSameTime = (Button) findViewById(R.id.btnSameTime);

        imgView = (ImageView) findViewById(R.id.imgView);
    }

    private void Animation(){
        amin_FadeIn = AnimationUtils.loadAnimation(this, R.anim.amin_fadein);
        amin_FadeOut = AnimationUtils.loadAnimation(this, R.anim.amin_fadeout);
        amin_Repeat = AnimationUtils.loadAnimation(this, R.anim.amin_repeat);
        amin_ZoomIn = AnimationUtils.loadAnimation(this, R.anim.amin_zoomin);
        amin_ZoomOut = AnimationUtils.loadAnimation(this, R.anim.amin_zoomout);
        amin_Move = AnimationUtils.loadAnimation(this, R.anim.amin_move);
        amin_Back = AnimationUtils.loadAnimation(this, R.anim.amin_back);
        amin_Rotate = AnimationUtils.loadAnimation(this, R.anim.amin_rotate);
        amin_MoveUp = AnimationUtils.loadAnimation(this, R.anim.amin_moveup);
        amin_MoveDown = AnimationUtils.loadAnimation(this, R.anim.amin_movedown);
        amin_Sequence = AnimationUtils.loadAnimation(this, R.anim.amin_sequence);
        amin_SameTime = AnimationUtils.loadAnimation(this, R.anim.amin_sametime);
    }

    private void Press(){
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnRepeat.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnMove.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnMoveUp.setOnClickListener(this);
        btnMoveDown.setOnClickListener(this);
        btnSequence.setOnClickListener(this);
        btnSameTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnFadeIn){
            imgView.startAnimation(amin_FadeIn);
        }
        if (v == btnFadeOut){
            imgView.startAnimation(amin_FadeOut);
        }
        if (v == btnRepeat){
            imgView.startAnimation(amin_Repeat);
        }
        if (v == btnZoomIn){
            imgView.startAnimation(amin_ZoomIn);
        }
        if (v == btnZoomOut){
            imgView.startAnimation(amin_ZoomOut);
        }
        if (v == btnMove){
            imgView.startAnimation(amin_Move);
        }
        if (v == btnBack){
            imgView.startAnimation(amin_Back);
        }
        if (v == btnMoveUp){
            imgView.startAnimation(amin_MoveUp);
        }
        if (v == btnMoveDown){
            imgView.startAnimation(amin_MoveDown);
        }
        if (v == btnRotate){
            imgView.startAnimation(amin_Rotate);
        }
        if (v == btnSequence){
            imgView.startAnimation(amin_Sequence);
        }
        if (v == btnSameTime){
            imgView.startAnimation(amin_SameTime);
        }
    }
}
