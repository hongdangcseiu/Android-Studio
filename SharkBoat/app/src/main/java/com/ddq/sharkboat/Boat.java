package com.ddq.sharkboat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Boat {
    private int x;
    private int y;
    private Bitmap boatImage;
    private int hits;

    public Boat(Context context, int x, int y) {
        this.x = x;
        this.y = y;
        Bitmap originalImage = BitmapFactory.decodeResource(context.getResources(), R.drawable.boat);
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();
        float scaleFactor = 0.05f; // Change this value to adjust the size of the image
        boatImage = Bitmap.createScaledBitmap(originalImage, (int)(width * scaleFactor), (int)(height * scaleFactor), false);
        hits = 0;
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(boatImage, x, y, null);
    }

    public void hit() {
        hits++;
    }

    public boolean isDestroyed() {
        return hits >= 5;
    }public int getWidth() {
        return boatImage.getWidth();
    }

    public int getHeight() {
        return boatImage.getHeight();
    }
}