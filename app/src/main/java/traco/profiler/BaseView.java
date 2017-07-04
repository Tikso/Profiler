package traco.profiler;

import android.support.annotation.StringRes;

/**
 * Created by tikson.tom on 7/3/2017.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);

    void makeToast(@StringRes int stringId);

    void makeToast(String message);
}
