package y2k.budget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;
import android.widget.ImageButton;

public class TileLayout extends ImageButton {
  public TileLayout(Context context) {
    super(context);
  }

  public TileLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public TileLayout(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int originalWidth = MeasureSpec.getSize(widthMeasureSpec);
    int originalHeight = MeasureSpec.getSize(heightMeasureSpec);
    GridLayout grid = (GridLayout)getParent();

    int side = Math.min(originalWidth / grid.getColumnCount(), originalHeight / grid.getRowCount());
    super.onMeasure(
      MeasureSpec.makeMeasureSpec(side, MeasureSpec.EXACTLY),
      MeasureSpec.makeMeasureSpec(side, MeasureSpec.EXACTLY));
  }
}
