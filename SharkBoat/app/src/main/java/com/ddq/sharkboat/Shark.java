package com.ddq.sharkboat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.ddq.sharkboat.R;

import java.util.Random;

public class Shark {
    private int x;
    private int y;
    private Bitmap sharkImage;

    public Shark(Context context, int x, int y) {
        this.x = x;
        this.y = y;
        Bitmap originalImage = BitmapFactory.decodeResource(context.getResources(), R.drawable.shark);
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        float scaleFactor = 0.05f; // Change this value to adjust the size of the image
        sharkImage = Bitmap.createScaledBitmap(originalImage, (int)(width * scaleFactor), (int)(height * scaleFactor), false);
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(sharkImage, x, y, null);
    }

    public void move() {
        // Move the shark in a random direction
    }
    public int getWidth() {
        return sharkImage.getWidth();
    }

    public int getHeight() {
        return sharkImage.getHeight();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}