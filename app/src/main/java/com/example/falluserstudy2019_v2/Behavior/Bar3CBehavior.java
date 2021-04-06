package com.example.falluserstudy2019_v2.Behavior;

import android.graphics.Bitmap;

import com.example.falluserstudy2019_v2.Activities.SlideActivity;
import com.example.falluserstudy2019_v2.Controller.Event;
import com.example.falluserstudy2019_v2.Controller.SlideController;
import com.example.falluserstudy2019_v2.Polygons.Bar3CPolygons;
import com.example.falluserstudy2019_v2.R;

public class Bar3CBehavior extends SlideBehaviorPolygon {

    public Bar3CBehavior(SlideController sc) {
        super(R.drawable.bar3ce, sc);
    }

    @Override
    public void drawPolygons(SlideActivity sa) {
//         Bar3CPolygons poly = new Bar3CPolygons();
//         sa.drawPolygon(poly.BAR_1);
//         sa.drawPolygon(poly.TOP_BAR_1);
//         sa.drawPolygon(poly.BAR_2);
//         sa.drawPolygon(poly.TOP_BAR_2);
//         sa.drawPolygon(poly.BAR_3);
//         sa.drawPolygon(poly.TOP_BAR_3);
//         sa.drawPolygon(poly.ONEHUNDRED_LINE);
//         sa.drawPolygon(poly.SEVENTYFIVE_LINE);
//         sa.drawPolygon(poly.FIFTY_LINE);
//         sa.drawPolygon(poly.TWENTYFIVE_LINE);
//         sa.drawPolygon(poly.ZERO_LINE);
    }

    // EMBOSSED RENDERING
    @Override
    public void tapReaction(int x, int y, Bitmap bitmap, SlideActivity sa) {
    }

    @Override
    public void touchReaction(int x, int y, Bitmap bitmap, SlideActivity sa, String action) {
    }

    // TOUCHSCREEN RENDERING
//    @Override
//    public void tapReaction(int x, int y, Bitmap bitmap, SlideActivity sa) {
//        int width = bitmap.getWidth();
//        String action = Event.ACTION_TAP;
//
//        Bar3CPolygons poly = new Bar3CPolygons();
//
//        if (poly.inPolygon(poly.BAR_1, x, y, width)) {
//            String s = "Bar 1";
//            sc.reactTapReadAgain(x, y, sa, s);
//        }
//        else if (poly.inPolygon(poly.TOP_BAR_1, x, y, width)) {
//            String s = "Top of Bar 1";
//            sc.reactTapReadAgain(x, y, sa, s);
//        }
//        else if (poly.inPolygon(poly.BAR_2, x, y, width)) {
//            String s = "Bar 2";
//            sc.reactTapReadAgain(x, y, sa, s);
//        }
//        else if (poly.inPolygon(poly.TOP_BAR_2, x, y, width)) {
//            String s = "Top of Bar 2";
//            sc.reactTapReadAgain(x, y, sa, s);
//        }
//        else if (poly.inPolygon(poly.BAR_3, x, y, width)) {
//            String s = "Bar 3";
//            sc.reactTapReadAgain(x, y, sa, s);
//        }
//        else if (poly.inPolygon(poly.TOP_BAR_3, x, y, width)) {
//            String s = "Top of Bar 3";
//            sc.reactTapReadAgain(x, y, sa, s);
//        }
//        else if (poly.inPolygon(poly.ZERO_LINE, x, y, width)) {
//            String s  = "0 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.TWENTYFIVE_LINE, x, y, width)) {
//            String s  = "25 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.FIFTY_LINE, x, y, width)) {
//            String s  = "50 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.SEVENTYFIVE_LINE, x, y, width)) {
//            String s  = "75 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.ONEHUNDRED_LINE, x, y, width)) {
//            String s  = "100 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//    }
//
//    @Override
//    public void touchReaction(int x, int y, Bitmap bitmap, SlideActivity sa, String action) {
//        int width = bitmap.getWidth();
//
//        Bar3CPolygons poly = new Bar3CPolygons();
//
//        if (poly.inPolygon(poly.BAR_1, x, y, width)) {
//            String sAdd = "in Bar 1";
//            if (!handleGrids(sAdd, x, y, bitmap, width, poly, sa, action)) {
//                String s = "Bar 1";
//                sc.reactAreaThenLineBargraphNoRepeat(x, y, bitmap, sa, action, s);
//            }
//        }
//        else if (poly.inPolygon(poly.TOP_BAR_1, x, y, width)) {
//            String sAdd = "top of Bar 1";
//            if (!handleGrids(sAdd, x, y, bitmap, width, poly, sa, action)) {
//                String s = "Top of Bar 1";
//                sc.reactAreaThenLineBargraphNoRepeat(x, y, bitmap, sa, action, s);
//            }
//        }
//        else if (poly.inPolygon(poly.BAR_2, x, y, width)) {
//            String sAdd = "in Bar 2";
//            if (!handleGrids(sAdd, x, y, bitmap, width, poly, sa, action)) {
//                String s = "Bar 2";
//                sc.reactAreaThenLineBargraphNoRepeat(x, y, bitmap, sa, action, s);
//            }
//        }
//        else if (poly.inPolygon(poly.TOP_BAR_2, x, y, width)) {
//            String sAdd = "top of Bar 2";
//            if (!handleGrids(sAdd, x, y, bitmap, width, poly, sa, action)) {
//                String s = "Top of Bar 2";
//                sc.reactAreaThenLineBargraphNoRepeat(x, y, bitmap, sa, action, s);
//            }
//        }
//        else if (poly.inPolygon(poly.BAR_3, x, y, width)) {
//            String sAdd = "in Bar 3";
//            if (!handleGrids(sAdd, x, y, bitmap, width, poly, sa, action)) {
//                String s = "Bar 3";
//                sc.reactAreaThenLineBargraphNoRepeat(x, y, bitmap, sa, action, s);
//            }
//        }
//        else if (poly.inPolygon(poly.TOP_BAR_3, x, y, width)) {
//            String sAdd = "top of Bar 3";
//            if (!handleGrids(sAdd, x, y, bitmap, width, poly, sa, action)) {
//                String s = "Top of Bar 3";
//                sc.reactAreaThenLineBargraphNoRepeat(x, y, bitmap, sa, action, s);
//            }
//        }
//        else if (poly.inPolygon(poly.ZERO_LINE, x, y, width)) {
//            String s = "0 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.TWENTYFIVE_LINE, x, y, width)) {
//            String s = "25 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.FIFTY_LINE, x, y, width)) {
//            String s = "50 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.SEVENTYFIVE_LINE, x, y, width)) {
//            String s = "75 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else if (poly.inPolygon(poly.ONEHUNDRED_LINE, x, y, width)) {
//            String s = "100 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//        }
//        else {
//            sc.reactAreaThenLineBargraphNoSpeak(x, y, bitmap, sa, action);
//        }
//    }
//
//    private boolean handleGrids(String sAdd, int x, int y, Bitmap bitmap, int width, Bar3CPolygons poly, SlideActivity sa, String action) {
//        if (poly.inPolygon(poly.ZERO_LINE, x, y, width)) {
//            String s = "0 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//            return true;
//        }
//        else if (poly.inPolygon(poly.TWENTYFIVE_LINE, x, y, width)) {
//            String s = "25 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//            return true;
//        }
//        else if (poly.inPolygon(poly.FIFTY_LINE, x, y, width)) {
//            String s = "50 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//            return true;
//        }
//        else if (poly.inPolygon(poly.SEVENTYFIVE_LINE, x, y, width)) {
//            String s = "75 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//            return true;
//        }
//        else if (poly.inPolygon(poly.ONEHUNDRED_LINE, x, y, width)) {
//            String s = "75 percent";
//            sc.reactGridLine(x, y, bitmap, sa, action, s);
//            return true;
//        }
//        return false;
//    }
}
