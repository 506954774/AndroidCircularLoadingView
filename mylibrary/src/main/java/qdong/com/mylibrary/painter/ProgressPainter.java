package qdong.com.mylibrary.painter;


/**
 * @author Adrián García Lomas
 */
public interface ProgressPainter extends Painter {

    void setMax(float max);

    void setMin(float min);

    void setValue(float value);

}
