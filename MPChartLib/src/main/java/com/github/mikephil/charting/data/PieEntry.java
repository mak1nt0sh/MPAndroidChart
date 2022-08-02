package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.util.Log;

/**
 * @author Philipp Jahoda
 */
@SuppressLint("ParcelCreator")
public class PieEntry extends Entry {

    private String label;

    private Boolean drawLabel;

    public PieEntry(float value) {
        super(0f, value);
    }

    public PieEntry(float value, Object data) {
        super(0f, value, data);
    }

    public PieEntry(float value, Drawable icon) {
        super(0f, value, icon);
    }

    public PieEntry(float value, Drawable icon, Object data) {
        super(0f, value, icon, data);
    }

    public PieEntry(float value, String label, boolean drawEntry) {
        super(0f, value);
        this.label = label;
        this.drawLabel = drawEntry;
    }

    public PieEntry(float value, String label, boolean drawEntry, Object data) {
        super(0f, value, data);
        this.label = label;
        this.drawLabel = drawEntry;
    }

    public PieEntry(float value, String label, boolean drawEntry, Drawable icon) {
        super(0f, value, icon);
        this.label = label;
        this.drawLabel = drawEntry;
    }

    public PieEntry(float value, String label, boolean drawEntry, Drawable icon, Object data) {
        super(0f, value, icon, data);
        this.label = label;
        this.drawLabel = drawEntry;
    }

    /**
     * This is the same as getY(). Returns the value of the PieEntry.
     *
     * @return
     */
    public float getValue() {
        return getY();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getDrawEntry() {
        return drawLabel;
    }

    public void setDrawEntry(Boolean drawLabel) {
        this.drawLabel = drawLabel;
    }

    @Deprecated
    @Override
    public void setX(float x) {
        super.setX(x);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    @Deprecated
    @Override
    public float getX() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.getX();
    }

    public PieEntry copy() {
        PieEntry e = new PieEntry(getY(), label, drawLabel, getData());
        return e;
    }
}
