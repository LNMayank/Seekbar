package com.example.ln_138.demoseekbar.view.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

import com.example.ln_138.demoseekbar.R;

public class TriangleRectangleTextView extends TextView {

    private static final int DEFAULT_BG_COLOR = 0xff41c7cd;
    private Paint bgPaint;
    private int bgColor = DEFAULT_BG_COLOR;



    public TriangleRectangleTextView(Context context) {
        this(context, null);
    }

    public TriangleRectangleTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TriangleRectangleTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        bgColor = ContextCompat.getColor(context, R.color.colorPopup);
        init();
    }

    private void init() {
        bgPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bgPaint.setStrokeWidth(4);
        bgPaint.setStyle(Paint.Style.FILL);
        bgPaint.setColor(bgColor);
        bgPaint.setAntiAlias(true);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        drawBackgroud(canvas);
        super.onDraw(canvas);
    }


    /**
     * ==a===========b===
     *   =         =
     *   =         =
     * ==g==f     d==c==
     *       =  =
     *        =
     *        e
     * @param canvas
     */
    private void drawBackgroud(Canvas canvas){


        int height = getHeight();
        int width = getWidth();
        int triWidth=getWidth()/5;
        int triHeight=getHeight()/4;
        setPadding(0,0,0,triHeight);


//        final RectF rect = new RectF();
//        bgPaint.setStyle(Paint.Style.FILL);
////
//        rect.set(50, 50, 150, 150);
//        canvas.drawRoundRect(rect, 10, 10, bgPaint);
//
//        rect.set(200, 150, 450, 350);
//        canvas.drawRoundRect(rect, 30, 30, bgPaint);
//
//        bgPaint.setStyle(Paint.Style.FILL);
//        rect.set(200, 400, 450, 600);

        Point a = new Point(0, 0);
        Point b = new Point(width, 0);
        Point c = new Point(width, height - triHeight);
        Point d = new Point((width/2)+triWidth/2, height - triHeight);
        Point e = new Point((width/2), height);
        Point f = new Point((width/2)-triWidth/2, height - triHeight);
        Point g = new Point(0, height - triHeight);

        Path path = new Path();
        path.moveTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(d.x, d.y);
        path.lineTo(e.x, e.y);
        path.lineTo(f.x, f.y);
        path.lineTo(g.x, g.y);

        canvas.drawPath(path, bgPaint);

//        canvas.drawRoundRect(rect, 50, 100, bgPaint);

    }
}
