package traco.profiler.profilepage;

import traco.profiler.BasePresenter;
import traco.profiler.BaseView;

/**
 * Created by tikson.tom on 7/3/2017.
 */

public interface ProfilepagContractor {
    interface View extends BaseView<Presenter> {
        void setPresenter(ProfilepagContractor.Presenter presenter);

        void setName(String name);

        void setEmail(String email);

        void setInterests(String interests);

        void setBio(String bio);

        void setPhotoUrl(String url);

        void setDefaultPhoto();

        void startPhotoActivity();

        void startDetailActivity();

        void startSettingsActivity();

        void showLogoutSnackBar(boolean show);

        void startLoginActivity();

        void setThumbnailLoadingIndicator(boolean show);

        void setDetailLoadingIndicator(boolean show);

    }

    interface Presenter extends BasePresenter {
        void onThumbNailClick();

        void onEditProfileClick();

        void onLogoutClick();

        void onAccountSettingsClicked();

        void onLogoutConfirmed();

        void onThumbNailLoaded();
    }
}
